# spring-boot-elk
This project is to demonstrate how to log to the elk environment from a spring boot application by sending the logs via api instead of writing a file

## pre-requisites
1. Docker installed
1. Docker-compose installed
1. All the needed ports must be free (check the ./elk/docker-compose.yml)

## How to try it
1. Go in the elk folder
2. Run docker-compose up -d
3. Wait until all containers have started (check with docker logs -f <container_name>)
4. Start the spring boot application
5. Go to the kibana UI (http://localhost:5601)
6. Go to Stack Management -> Index Patterns -> Create index pattern
7. Add the index with pattern "spring-boot-elk-logs-*"
8. Select the timestamp field and finish
9. Go to Kibana -> Discover
10. Now you're able to see the logs
