# Workout Builder Application
This application is designed to facilitate the modular creation of workout plans by the end user by
by providing parameterized interface and structured builder to create the workout plans.

## Plan of Action
The plan will include a multiphase plan that aims to make atomic changes for rapid development.

### Phase One
In phase one, we will create a writer trigger that is an asynchronous process and will respond back to 
the end user right away. This will be accomplished using a messaging queue. A writer will then pull the
message of the queue process that information and stuff that data into our cache. From there, an 
API will be exposed to read from the cache and present that data to the User Interface (UI). Lastly, 
we will need a visual user interface to play around with the service. This will be a very basic 
interface and will not include any design concepts.
![Phase One Picture][phase1]

[phase1]: documentation/images/Workout%20Application%20Phase%201.png