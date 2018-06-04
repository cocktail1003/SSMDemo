<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/4
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form method="get" action="/user/login">
    用户名:<input name="name"><br>
    密  码:<input name="password"><br>
    <input type="submit" class="icon-align-center" style="color:palegreen" value="登录">
    <input type="reset" class="icon-align-center" style="color: lightseagreen" value="重置">
</form>

</body>
</html>
