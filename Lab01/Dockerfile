# Base image from which we are building
FROM openjdk:14-jdk-alpine

# Copy files in current directory to directoy in image
COPY . /usr/src/httpc
WORKDIR /usr/src/httpc

# Run script that compiles and runs the java program
ENTRYPOINT ["start.sh"]
