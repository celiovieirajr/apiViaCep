# ViaCEP API - Consulta de Endereço por CEP

Este projeto é um exemplo simples para desenvolvedores **juniores** aprenderem a consumir APIs públicas utilizando **Spring Boot + WebClient**. Ele realiza uma consulta na [API pública do ViaCEP](https://viacep.com.br) e retorna dados como logradouro, bairro, localidade e UF.

---

## 📦 Estrutura do Projeto

```
viaCep/
├── src/
│   ├── main/
│   │   ├── java/com/example/viaCep/
│   │   │   ├── config/              # Configuração do WebClient
│   │   │   ├── controller/          # Camada REST (ponto de entrada da API)
│   │   │   ├── model/               # Objeto de dados da resposta ViaCEP
│   │   │   ├── service/             # Regras de negócio (chamada externa)
│   │   │   └── ViaCepApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml                         # Dependências do projeto (Maven)
```

---

## ▶️ Como Executar

### ✅ Pré-requisitos:
- Java 17 ou superior
- Maven 3.8+
- IDE recomendada: IntelliJ IDEA ou Eclipse

### 🔧 Passos:

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/viaCep.git
cd viaCep

# Execute o projeto
./mvnw spring-boot:run
```

---

## 🌐 Endpoint da Aplicação

| Método | Endpoint                | Descrição                        |
|--------|-------------------------|----------------------------------|
| GET    | `/cep/{cep}`            | Retorna endereço a partir do CEP |

### Exemplo:

```http
GET http://localhost:8080/cep/01001000
```

**Resposta:**

```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "bairro": "Sé",
  "localidade": "São Paulo",
  "uf": "SP",
  "ibge": "3550308",
  "gia": "1004",
  "ddd": "11",
  "siafi": "7107"
}
```

---

## 🧠 Tecnologias Utilizadas

- Spring Boot
- Spring WebFlux (WebClient)
- Maven
- API Pública ViaCEP

---

## ✅ Funcionalidades

- [x] Consulta de endereço via CEP
- [x] Consumo de API externa com WebClient
- [x] Estrutura simples e didática para iniciantes

---

## 📌 Melhorias Futuras (To-Do)

| Tarefa                                                   | Status  |
|----------------------------------------------------------|---------|
| Criar restando do model                                  | 🔜      |
| Criar DTO para resposta customizada                      | 🔜      |
| Tratar exceções com mensagens amigáveis                  | 🔜      |
| Implementar testes unitários no Service                  | 🔜      |
| Adicionar suporte para múltiplas consultas (lista de CEPs)| 🔜      |

---

## 🔗 Referência

- [ViaCEP - API Gratuita de CEPs](https://viacep.com.br/)
- [Documentação Oficial Spring Boot](https://spring.io/projects/spring-boot)

---

## 👨‍💻 Autor

Desenvolvido por [Célio Junior ].
