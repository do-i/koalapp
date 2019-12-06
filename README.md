### Sample app with Tomcat 8.5 on Docker

##### Start
Starts tomcat 8.5 container
```sh
bin/start.sh
```

##### Build
```
bin/build.sh
```

##### Deploy
```
bin/deploy.sh

```
##### Request
```
curl -s localhost:8080/app
```

### Note
##### Build and Deploy
```
bin/bd.sh
```

##### Peek inside the container
open shell on the last created container.

```
docker exec -it $(docker container ls -qn 1) bash
```
* `-i` is interactive
* `-t` is for tty

### Nexus on Docker

    mkdir /tmp/docker/nexus-data
    docker run -d -p 8081:8081 --name nexus -v /tmp/docker/nexus-data:/nexus-data sonatype/nexus3

### Release

    mvn clean install release:clean

    mvn release:prepare

    mvn release:perform -Darguments="-Dmaven.javadoc.skip=true"
