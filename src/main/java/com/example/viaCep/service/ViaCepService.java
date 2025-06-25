package com.example.viaCep.service;

import com.example.viaCep.model.ViaCep;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ViaCepService {

    private final WebClient webClient;

//    @Autowired // precisa do Autowired? Preciso declarar o construtor?
    public ViaCepService(WebClient webClient) {
        this.webClient = webClient;
    };

    public Mono<ViaCep> getCepService(String codCep) {
        return webClient
                .get() // o que é método get?
                .uri(codCep + "/json/") // porque preciso passar apenas esse parâmetro do meu uri?
                .retrieve() // o que retrieve? para que serve?
                .bodyToMono(ViaCep.class);  // se for retornado uma String.class como retorno no console?
//                .subscribe(s -> {         // dica da pergunta acima...
//                    System.out.println(s);}
    }

}
