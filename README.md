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