## Cookie

### Cookie 的功能

##### 为什需要 Cookie ?

HTTP 协议具有**无连接性**：当我们使用 HTTP 协议访问服务端，拿到服务端反馈的页面之后，HTTP 的连接就会断开。当在一个页面上进行了某种操作，在另一个页面上并不能直到上一个页面的操作是什么，所以需要一种机制能够**保存 B/S 访问过程中的中间状态**，即服务端能够往客户端机器上写内容。



##### 服务端往客户端机器上写内容的规则有哪些？

- **只能写文本文件**。防止写可执行文件等危害文件，破坏客户机。
- 客户端可以阻止服务端写入。
- 只能拿自己 Web Application 写入的东西。防止不同的 Web Application 相互拿取信息。



##### Cookie 概念？

- Cookie 是服务端写到客户端的一个文本文件，与特定的客户关联。
- Cookie 以一种“名-值”对的形式保存数据。

- Cookie 分为两种：
  - 属于窗口 / 子窗口
  - 属于文本
- 一个 Servlet / JSP 设置的 Cookies 能够被同一个路径下面或者子路径下面的 Servlet / JSP 读到，否则读不到。



##### 使用 Cookie

创建 Cookie

```java
new Cookie(name, value);
```

使用 setXXX() 方法来设定一些相应的值

- setName(String name) => getName()
- setValue(String value) => getValue()
- setMaxAge(int age) => getMaxAge()

利用 HttpServletResponse 的 addCookie(Cookie) 方法将 Cookie 设置到客户端

利用 HttpServletRequest 的 getCookie() 方法来读取客户端的所有 Cookie，返回一个 Cookie 数组。

