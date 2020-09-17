# 312275746
# Naveh Marchoom

compile: bin
	javac -cp src -d bin src/Factorial.java src/DescribeNumbers.java src/Sort.java

run1:
	java -cp bin Factorial 5

run2:
	java -cp bin DescribeNumbers 12 2 3 -9 8
	
run3:
	java -cp bin Sort asc 12 2 3 -9 8
	java -cp bin Sort desc 12 2 3 -9 8

bin:
	mkdir bin
 