# campus-parser-sbpstu

Парсер проекта Campus для расписания
вуза [Санкт-Петербургский политехнический университет Петра Великого](https://www.spbstu.ru)

## Setup

Для запуска на локальной машине требуется:

1. Наличие [JDK 11](https://jdk.java.net) или выше
2. Создать файл `local.properties`, содержащий конфигурацию для подключения к GitHub Packages

### local.properties

Содержимое файла:

```properties
gpr.user=USERNAME
gpr.key=TOKEN
```

Вместо `USERNAME` нужно написать свой GitHub username (например alex009 у https://github.com/Alex009).  
Вместо `TOKEN` нужно написать свой Personal access token с правами `read:packages`). Управление токенами происходит
на [этой странице](https://github.com/settings/tokens). Нужен `classic` token, с правами `read:packages`.

пример:

```properties
gpr.user=alex009
gpr.key=ghp_0yxNpHnnP3H2KxUTJbbqzZNufXWk2C9U3NQz
```

## Development

Для проверки что все корректно настроено можно запустить задачу build:

- Windows - `gradlew.bat build`
- Unix/MacOS - `./gradlew build`

В результате выполнения увидите `BUILD SUCCESSFUL` - значит проект скомпилировался и успешно запустил все тесты.

Для разработки рекомендуется использовать [IntelliJ IDEA](https://www.jetbrains.com/idea/) (подойдет и Community
Edition). В ней есть все интеграции с Kotlin и Gradle.

Проект написан на языке [Kotlin](https://kotlinlang.org).

Описание как делаются парсеры доступно в ридми [parser-sdk](https://github.com/campus-mobile/campus-parser-kotlin-sdk).

Важно, что при изменении парсера, нужно проверять работу через тесты (примеры в `src/test`) - таким образом можно
отладить работу парсера на разных расписаниях.

Для выполнения доработок нужно создать ветку в git со своим именем и вести доработки в ней. Когда доработки завершены
на GitHub нужно создать Pull Request из вашей ветки в develop. GitHub проведет автоматические проверки, а позже и
человек проведет code review. После всех необходимых доработок ветка будет слита в develop, а дальше и опубликована
на сервер парсеров, где начнет свою работу.   
