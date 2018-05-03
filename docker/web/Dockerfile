FROM gradle:4.7-jdk8
RUN mkdir /home/gradle/app; mkdir .gradle_new; chmod -R 777 .gradle_new
COPY . /home/gradle/app
VOLUME /home/gradle/app
EXPOSE 8080
WORKDIR /home/gradle/app
CMD gradle --project-cache-dir .gradle_new clean bootRun;
