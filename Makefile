default:
	javac -d out src/*.java src/types/*.java src/primitives/*.java
	java -cp out App
