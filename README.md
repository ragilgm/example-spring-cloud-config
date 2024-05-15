to change dynamic properties 

1. change properties from application-dev.properties
2. call api http://${host}/actuator/refresh for update changes


encrypt properties 
read this documentation
https://docs.spring.io/spring-cloud-config/reference/server/encryption-and-decryption.html
call api : curl --location 'http://localhost:8088/encrypt' \
--header 'Content-Type: text/plain' \
--header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=04501A5C5146335780FF5C9107522F40' \
--data 'user:/api/user**/**,admin:/api/admin**/**'

if want to save the properties need to add prefix {cipher}


