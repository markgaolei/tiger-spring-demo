package com.tiger.example.spring.v3.importer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Created by Mark
 */
@Configuration
public class ImportConfiguration {

    @Bean
    public ImportService getImportService(){
        return new ImportService();
    }
}
