# Writer Trigger

## How to Run the Application
Build JAR with Gradle
```
gradlew.bat build
```
Build Docker Image
```
docker build --tag trigger-writer:latest .
```
Run With Docker
```
docker run --detach --name trigger-writer --publish 8080:8080 trigger-writer:latest
```

## Usage
[Hello World Endpoint](http://localhost:8080/hello)



