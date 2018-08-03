FROM java:9

MAINTAINER kw

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "beetl-test.jar"]

ADD build/libs/beetl_test1-*.jar beetl-test.jar
