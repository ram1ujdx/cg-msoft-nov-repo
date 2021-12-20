## How to run an image?

* Step 1 - Pull the Image
* Step 2 - Run the image as a container

__Example__
- Running the covid-info image

```bash

docker pull ram1uj/covid-info

docker run -p 80:80 -d --name covid-info-app ram1uj/covid-info


```

## How to run Spring Boot Application on Docker

* Step 1 -

Create a Dockerfile

ex -

```dockerfile 

FROM adoptopenjdk/openjdk11
WORKDIR /
ADD employee-jpa-rest-api-0.0.1-SNAPSHOT.jar employee-jpa-rest-api-0.0.1-SNAPSHOT.jar
CMD java -jar employee-jpa-rest-api-0.0.1-SNAPSHOT.jar

```


* Step 2 -

Build the Docker Image

```bash

docker build -t employee-app .

```

* Step 3 -

Run the image

```bash

docker run -p 5000:5000 -d --name employee-app employee-app

```


## How to run Spring Boot App with MySql backend

* Step 1 - 

Create a docker network

```bash

docker network create cg-mysql-network

```

* Step 2 -

Run MySql container on that network

```bash

docker run -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=cg_db --network cg-mysql-network --name mysql mysql

```

* Step 3 -

Run Spring Boot App on the same network

```bash

docker run -p 5000:5000 --network=cg-mysql-network -e RDS_HOSTNAME=mysql -e RDS_PORT=3306 -e RDS_DB_NAME=cg_db -e RDS_USER=root -e RDS_PASSWORD=password --name employee-app -d employee-app

```

__All env variables are mentioned in the application.properties file of the spring boot application__

## Docker Voilume to persist data

* Step 1 - Create a docker volume

```bash

docker volume create cg-data-volume

```

* Step 2 -
Attaching volume to mysql

```

docker run -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=cg_db --volume=cg-data-volume:/var/lib/mysql  --network cg-mysql-network --name mysql -d mysql


```

## Using Docker Compose to run multi-container application

* Step 1 - create docker-compose.yml file


```yml

version: '3.7'
services:
  mysql:
    image: mysql
    command: --default-authentication-plugin=mysql_native_password
    ports:
      - "3306:3306"
    restart: always
    environment:
      MYSQL_ROOT_PASSWORD: password
      MYSQL_DATABASE: cg_db
    # volumes:
    #   - mysql-db-volume:/var/lib/mysql
    networks:
      - employee-app-network


  employee-app:
    image: employee-app
    #build:
      #context: .
      #dockerfile: Dockerfile
    ports:
      - "5000:5000"
    restart: always
    depends_on: # Start the depends_on first
      - mysql 
    environment:
      RDS_HOSTNAME: mysql
      RDS_PORT: 3306
      RDS_DB_NAME: cg_db
      RDS_USERNAME: root
      RDS_PASSWORD: password
    networks:
      - employee-app-network


networks:
  employee-app-network:

  ```


* Step 2 - Install Docker-compose

__Installing Docker-compose on EC2:__

```bash
sudo curl -L "https://github.com/docker/compose/releases/download/1.29.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose


sudo chmod +x /usr/local/bin/docker-compose

sudo ln -s /usr/local/bin/docker-compose /usr/bin/docker-compose

```

* Step 3 - Commands to strat and stop the containers -

```bash

docker-compose up

```


### Important Docker Compose Commands

* Docker-compose Configuration

```bash
docker-compose config
```

* Docker-Compose Images Used

```bash
docker-compose images
```


* Docker-Compose Pause, Resume, Stop, Kill 

```bash
docker-compose pause
docker-compose unpause
docker-compose stop
docker-compose kill

```
