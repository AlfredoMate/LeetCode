javac -d build src/*.java
jar -cfe reverseElements.jar Main -C build .
java -jar reverseElements.jar
