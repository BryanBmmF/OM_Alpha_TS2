#! /bin/bash 
echo "STARTING JFLEX COMPILING"
java -jar JFlex/jflex-full-1.8.1.jar Lexico.jflex
java -jar JFlex/jflex-full-1.8.1.jar Lexico2.jflex

echo "STARTING CUP COMPILING"
java -jar Cup/java-cup-11b.jar -parser parser1 -symbols sym1 Sintactico.cup
java -jar Cup/java-cup-11b.jar -parser parser2 -symbols sym2 Sintactico2.cup
