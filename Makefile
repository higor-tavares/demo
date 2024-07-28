build-jars:
	./gradlew build

docker-build: build-jars
	docker build --build-arg JAR_FILE=build/libs/\*.jar -t demo-spring .
run: docker-build
	docker-compose up -d

