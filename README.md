## `Spring Cloud Sleuth进阶实战`
#### `为什么需要Spring Cloud Sleuth`
    微服务架构是一个分布式架构，它按业务划分服务单元，一个分布式系统往往有很多个服务单元。
    由于服务单元数量众多，业务的复杂性，如果出现了错误和异常，很难去定位。主要体现在，一个
    请求可能需要调用很多个服务，而内部服务的调用复杂性，决定了问题难以定位。所以微服务架构中，
    必须实现分布式链路追踪，去跟进一个请求到底有哪些服务参与，参与的顺序又是怎样的，从而达到
    每个请求的步骤清晰可见，出了问题，很快定位。
    链路追踪组件有Google的Dapper，Twitter 的Zipkin，以及阿里的Eagleeye （鹰眼）等，它们都是非
    常优秀的链路追踪开源组件。本项目是Spring Cloud Sleuth中集成Zipkin
#### `所用技术`
     java 1.8
     springboot 2.0.3
     springcloud Dalston.RELEASE
     mysql
    Twitter Zipkin
#### `项目简介`
    案例一共四个工程采用多Module形式，包含了eureka-server工程，作为服务注册中心，
    eureka-server的创建过程这里不重复；
    zipkin-server作为链路追踪服务中心，负责存储链路数据；
    gateway-service作为服务网关工程，负责请求的转发,同时它也作为链路追踪客户端，负责产生数据，
    并上传给zipkin-service；
    user-service为一个应用服务，对外暴露API接口，同时它也作为链路追踪客户端，负责产生数据。