## JDBC

#### JDBC 编程步骤

1. 加载数据库驱动。

   ```java
   Class.forName("driverClassString");
   ```
   加载 MySQL 数据库驱动如下：

   ```java
   Class.forName("com.mysql.jdbc.Driver");
   ```

2. 通过 DriverManager 类获取数据库的连接。

   ```java
   Connection conn = DriverManager.getConnection(String DBUrl, String userName, String passwd);
   ```

   MySQL 数据库的 url 写法为：

   ```java
   "jdbc:mysql://hostname:port/databasename"
   ```

3. 通过 Connection 对象创建 Statement 对象。有三种方式：

   - `createStatement()`，创建基本的 Statement 对象。
   - `prepareStatement(String sql)`，根据传入的 SQL 语句，创建预编译的 Statement 对象。
   - `prepareCall(String sql)`，根据传入的 SQL 语句，创建 CallableStatement 对象。

4. 使用 Statement 对象执行 SQL 语句。所有的 Statement 都有三个方法来执行 SQL 语句：

   - `execute()`，可以执行任何 SQL 语句，但比较麻烦。
   - `executeUpdate()`，执行 DML 语句，返回受影响的行数；还可以执行 DDL 语句，返回 0。
   - `executeQuery()` 只能执行查询语句，返回代表查询结果的 ResultSet 对象。

5. 操作结果集 ResultSet。ResultSet 对象主要提供了如下两类方法：

   - `next()`, `previous()`, `first()`, `last()`,  `beforeFirst()`, `afterLast()`, `absolute()` 移动记录指针。
   - `getXxx()` 获取值。

6. 回收数据库资源，包括关闭 ResultSet, Statement 和 Connection 等资源。

#### JDBC 常用接口和类

**DriverManager**：用于管理 JDBC 驱动的服务类。

  ```java
public static synchronized Connection getConnection(String url, String usr, String passwd) throws SQLException;
  ```

**Connection**：代表数据库连接对象。每一个 Connection 代表一个物理连接会话。

- **创建 Statement 对象，用于执行 SQL 语句**。

     ```java
     Statement createStatement() throws SQLException;
     ```
      ```java
// 返回预编译的 Statement 对象，即将 SQL 语句提交到数据库进行预编译。
     PreparedStatement prepareStatement(String sql) throws SQLException;
      ```
      ```java
      // CallableStatement 对象用于调用存储过程
     CallableStatement prepareCall(String sql) throws SQLException;
      ```
    
    PreparedStatement、CallableStatement 是 Statement 的子类。
  
- 控制事务

    ```java
    // 创建一个保存点
    Savepoint setSavePoint();

    // 以指定名字来创建保存点
    Savepoint setSavePoint(String name);
    ```

    ```java
    // 设置事务的隔离级别
    void setTransactionIsolation(int level);
    ```

    ```java
    // 回滚事务
    void rollback();

    // 将事务回滚到指定的保存点
    void rollback(Savepoint savePoint);
    ```

    ```java
    // 关闭自动提交，打开事务
    void setAutoCommit(boolean autoCommit);
    ```

    ```java
    // 提交事务
    void commit();
    ```

    ```java
    // 控制 Connection 访问数据库的 Schema
    setSchema(String schema);

    getSchema();
    ```

    ```java
    // 控制数据库连接的超时行为。
    setNetworkTimeout(Executor executor, int milliseconds);

    getNetworkTimeout();
    ```

**Statement**：用于执行 SQL 语句。该对象可以用于执行 DDL、DCL、DML、SQL语句。

```java
ResultSet executeQuery(String sql) throws SQLException; // 执行查询语句，返回查询的结果
```

```java
int executeUpdate(String sql) throws SQLException; // 执行 DML 语句，返回受影响的行数；还可以执行 DDL 语句，返回 0
```

```java
boolean execute(String sql) throws SQLException;
```