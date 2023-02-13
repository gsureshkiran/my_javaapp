FROM tomcat:9-jdk11-adoptopenjdk-hotspot
WORKDIR /usr/local/tomcat/webapps
RUN su - jenkins
COPY /workspace/java/webapp/target/webapp.war /usr/local/tomcat/webapps/webapp.war
RUN chmod -R 755 /usr/local/tomcat/webapps/webapp.war