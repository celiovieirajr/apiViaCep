package com.example.viaCep.config;

//import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${api.base.url}")
    private String apiBaseUrl;

    @Bean       //O que é Bean? / Se remove-lo irá funcionar? Porque?
    public WebClient webClient() {
        return WebClient
                .builder()
                .baseUrl(apiBaseUrl)
                .build();
    }

//    public RestTemplate restTemplate() { outra forma de consumir api e usado no Venda+ - Estudar isso e implementar a mesma api com uso do RestTemplate e depois me explica como foi feito.
//        return null;
//    };
}
