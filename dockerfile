FROM openjdk:21-jdk-slim

# Instalar dependências necessárias (se houver)
RUN apt-get update && apt-get install -y maven

# Copiar o código da aplicação
COPY . /app

# Configurar o diretório de trabalho
WORKDIR /app

# Executar o build com Maven (garantindo que o wrapper esteja presente)
RUN ./mvnw clean package

# Expor a porta do Spring Boot (ajuste conforme necessário)
EXPOSE 8080

# Rodar a aplicação
CMD ["java", "-jar", "target/seu-app.jar"]
