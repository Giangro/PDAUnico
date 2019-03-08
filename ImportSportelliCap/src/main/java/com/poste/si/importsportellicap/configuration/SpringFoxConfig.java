/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poste.si.importsportellicap.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.mchange.v2.c3p0.DataSources;
import org.sqlite.*;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import javax.annotation.Resource;
import javax.sql.DataSource;

import java.util.Collections;

/**
 *
 * @author Alex
 */
@Configuration
@EnableSwagger2
@ComponentScan("com.poste.si.importsportellicap")
public class SpringFoxConfig {

    private static final String PROPERTY_NAME_DATABASE_DRIVER = "sqlite.driver";
    private static final String PROPERTY_NAME_DATABASE_USERNAME = "sqlite.user";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "sqlite.password";
    private static final String PROPERTY_NAME_DATABASE_URL = "sqlite.url";
    
    @Resource
    private Environment env;
    
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "BE MLP",
                "Import Anag REST API",
                "API TOS",
                "Terms of service",
                new Contact("Pietro Sordillo", "www.poste.it", "pietro.sordillo@posteitaliane.it"),
                "License of API",
                "API license URL",
                Collections.emptyList());
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * SwaggerUI information
     */
    @Bean
    UiConfiguration uiConfig() {
        return UiConfigurationBuilder.builder()
                .deepLinking(true)
                .displayOperationId(false)
                .defaultModelsExpandDepth(1)
                .defaultModelExpandDepth(1)
                .defaultModelRendering(ModelRendering.EXAMPLE)
                .displayRequestDuration(false)
                .docExpansion(DocExpansion.NONE)
                .filter(false)
                .maxDisplayedTags(null)
                .operationsSorter(OperationsSorter.ALPHA)
                .showExtensions(false)
                .tagsSorter(TagsSorter.ALPHA)
                .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
                .validatorUrl(null)
                .build();
    }
    
    @Bean(destroyMethod = "close")
    public DataSource dataSource() throws PropertyVetoException, SQLException {
       
        // configure SQLite
        SQLiteConfig config = new org.sqlite.SQLiteConfig();
        config.setReadOnly(true);
        config.setPageSize(4096); //in bytes
        config.setCacheSize(2000); //number of pages
        config.setSynchronous(SQLiteConfig.SynchronousMode.OFF);
        config.setJournalMode(SQLiteConfig.JournalMode.OFF);
                
        // get an unpooled SQLite DataSource with the desired configuration
        String url = env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL);
        SQLiteDataSource unpooled = new SQLiteDataSource( config );
        unpooled.setUrl(url);

        //logger.debug("Database URL:"+url);
        
        // get a pooled c3p0 DataSource that wraps the unpooled SQLite DataSource
        DataSource dataSource = DataSources.pooledDataSource( unpooled );
        
        return dataSource;
    }

}
