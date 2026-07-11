set -e
javac -Xdiags:verbose -d build src/*.java
jar -cfe leet_111.jar Main -C build .
java -jar leet_111.jar
