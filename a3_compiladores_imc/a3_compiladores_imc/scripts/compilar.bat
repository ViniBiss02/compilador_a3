javac -cp ./src/errors; ./src/Calculos.java
move ".\src\*.class" ".\build\"

javac -cp ./build;./bin/java-cup-11b-runtime.jar ./build/Sym.java

javac -cp ./build;./bin/java-cup-11b-runtime.jar ./build/Lexer.java

javac -cp ./build;./bin/java-cup-11b-runtime.jar ./build/Parser.java

javac -cp ./build;./bin/java-cup-11b-runtime.jar ./src/Driver.java
move ".\src\Driver.class" ".\build\"