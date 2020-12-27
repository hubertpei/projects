javac -sourcepath src/main/java -d build/classes src/main/java/com/thebestsolar/HelloWorld.java
jar cfm build/jar/HelloWorld.jar src/main/java/com/thebestsolar/HelloWorldManifest -C build/classes .
java -jar build/jar/HelloWorld.jar
