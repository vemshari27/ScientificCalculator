FROM tomcat:9.0.43
LABEL maintainer="vemuru.srihari@iiitb.org"
ADD target/ScientificCalculator-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]

