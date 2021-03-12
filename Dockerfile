FROM openjdk:8
COPY ./target/Devops-Calc-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Devops-Calc-1.0-SNAPSHOT.jar", "Calculator"]
