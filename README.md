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
