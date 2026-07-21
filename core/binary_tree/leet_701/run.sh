set -e

JAR_NAME=$(basename $PWD).jar

javac -Xdiags:verbose -d build src/*.java
jar -cfe $JAR_NAME Main -C build .
java -jar $JAR_NAME
