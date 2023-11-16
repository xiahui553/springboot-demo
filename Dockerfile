#FROM lib.iot.sedt.com/ubuntu-java:8
FROM dockerhub.kubekey.local/developer/alpine-java:8
MAINTAINER William
ENV DEBIAN_FRONTEND noninteractive

COPY target/*.jar /ms/app.jar

#COPY src/main/resources/config_prod /ms/config_prod

#COPY setEnvironment.sh /ms/setEnvironment.sh
#RUN chmod +x /ms/setEnvironment.sh


COPY docker-entrypoint.sh /usr/bin/docker-entrypoint.sh
#RUN chmod +x /usr/bin/docker-entrypoint.sh
ENTRYPOINT ["docker-entrypoint.sh"]
