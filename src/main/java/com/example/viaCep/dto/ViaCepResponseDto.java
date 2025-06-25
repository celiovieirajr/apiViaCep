package com.example.viaCep.dto;


public class ViaCepResponseDto {

    private String cep;
    private String logradouro;
    private String localidade;

    public ViaCepResponseDto() {
        this.cep = cep;
        this.logradouro = logradouro;
        this.localidade = localidade;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }
}
