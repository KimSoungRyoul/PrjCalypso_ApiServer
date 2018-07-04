package org.givenness.backend.configuration;

import java.io.IOException;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.DateTypeHandler;
import org.apache.ibatis.type.EnumTypeHandler;
import org.apache.ibatis.type.TypeHandler;
import org.givenness.backend.model.member.valueobj.AuthorityType;
import org.givenness.backend.model.member.valueobj.FileType;
import org.givenness.backend.model.member.valueobj.VolunteerType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


public abstract class MyBatisConfig {

  public static final String BASE_PACKAGE_PREFIX = "org.givenness.backend.infrastructure.mapper";

  //public static final String ENTITY_PACKAGE_PREFIX = "org.givenness.backend.model";

  public static final String CONFIG_LOCATION_PATH = "classpath:mybatis/mybatis-config.xml";

  public static final String MAPPER_LOCATIONS_PATH = "classpath:mybatis/mappers/**/*_mapper.xml";

  protected void configureSqlSessionFactory(SqlSessionFactoryBean sessionFactoryBean,
      DataSource dataSource) throws IOException {
    PathMatchingResourcePatternResolver pathResolver = new PathMatchingResourcePatternResolver();
    sessionFactoryBean.setDataSource(dataSource);
    //sessionFactoryBean.setTypeAliasesPackage(ENTITY_PACKAGE_PREFIX);
    sessionFactoryBean.setConfigLocation(pathResolver.getResource(CONFIG_LOCATION_PATH));
    sessionFactoryBean.setMapperLocations(pathResolver.getResources(MAPPER_LOCATIONS_PATH));
    sessionFactoryBean.setTypeHandlers(new TypeHandler[]{new DateTypeHandler(),
        new EnumTypeHandler(FileType.class),
        new EnumTypeHandler(AuthorityType.class),
        new EnumTypeHandler(VolunteerType.class)
    });
    sessionFactoryBean.setVfs(SpringBootVFS.class);

  }
}

@Configuration
@MapperScan(basePackages = MyBatisConfig.BASE_PACKAGE_PREFIX, sqlSessionFactoryRef = "sqlSessionFactory")
class MybatisConfigImpl extends MyBatisConfig {

  @Bean(name = "sqlSessionFactory")
  @Primary
  public SqlSessionFactory userSqlSessionFactory(/*@Qualifier("userDataSource")*/
      DataSource userDataSource) throws Exception {
    SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
    configureSqlSessionFactory(sessionFactoryBean, userDataSource);
    return sessionFactoryBean.getObject();
  }
}
/*

@Configuration
@MapperScan(basePackages = MyBatisConfig.BASE_PACKAGE_PREFIX,  sqlSessionFactoryRef = "paymentSqlSessionFactory")
class PaymentMybatisConfig extends MyBatisConfig {

    @Bean(name = "paymentSqlSessionFactory")
    public SqlSessionFactory paymentSqlSessionFactory(*/
/*@Qualifier("paymentDataSource")*//*
 DataSource paymentDataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        configureSqlSessionFactory(sessionFactoryBean, paymentDataSource);
        return sessionFactoryBean.getObject();
    }
}*/
