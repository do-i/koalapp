#!/usr/bin/env bash

cd ..
mkdir -p volumes/webapps
mkdir -p volumes/logs
docker run \
  -v $(pwd)/volumes/logs:/usr/local/tomcat/logs \
  -v $(pwd)/volumes/webapps:/usr/local/tomcat/webapps \
  --publish 8080:8080 tomcat:8.5.24


