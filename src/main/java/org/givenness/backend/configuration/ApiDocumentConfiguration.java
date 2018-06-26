package org.givenness.backend.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@EnableAutoConfiguration
//@Import(BeanValidatorPluginsConfiguration.class)
public class ApiDocumentConfiguration {

  @Bean
  public Docket swaggerSpringMvcPlugin() {

    return new Docket(DocumentationType.SWAGGER_2)

        .apiInfo(apiInfo())
        .select()

        .apis(RequestHandlerSelectors.any())
        .paths(PathSelectors.ant("/api/**"))
        //.paths(PathSelectors.any())
        .build();

  }

  private ApiInfo apiInfo() {
    Contact contact = new Contact("칼립소", "https://github.com/KimSoungRyoul/prjArachne_ApiServer",
        "no Mail");
    String license = "본 프로젝트는 Apache2.0 License를 따릅니다.";
    String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";
    String title = "프로보노 ";
    String description = "프로보노 프로젝트 서버 API문서.";

    return new ApiInfoBuilder()
        .contact(contact)
        .license(license)
        .licenseUrl(licenseUrl)
        .title(title)
        .description(description)
        .version("version1.0")
        .termsOfServiceUrl("2018-05-24")

        .build();


  }

}