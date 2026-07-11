set -e
javac -Xdiags:verbose -d build src/*.java
jar -cfe leet_637.jar Main -C build .
java -jar leet_637.jar
