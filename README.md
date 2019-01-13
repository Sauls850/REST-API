# REST-API

This is a Simple REST API application.

It start with the App class demonstrating the setup Spring Boot setup to get everything launched accorfingly. 
Through the annotation package @SpringBootApplication, this feature imports the package necessary to run Spring Boot followed by our 
main method, SpringApplication.run, along with the parameters of the argument completes the setup to launch the Spring Boot application.

The Controller class is where the REST API is in motion using multiple annotations to execute requests as follows. 
The @RestController is the annotation packaged used to manuever a REST API moving to the inside of the class the @RequestMapping is set up 
to route the request to the designated method. One of the specified methods used in this API is an HTTP protocol GET. This HTTP method 
allows you to retrieve data by request, demonstrated in the parameters of the annotation for @RequestMapping. The "/" confirms 
in communication where the parameter argument is being mapped. The method, public String helloWorld, has the specific argument of
values that the GET method will be processing. Also in the parameters, the annotation RequestParam is the package used to execute values 
created for GET method (value = "name", defaultValue = world). This provides specific value created and if no is created results in the 
default value in the return of the method.

Also we have in the additional method is the annotation @RequestMapping but for another HTTP method called POST also found in the parameters. 
This method is used when entering a body of information for request to be retrieved. @RequestBody is the annotation used to enter the data accordingly 
also found in the parameters of the method for public String helloWorld2. The execution of this method returns "hello" along with 
information requested from the POST method. 




