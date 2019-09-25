基于spring cloud和springboot,使用eurcka 作为注册中心，使用 txlcn 5.0事务管理器；
数据库采用mysql，事务管理使用用redis；
这是一个demo，仅供学习参考

使用说明:

0、执行txlcn-demo.sql，创建数据库和表

1、启动 txlcn-demo-eureka-server

2、启动txlcn-demo-tm

3、启动txlcn-demo-spring-service-b

4、启动txlcn-demo-spring-service-c

5、启动txlcn-demo-spring-service-a

6、登录TxManager： 
    http://localhost:8070 密码：123456
 
7.测试先关controller 接口

            

