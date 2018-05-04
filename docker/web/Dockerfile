FROM gradle:4.7-jdk8-alpine
ADD --chown=gradle . /app
WORKDIR /app
CMD gradle --stacktrace clean bootRun