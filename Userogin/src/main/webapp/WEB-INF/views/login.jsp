<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
<form action="dologin" method ="post">
<table>
<tr>
      <td>Username</td>
      <td><input type="text" name="username"></td>
</tr>

<tr>
      <td>Password</td>
      <td><input type="password" name="password"></td>
</tr>

<tr>
       <td colspan="2"><input type="submit" value="submit"></td>
</tr>

</table>
</form>
</body>
</html>