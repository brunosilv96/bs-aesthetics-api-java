# BS Aesthetics API

API do sistema de gestão e agendamento para clínicas e profissionais de estética.

O projeto busca centralizar a relação com os clientes, a oferta de serviços e o controle da agenda em uma única solução. A visão contempla uma experiência para o cliente, com consulta de serviços, agendamento e acompanhamento dos horários, e um backoffice para a gestão da empresa, clientes, serviços e agenda.

## Visão Atual

O sistema é pensado para substituir o controle informal de agendamentos e vendas feito principalmente por WhatsApp. A API serve como núcleo da aplicação, organizando as regras e os dados necessários para:

- Gerenciar clientes e seus dados de contato.
- Apresentar serviços, preços e duração.
- Controlar dias e horários de funcionamento.
- Criar, alterar, confirmar e cancelar agendamentos.
- Consultar o histórico de atendimentos.
- Manter a comunicação com o cliente por WhatsApp.

## Tecnologias

- Java 25
- Spring Boot 4
- Spring MVC
- Spring Data JPA e Hibernate
- Spring Security
- Bean Validation
- Flyway
- PostgreSQL
- Maven
- Docker Compose

## Estrutura

```text
src/
├── main/
│   ├── java/       # Código da API
│   └── resources/  # Configurações da aplicação
└── test/           # Testes automatizados
```

Os arquivos `project-discovery.md` e `project-scope.md` registram a descoberta do produto e a visão funcional do sistema.

## Executando localmente

### Pré-requisitos

- Java 25
- Docker e Docker Compose

### Banco de dados

Suba o PostgreSQL definido no projeto:

```bash
docker compose up -d
```

### Aplicação

Execute a API com o Maven Wrapper:

```bash
./mvnw spring-boot:run
```

Por padrão, a aplicação utiliza o PostgreSQL local na porta `5432`, com as configurações definidas em `src/main/resources/application.yaml`.

## Testes

```bash
./mvnw test
```
