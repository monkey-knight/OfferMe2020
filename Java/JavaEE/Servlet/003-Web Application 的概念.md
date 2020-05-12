## Web Application 的概念

Web Application 是说的符合 J2EE 标准的 Web Application，即一个拥有固定结构的目录。

**目录结构**如下：

- Web Application Name
  - **WEB-INF**（必须有，注意**中划线**）
    - **web.xml**（必须有）：该 Web Application 的配置文件。
    - lib：该 Web Application 用到的库文件。
    - classes：存放编译好的 Servlet。
  - META-INF：存放该 Web Application 的上下文信息，符合 J2EE 标准。



Web Application 可以直接放到 Tomcat 的 webapps 目录下，也可以通过配置文件指定到其它目录

```xml
<Context path="虚拟路径名" docBase="目录位置" debug="0" reloadable="true"/>
```





