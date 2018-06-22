package org.givenness.backend.configuration;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.BooleanTypeHandler;
import org.apache.ibatis.type.DateTypeHandler;
import org.apache.ibatis.type.TypeHandler;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

/**
 * @Configuration
 * 자바소스에서 설정.
 *
 * @MapperScan
 * 하나씩 매퍼를 모두 등록할 필요가 없다. 대신 클래스패스를 지정해서 마이바티스 스프링 연동모듈의 자동스캔기능
 * @Configuration 라고 불리는 스프링의 자바설정을 사용
 */
@Configuration//MyBatis 세팅
@MapperScan(value = "org.givenness.backend.persistence")//DAO Mapper Setting
public class MyBatisConfiguration {

    /**
     * SqlSessionFactory 인스턴스 생성
     * - SqlSessionFactory는 SqlSession을 생성하며 SqlSession은 실제 SQL을 사용하는 객체로써
     *  SQL을 처리하기위해 JDBC드라이버를 사용한다.
     *
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactory=new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);


        Resource[] res=new PathMatchingResourcePatternResolver()
                .getResources("classpath:/mappers/*_mapper.xml");

        //sessionFactory.setEnvironment("dev");

        sessionFactory.setMapperLocations(res);
        sessionFactory.setTypeAliasesPackage("org.givenness.backend.domain");

        sessionFactory.setTypeHandlers(new TypeHandler[] {
                new DateTypeHandler(),
                new BooleanTypeHandler()
        });

        return sessionFactory.getObject();
    }


    /**
     * 마이바티스 {@link org.apache.ibatis.session.SqlSession} 빈을 등록한다.
     *
     * SqlSessionTemplate은 SqlSession을 구현하고 코드에서 SqlSession를 대체하는 역할을 한다.
     * 쓰레드에 안전하게 작성되었기 때문에 여러 DAO나 매퍼에서 공유 할 수 있다.
     */
    @Bean
    public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
