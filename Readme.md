## Тестовое задание "Кредитный калькулятор" с использованием Spring-boot и Vue

1. [Само задание](doc/testjob.pdf)
1. [Опыт коллеги](https://habr.com/ru/post/467161/)
> В конце статьи [__Полезные ссылки__](https://habr.com/ru/post/467161/#Links
>) по авторизации, docker и пр. Много интересного. 

Использованы Spring Boot (v2.2.4), [__Vue__](https://ru.vuejs.org), [Vuetify](https://vuetifyjs.com)

#### Цель

Сделать приложение, содержащее SPA-клиент на Vue и backend на Spring Boot.
При этом разместить в одном maven проекте должны быть расположены и frontend
 и backend. 
 
#### Запуск

```shell script
git clone https://github.com/cherepakhin/calculator-vue.git
cd calculator-vue
mvn spring-boot:run
```

Проверить работу по адресу http://localhost:8080
