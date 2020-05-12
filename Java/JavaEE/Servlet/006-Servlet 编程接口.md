## Servlet 编程接口

- GenericServlet 类实现了 Servlet 接口，是所有自定义 Servlet 处理类的基类。
- 自定义的用于处理 HTTP 请求的 Servlet 都通过继承 HttpServlet 实现，且 HttpServlet 是 GenericServlet 的子类。 
- 自定义的 Servlet 处理类，需要重写 HttpServlet 类如下处理方法：（分别对应 HTTP 协议的 7 种请求）
  - **doGet**：响应 Get 请求
  - **doPost**：响应 Post 请求
  - doPut：
  - doDelete
  - doHead：仅响应 Get 请求的头部
  - doOptions
  - doTrace
- **通常一个 Servlet 在服务器端只有一个实例**。