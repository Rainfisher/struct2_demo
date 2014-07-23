<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>登录页面</title>
    </head>
    <body>
        <s:form action="login">
            <table align="center">
                <caption><h3>用户登录</h3></caption>
                <tr>
                    <td><s:textfield label="用户名" name="username" /></td>
                </tr>
                <tr>
                    <td><s:password label="密  码" name="password" /></td>
                </tr>
                <tr align="center">
                    <td><input type="submit" value="登录"/></td><td><input type="reset" value="重填" /></td>
                </tr>
            </table>
        </s:form>
    </body>
</html>