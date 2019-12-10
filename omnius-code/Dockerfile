#base java image
FROM openjdk:8-jdk

#store and persist logs for application
VOLUME /logs

#set working directory
WORKDIR /app

#Add files to image - in this case to our working dir
ADD ./target/omnius-code-1.0.0.jar /app/omnius-code-1.0.0.jar

#Application to be exposed on specific port in production - ex :53462
EXPOSE 53462

#This is the main executable of the image
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/omnius-code-1.0.0.jar"]