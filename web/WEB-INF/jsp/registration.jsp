<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 02.01.2017
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Регистрация</title>
</head>
<body>
<h1>Registration</h1>
<c:url var="reg" value="/registration/add"/>
<form:form action="${reg}" modelAttribute="client">
    <table>
        <tr>
            <td><form:label path="firstName">
                <spring:message text="Имя"/>
            </form:label></td>
            <td><form:input path="firstName" type="text"/></td>
        </tr> <tr>
            <td><form:label path="lastName">
                <spring:message text="Фамилия"/>
            </form:label></td>
            <td><form:input path="lastName" type="text"/></td>
        </tr> <tr>
            <td><form:label path="email">
                <spring:message text="Имя"/>
            </form:label></td>
            <td><form:input path="email" type="text"/></td>
        </tr><tr>
            <td><form:label path="password">
                <spring:message text="Пароль"/>
            </form:label></td>
            <td><form:input path="password" type="password"/></td>
        </tr>
        <tr>
            <td>
            <input type="submit" value="<spring:message text="Sign"/> "/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
