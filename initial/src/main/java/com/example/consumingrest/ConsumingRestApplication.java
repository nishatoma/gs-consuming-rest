package com.example.consumingrest;

import com.example.consumingrest.model.Company;
import com.example.consumingrest.model.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {

    // We need to add a few things to the consuming rest application
    // 1) Logger
    // 2) A RestTemplate, which uses Jackson JSON processing library to process
    // incoming data.
    // 3) A CommandLineRunner that runs the RestTemplate  (and therefore, fetches a quotation
    // on startup.

    // Logger
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsumingRestApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
    }

    // Our rest template
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Company company = restTemplate.getForObject("https://random-data-api.com/api/company/random_company",
                    Company.class);
//            if (quote != null) {
                LOGGER.info(company.toString());
//            }
        };
    }

}
