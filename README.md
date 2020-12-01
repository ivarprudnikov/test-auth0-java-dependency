https://github.com/auth0/auth0-java/issues/324
==============================================

[![Java CI with Gradle](https://github.com/ivarprudnikov/test-auth0-java-dependency/workflows/Java%20CI%20with%20Gradle/badge.svg)](https://github.com/ivarprudnikov/test-auth0-java-dependency/actions)

An example of a failing dependency resolution when using `com.auth0:auth0:1.25.0` along with 
gradle plugins: `org.springframework.boot` and `io.spring.dependency-management`

Clone the repo, set appropriate java version and run:

```
$ ./gradlew run --stacktrace
```

Which will fail with 

```
Exception in thread "main" java.lang.NoSuchMethodError: 'okhttp3.RequestBody okhttp3.RequestBody.create(byte[], okhttp3.MediaType)'
        at com.auth0.net.CustomRequest.createRequestBody(CustomRequest.java:50)
        at com.auth0.net.ExtendedBaseRequest.createRequest(ExtendedBaseRequest.java:49)
        at com.auth0.net.BaseRequest.execute(BaseRequest.java:29)
        at hello.HelloWorld.main(HelloWorld.java:14)
```