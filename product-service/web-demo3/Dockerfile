FROM openjdk:8-jre
# https://github.com/spotify/dockerfile-maven
# https://github.com/spotify/dockerfile-maven/tree/master/plugin/src/it 案例
# https://github.com/spotify/docker-maven-plugin#internalservererrorexception-http-500-internal-server-error
MAINTAINER Labidc Chen <labidc@gmail.com>
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/myservice.jar"]
# 添加相关包文件
# ADD target/lib           /usr/share/myservice/lib
# pom上配置的环境变量找到对应的服务jar 加入到对应的目录
ARG JAR_FILE
EXPOSE 10002
ADD ${JAR_FILE} /usr/share/myservice/myservice.jar