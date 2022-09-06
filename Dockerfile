FROM debian

RUN apt update
RUN apt -y install default-jre

WORKDIR /opt/calculatrice

COPY target/simple-maven-app-0.0.1-SNAPSHOT.jar ./simple-maven-app-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java"]
CMD ["-cp", "./simple-maven-app-0.0.1-SNAPSHOT.jar", "com.merams.calcul.Calculatrice"]
