FROM gradle:7.4-jdk-alpine
WORKDIR /app
COPY ./ ./
CMD java -jar build/libs/*.jar