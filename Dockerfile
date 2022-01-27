FROM mirrors.tencent.com/openjdk/openjdk:11.0.9.1-jdk

ADD target/spring-coroutine.jar /app/

CMD java ${JAVA_OPTIONS} -jar /app/spring-coroutine.jar