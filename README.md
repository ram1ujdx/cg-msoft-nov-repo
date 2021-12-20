# Docer Important Notes and Commands

## How to run an image?

* Step 1 - Pull the Image
* Step 2 - Run the image as a container

-- Example --
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
