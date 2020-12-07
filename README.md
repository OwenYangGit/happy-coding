## 開心寫 code
- 2020/11/11 目前只有在寫 JAVA ~ :smiley:

### Maven 3.6.1 與 OpenJDK-8 環境 , 製作 docker 可攜帶開發環境
- 啟用環境
```
docker run -d --name my-java-dev -p 8080:8080 -p 80:5000 -v $(pwd)/:/root/ -w /root/ hongyuanyang/my-dev:mvn3.6.1-jdk8
```
#### code-server
- [參考網址](https://github.com/cdr/code-server)

#### code-server extensions
- Java Extension Pack
- JDK
- Spring Initializr
- Spring Boot Tools

#### 新的 java 基本語法資源
- [參考網址](https://ethan-imagination.blogspot.com/p/javase.html)
- [良葛格 - JavaSE6 markdown 教材](https://github.com/JustinSDK/JavaSE6Tutorial/tree/master/docs)
- 公司前輩建議的 入門概念閱讀順序
```
MVC > AOP > DI,IOC > SINGLETON > SPRING配置(如何建立SPRING應用，包括如何配置設定檔使其運行) > TOMCAT > SPRINGBOOT
```
#### 新的 spring 好看的語法資源
- [某人的 blog , 以他理解的邏輯去閱讀感覺收穫還滿多的](https://github.com/albert-hg/learning-from-jhipster/tree/master)

#### 預計要讀的專案 code
- [github](https://github.com/alexmanrique/spring-boot-application-example)
