FROM openjdk:8
COPY ./target/Devops-calc-2.0-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "Devops-calc-2.0-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]
