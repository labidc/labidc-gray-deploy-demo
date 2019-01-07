## [灰度发布插件地址：https://github.com/labidc/labidc-gray-deploy](https://github.com/labidc/labidc-gray-deploy).

# labidc-gray-deploy-demo 灰度发布demo
# 基于 labidc-gray-deploy 插件的demo 工程 
#### 已经加入调用链跟踪配置
####  移步这里启动zikin https://zipkin.io/
#### 可以使用快捷启动查看效果
#### curl -sSL https://zipkin.io/quickstart.sh | bash -s
#### java -jar zipkin.jar


# 该demo使用了分层架构

## 一、如果基于 consul 和 gateway
### 配置文件：每个服务里面已经有配置 application-consul.yml（可以自己修改配置中心）, application-eureka.yml （可以自己添加配置中心）
### 请在bootstrap.yml里或者自己创建 application.yml 并设置spring.profiles.active=consul或eureka
### bootstrap.yml 是公共公用配置
### 1.先自行去consul官网下载 运行consul.
### 2.启动base-service 的两个基础层服务
### 3.启动business-service 的业务层服务
### 4.启动product-service 的产品层服务
### 5.启动gateway-service 网关


## 二、如果基于 eureka 和 zuul2
### 每个服务里面已经有配置 application-consul.yml（可以自己修改配置中心）, application-eureka.yml （可以自己添加配置中心）
### 请在bootstrap.yml里或者自己创建 application.yml 并设置spring.profiles.active=consul或eureka
### bootstrap.yml 是公共公用配置
### 1.启动eureka-server
### 2.启动base-service 的两个基础层服务
### 3.启动business-service 的业务层服务
### 4.启动product-service 的产品层服务
### 5.启动zuul2-server 网关

