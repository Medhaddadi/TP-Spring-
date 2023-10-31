# Use the official Tomcat image as the base image
FROM tomcat:10-jdk11

# Remove the default Tomcat applications
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the WAR file from the target directory into the Tomcat webapps directory
COPY target/ArchiJEEWSRestTP-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080 for the Tomcat server
EXPOSE 8080

# Start the Tomcat server
CMD ["catalina.sh", "run"]
