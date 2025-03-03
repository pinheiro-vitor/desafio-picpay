PicPay Simplificado - API de Pagamentos
Este projeto é uma implementação simplificada do PicPay, permitindo depósitos e transferências de dinheiro entre usuários. Ele foi desenvolvido em Java utilizando o Spring Boot.

📌 Funcionalidades
Cadastro de usuários (comuns e lojistas) com Nome Completo, CPF/CNPJ, e-mail e senha;

Transferência de dinheiro entre usuários comuns e de usuários comuns para lojistas;

Validação de saldo antes da transferência;

Consulta a um serviço externo para autorização da transferência;

Notificação do recebedor via um serviço externo;

Transações seguras, garantindo rollback em caso de falhas.


🚀 Tecnologias Utilizadas
- Java

- Spring Web

- Spring Data JPA

- H2 Database
(banco de dados em memória, mais praticidade)

- Lombok

▶️ Executando a API

1. Clone o repositório:
git clone https://github.com/seu-usuario/desafio-picpay.git
cd desafio-picpay


2. Compile e rode o projeto:
mvn spring-boot:run


3. A API estará disponível em http://localhost:8080.

# PicPay Simplificado - API de Pagamentos

Este projeto é uma implementação simplificada do PicPay, permitindo depósitos e transferências de dinheiro entre usuários. Ele foi desenvolvido em **Java** utilizando o **Spring Boot**.

## 📌 Funcionalidades
- Cadastro de usuários (comuns e lojistas) com Nome Completo, CPF/CNPJ, e-mail e senha;
- Transferência de dinheiro entre usuários comuns e de usuários comuns para lojistas;
- Validação de saldo antes da transferência;
- Consulta a um serviço externo para autorização da transferência;
- Notificação do recebedor via um serviço externo;
- Transações seguras, garantindo rollback em caso de falhas.

## 🚀 Tecnologias Utilizadas
- **Java**
- **Spring Boot**
- **Spring Data JPA**
- **H2 Database**
- **Lombok**


### ▶️ Executando a API
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/picpay-simplificado.git
   cd picpay-simplificado
   ```
2. Compile e rode o projeto:
   ```sh
   mvn spring-boot:run
   ```
3. A API estará disponível em `http://localhost:8080`.

## 🔄 Endpoints Principais
### 📌 Criar um Usuário
```http
POST /users
```
**Exemplo de JSON:**
```json
{
  "firstName": "João",
  "LastName": "Silva",
  "document": "12345678901",
  "email": "joao@email.com",
  "password": "123456",
  "balance" 1000,
  "userType": "COMMON"
}
```

### 📌 Mostrar todos os Usuários
```http
GET /users
```
**Exemplo de JSON:**
```json
{
  "id": 1,
  "firstName": "João",
  "LastName": "Silva",
  "document": "12345678901",
  "email": "joao@email.com",
  "password": "123456",
  "balance" 1000,
  "userType": "COMMON"
}
```

### 💰 Transferência entre Usuários
```http
POST /transactions
```
**Exemplo de JSON:**
```json
{
  "senderId": 1,
  "receiverId": 4,
  "value": 100
}
```
Essa operação:
- Verifica se o pagador tem saldo suficiente;
- Consulta o serviço autorizador externo (`https://util.devi.tools/api/v2/authorize`);
- Efetua a transferência de forma transacional;
- Notifica o recebedor (`https://util.devi.tools/api/v1/notify`).



## 📜 Licença
Este projeto é apenas para fins educacionais e não possui uma licença específica.
