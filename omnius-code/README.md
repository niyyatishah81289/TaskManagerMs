Task Manager Readme

Tech stack ::
------------
- Java 8
- Springboot
- MongoDB
- Docker


TO BUILD & run locally::
------------------------
- Import code in any ide (eclipse or STS) and update Maven dependencies
- Run as springboot application


API Documentation ::
-------------------
Swagger API Specs - http://localhost:8081/v1


API ENDPOINTS ::
-----------------
> Add Task - POST http://localhost:8081/v1/add  
> Update Task - POST http://localhost:8081/v1/updateTask      
> Delete Task - DELTE http://localhost:8081/v1/delete/{taskId}      
> Get Tasks - GET http://localhost:8081/v1/getAll


Sample TaskDetails JSON ::
--------------------------
{
    "taskId": "T5",                 
    "createdAt": "2019-12-10T21:01:26.495Z",                
    "updatedAt": "2019-11-10T17:33:00.043Z",                  
    "dueDate": "2019-11-29T10:30:23.709Z",                 
    "resolvedAt": "2019-12-20T15:30:23.709Z",                   
    "title": "Test task 3",                
    "description": "Test task 3",                         
    "priority": 4,                     
    "status": "created"                                  
}


Docker Commands ::
--------------------
1. Build image using below command. This will create a docker image with tag 'taskManager' from the docker file at specified path at current location
	- command : docker build -t <path_for_dockerfile>:taskManager .
	
	
2. Run docker container by using below command. 
	- command : docker run -p 53462:8081 -e mongo.hostname=<mongodb-hostname> -e mongo.dbport=<mongodb-port> taskManager

	where
		- p is to expose the services on other port than one configured for local runs
		- e is to override the environment variables at runtime (in this case mongo host and port could be different)
		
