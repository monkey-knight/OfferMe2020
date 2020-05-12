## Web Application 初探

### 创建目录结构

根据上一节中讲述的 Web Application 的目录结构，创建一个测试目录结构如下：

- TestServlet：Web Application 名称
  - WEB-INF：（**注意中划线**）
    - web.xml
    - classes：用于存放编译好的 Servlet 



### 编写测试 Servlet

创建一个 TestServlet 工程，将 Tomcat 安装目录下 lib/servlet-api.jar 库文件导入工程。新建一个 HelloWorldServlet 类：

```java
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/* 当客户端在浏览器的地址栏输入我们此文件的 url 时，即调用了 doGet() 方法。
		 * HttpServletRequest req 类对象封装了客户端向服务端发起的一些列的请求；
		 * HttpServletResponse resp 类对象封装了服务器端返回给客户端的内容。*/
		System.out.println("doGet() method");
		resp.getWriter().write("<a href=\"http://www.baidu.com\">go</a>");
	}

}
```



### 部署 Servlet

- 将 HelloWorldServlet 类的编译文件 HelloWorldServlet.class 文件移动到 webapps/TestServlet/WEB-INF/classes 目录下。

- 配置 web.xml 配置文件：

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                        http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
    version="4.0"
    metadata-complete="true">
  
    <servlet>
          <servlet-name>HelloWorldServlet</servlet-name>
          <servlet-class>HelloWorldServlet</servlet-class>
      </servlet>
  
      <servlet-mapping>
          <servlet-name>HelloWorldServlet</servlet-name>
          <url-pattern>/HelloWorldServlet</url-pattern>
      </servlet-mapping>
  </web-app>
  ```

  

### 启动 Tomcat 并访问

在浏览器地址栏输入：localhost:8080/TestServlet/HelloWorldServlet。