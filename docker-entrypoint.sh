#!/bin/bash
cd /ms  && java $JAVA_OPTS -jar app.jar
exec "$@"
