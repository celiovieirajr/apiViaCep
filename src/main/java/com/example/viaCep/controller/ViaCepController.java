package com.example.viaCep.controller;

import com.example.viaCep.dto.ViaCepResponseDto;
import com.example.viaCep.service.ViaCepService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ViaCepController {

    private ViaCepService viaCepService;

    public ViaCepController(ViaCepService viaCepService) {
        this.viaCepService = viaCepService;
    }

    @GetMapping("{codCep}/json/")
    Mono<ViaCepResponseDto> getCep(@PathVariable String codCep) {
        return viaCepService.getCepService(codCep);
    }

}
