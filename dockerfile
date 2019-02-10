FROM tomcat:9.0.16-jre11
COPY ./my-app.war /usr/local/tomcat/webapps/myapp.war
