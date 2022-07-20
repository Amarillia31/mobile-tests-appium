# Тестовый проект по автоматизации тестирования мобильного приложения Wikipedia. 

## :memo: Содержание:

- [Реализованные проверки](#boom-Реализованные-проверки)
- [Технологии](#classical_building-Технологии)
- [Сборка в Jenkins](#man_cook-Jenkins-job)
- [Запуск из терминала](#electron-Запуск-тестов-из-терминала)
- [Allure отчет](#bar_chart-Allure-отчет)
- [Allure TestOps](#bar_chart-alluretestops)
- [Telegram Notifications](#robot-telegram)
- [Видео пример](#video_camera-Видео)


## :boom: Реализованные проверки

- ✓ Проверки функции поиска
- ✓ Проверка экранов онбординга
- ✓ Проверка текста на стартовом экране
- ✓ Проверка добавления страницы в закладки

## :classical_building: Технологии

<p align="center">
<img width="6%" title="Idea" src="images/logo/Idea.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/Junit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Browserstack" src="images/logo/browserstack-icon.svg">
</p>

## :man_cook: Jenkins job
<img src="images/logo/Jenkins.svg" width="25" height="25"  alt="Jenkins"/></a>  <a target="_blank" href="https://jenkins.autotests.cloud/job/C01-elena_alexandrovna31-MobileUI/">Jenkins job</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/C01-elena_alexandrovna31-MobileUI/"><img src="images/screen/jenkins.png" alt="Jenkins"/></a>
</p>

## :electron: Запуск тестов из терминала

```
gradle clean test -DdeviceHost=local
```

## :bar_chart: Allure-отчет
<img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/C01-elena_alexandrovna31-MobileUI/4/allure/">Allure report</a>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/C01-elena_alexandrovna31-MobileUI/4/allure/"><img src="images/screen/allure1.png" alt="Jenkins"/></a>
</p>
<p align="center">
<a href="https://jenkins.autotests.cloud/job/C01-elena_alexandrovna31-MobileUI/4/allure/"><img src="images/screen/allure2.png" alt="Jenkins"/></a>
</p>

## :bar_chart: AllureTestOps
<img src="images/logo/Allure_TestOps.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://allure.autotests.cloud/project/1487/dashboards">Allure TestOps</a>
<p align="center">
<img src="images/screen/alluretestops1.png" alt="Jenkins"/>
</p>
<p align="center">
<img src="images/screen/alluretestops2.png" alt="Jenkins"/>
</p>

## :robot: Telegram
<img src="images/logo/Telegram.svg" width="25" height="25"  alt="Allure"/></a> Уведомления в Telegram
<p align="center">
<img src="images/screen/Telegram.png" alt="Jenkins"/>
</p>


## :video_camera: Видео
<p align="center">
<img src="/images/screen/7d4be9ebd8c1f29a8a90efcb29c41ed5381734c5.gif" alt="video"/></a>
</p>
