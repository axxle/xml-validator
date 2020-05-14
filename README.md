# xml-validator
Simple XML Validator for Dev

Сборка проекта:
$: ./gradlew build
При первой сборке скачается дистрибутив gradle, версия берется из gradle/wrapper/gradle-wrapper.properties
Собранный исполняемый jar тут: build/libs/<name>.jar
Какой будет <name> - смотри в build.gradle --> jar : <baseName + version>
Запуск проекта:
$: java -jar <путь до jar>