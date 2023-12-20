java -DFile.Encoding=UTF-8 -jar ./bin/jflex-full-1.9.1.jar --encoding utf-8 -d ./build ./src/lexico.flex

java -DFile.Encoding=UTF-8 -jar ./bin/java-cup-11b.jar -destdir ./build -parser Parser -symbols Sym ./src/sintatico.cup
