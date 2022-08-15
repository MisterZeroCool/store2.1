# store2.1

Проект представляет из себя интернет магазин. Использует такие технологии как: 
SpringFramework
SpringBoot
SpringSecurity
Maven
Html
Css
MySQL
Liquibase
Git

Он состоит из трех главных модулей shop-admin-ui, shop-database, shop-ui. 
shop-admin-ui: 
      -возможность добавления пользователя и назначать ему роль.
      -добавление товара, категорий и брендов.
shop-database:
      -данные о сущностях.
      -для работы с базой данных использовалась библиотека liquibase, она упрощает работу с бд.
shop-ui:
      -отображение на странице пользователя продукции, возможность добавления и удаления из карзины.
Второстепенные модули:

shop-picture-service - модуль отвечающий за картинки 

shop-picture-service-app - создание микросервиса на основе shop-picture-service

spring-cloud-config - предназначен для управления конфигурациями в облачном решении. 
                      Проект предлагает централизованное хранилище конфигураций приложений, которое 
                      легко может масштабироваться горизонтально.
                      
spring-eurece-server -  это приложение, которое содержит информацию обо всех клиентских сервисных приложениях.

spring-gateway - Spring Cloud Gateway принимает входящие внешние запросы, проверяет
                 свои правила маршрутизации и, в случае нахождения подходящего для
                 пришедшего запроса правила, перенаправляет запрос к одному из серви-
                 сов.
                 
Вход

![вход в админку](https://user-images.githubusercontent.com/106084565/184637208-e2ac4de8-df32-4d21-a28f-44d295e56de8.png)

Добавлние пользователя

![Добавлние пользователя](https://user-images.githubusercontent.com/106084565/184638756-ba39c922-2930-4ce8-84ac-2703c498ec6d.png)

Список продуктов с возможностью их редактирования

![Список продуктов](https://user-images.githubusercontent.com/106084565/184638713-1488b62f-d98d-4c7c-96f8-237a3b6a0b4a.png)

Добавление продукта

![Добавление продукта](https://user-images.githubusercontent.com/106084565/184640782-c73d4671-c49b-44a2-9a7d-56ae614a4d18.png)




