# Base image from which we are building
FROM openjdk:14-jdk-alpine

# Copy files in current directory to directoy in image
ENV project_dir /usr/src/httpc
RUN mkdir -p ${project_dir}
COPY . ${project_dir}
WORKDIR ${project_dir}
RUN chmod +x start.sh

# Update PATH
ENV PATH="${PATH}:${project_dir}"

# Run script that compiles and runs the java program
ENTRYPOINT ["/bin/sh", "start.sh"]
