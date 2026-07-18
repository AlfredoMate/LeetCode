set -e

JAR_NAME=${PWD##*/}.jar

javac -Xdiags:verbose -d build src/*.java
jar -cfe $JAR_NAME Main -C build .
java -jar $JAR_NAME
