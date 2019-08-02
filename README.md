# fizz-buzz-testNew
This service should consume an upper boundry as a path parameter, and determine which numbers would print \"Fizz\", \"Buzz\", and \"FizzBuzz\"

# REST Testing
The service can be tested using URL
http://localhost:8090/fizzbuzz/{limiit}

Replace path param {limit} by an valid integer

# REST Security
If the security parameter is set to true in application.yml, then REST call cannot be made until authorization is successful.

There are two roles defined:

Username : user , Password : user1 and has role {USER}
Username : admin , Password : admin1 and has role {USER,ADMIN}

Authentication token needs to be taken from Tomcat server console and sample token is: bbc8859d-acde-4f0f-8dbb-47b2a79e9bb1

# Actuator
It provides valuable information about health, metrics, info, dump, env, etc.
Accessible at URL:
http://localhost:8091/actuator/index.html#/actuator

# Swagger
API documentation can be accessed at URL:
http://localhost:8090/swagger-ui.html

