# spring-boot-elk
This project is to demonstrate how to log to the elk environment from a spring boot application by sending the logs via api instead of writing a file

## pre-requisites
1. Docker installed
1. Docker-compose installed
1. All the needed ports must be free (check the ./elk/docker-compose.yml)

## How to try it
1. Go in the elk folder
1. Run docker-compose up -d
1. Wait until all containers have started (check with docker logs -f <container_name>)
1. Start the spring boot application
1. Go to the kibana UI (http://localhost:5601)
1. Go to "discover"
1. Add the index with pattern "spring-boot-elk-logs-*"
1. Now you're able to see the logs
