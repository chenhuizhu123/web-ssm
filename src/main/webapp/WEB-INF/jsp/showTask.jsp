<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h3>欢迎${user.username}，您的任务列表</h3>
<table>
    <tr><td>今日有${tasknums}个任务可领，最多可以获得${maxExperience}经验值，已获得${user.experience}经验值</td>></tr>
    <tr>每日任务</tr>
    </br>

    <c:if test="${!empty taskList}">
        <c:forEach var="task" items="${taskList}">
            <form action="<%=request.getContextPath()%>/task/getTask" method="post">
                <tr>
                    <td>${task.taskName}</td>
                    <td>详情（参与人数2000）${task.taskInfo}领取任务可获得${task.taskExperience}经验</br></td>
                    <td><input type="hidden" name="taskid" value="${task.id}"></td>
                    <td><input type="submit" value="领取任务"></td>
                </tr>
            </form>
        </c:forEach>
    </c:if>

</table>

</body>
</html>
