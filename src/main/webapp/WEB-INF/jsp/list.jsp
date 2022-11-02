<%@ page  contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>列表页面</title>
</head>
<body>
<a href="#">添加用户</a>
<table border="1">
    <tr>
        <th>姓名</th>
        <th>密码</th>
        <th>性别</th>
        <th>电话</th>
        <th>邮箱</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.username }</td>
            <td>${user.password }</td>
            <td>${user.sex }</td>
            <td>${user.phone }</td>
            <td>${user.email }</td>
            <td>
                <a href="#">修改</a>
                <a href="#">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
