# springboot-actuator

 
## 什么是actuator
actuator是springboot提供的用来检测应用程序健康状态的东西，通过开启它，可以监测运行中的application,包括：

 * 健康 
 * 内存
 * app信息 
 * dump 
 * env 
 * etc. 

## 如何开启

在pom.xml中集成：


    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
        <version>1.4.2.RELEASE</version>
    </dependency>


添加后就会自动集成。

## 访问路径

以下有提供通用的访问端点：

* /health – 显示程序的健康信息， (如连接状态，授权信息，使用内存等).

* /info – 应用配置类属性

* /metrics – 获取应用程序运行过程中用于监控的度量指标，比如：内存信息、线程池信息、HTTP请求统计等。

* /trace：该端点用来返回基本的HTTP跟踪信息。默认情况下，跟踪信息的存储采用org.springframework.boot.actuate.trace.InMemoryTraceRepository实现的内存方式，始终保留最近的100条请求记录。它记录的内容格式如下：



* /dump：该端点用来暴露程序运行中的线程信息。它使用java.lang.management.ThreadMXBean的dumpAllThreads方法来返回所有含有同步信息的活动线程详情。

* /env：该端点与/configprops不同，它用来获取应用所有可用的环境属性报告。包括：环境变量、JVM属性、应用的配置配置、命令行中的参数。

* /beans：该端点用来获取应用上下文中创建的所有Bean



https://docs.spring.io/spring-boot/docs/2.0.0.M6/reference/htmlsingle/#boot-features-security-actuator
 