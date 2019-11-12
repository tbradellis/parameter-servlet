<%--
  Created by IntelliJ IDEA.
  User: bellis
  Date: 11/7/19
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Parameter Test Page</title>


  </head>
  <body>
  <form action="multiply" method="get">
    Integer Multiplication<br>
    Enter number 1: <input type="text" name="number1"><br>
    Enter number 2: <input type="text" name="number2"><br>
    <input type="submit" value="get">
  </form>
  <br>
  <br>
  <form action="multiply" method="post">
    Integer Multiplication<br>
    Enter number 3: <input type="text" name="number3"><br>
    Enter number 4: <input type="text" name="number4"><br>
    <input type="submit" value="post">
  </form>
  </body>
</html>
