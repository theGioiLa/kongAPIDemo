complile:
	mvn package

run: clear
	mvn spring-boot:run

clear:
	mvn clean
