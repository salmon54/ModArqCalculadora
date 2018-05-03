
FROM openjdk
WORKDIR /
EXPOSE 7593
COPY ejercicio1.jar /app/ejercicio1.jar
CMD java -jar /app/ejercicio1.jar