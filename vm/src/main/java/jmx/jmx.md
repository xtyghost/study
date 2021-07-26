jmx(java management extensions)是一种植入管理功能的框架 
```处理jconsole无法安全连接问题：添加参数
-Dcom.sun.management.jmxremote=true                 相关 JMX 代理侦听开关

-Djava.rmi.server.hostname                                     服务器端的IP
-Dcom.sun.management.jmxremote.port=29094             相关 JMX 代理侦听请求的端口

-Dcom.sun.management.jmxremote.ssl=false              指定是否使用 SSL 通讯

-Dcom.sun.management.jmxremote.authenticate=false     指定是否需要密码验证
```