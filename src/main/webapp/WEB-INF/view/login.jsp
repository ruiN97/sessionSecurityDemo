<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html >
<meta charset="UTF-8">
<title>Login</title>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <meta http-equiv="Content-Language" content="zh-CN" />
</head>
<body>
<div id="login">
    <h1>Login</h1>
    <form action="login" method="post">
        <input type="text" required="required" placeholder="用户名" name="username"></input><br>
        <input type="password" required="required" placeholder="密码" name="password"></input><br>
        <button type="submit">登录</button>
    </form>
</div>
</body>
</html>
</html>