<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<h3>登录</h3>

<form class="f1" action="<%=request.getContextPath()%>/user/login" method="post" >
        <fieldset>
            <legend>登录</legend>
            <table width=100% >
                <tr ><td class=“left” width=40% align="right"><label for="t1">姓 名：</label></td>
                    <td class="right"><input type="text" id="t1" name="username"></td>
                </tr>
                <tr><td class=“left” width=40% align="right"><label for="Password1">密 码：</label></td>
                    <td class="right"><input id="Password1" type="password" name="password" /></td>
                </tr>
                <tr><td class=“left” width=40% align="right" rowspan=2>
                    <input id="Submit1" type="submit" value="登录" />
                </td>
                    <td> <input id="Reset1" type="reset" value="重 置" />
                    </td>
                </tr>
            </table>
        </fieldset>

</form>
</body>
</html>
