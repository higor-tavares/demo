build-java:
	./gradlew build && java -jar build/libs/app.jar

docker-build:
	docker build --build-arg JAR_FILE=build/libs/\*.jar -t higortavares/demo-spring .

