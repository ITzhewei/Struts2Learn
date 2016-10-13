<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 2016/10/13
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="" method="post">
    用户名:<input type="text" name="userName"/><br/>
    密码:<input type="password" name="passWord"><br/>
    验证码:<input type="text" name="valicateCode">
    <img src="${pageContext.request.contextPath}/captchaAction"><br/>
    <input type="submit">
</form>
</body>
</html>
