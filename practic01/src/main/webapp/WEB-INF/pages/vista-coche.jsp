<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
algo en la puta vista del coche

<c:out value="${coche.color}"/>

<form action="/vista-coche.htm" method="post">
    <label>coche</label>
    <select name="selection">
        <c:forEach items="${coches}" var="coches">
            <option value="option1">${coches.marca}</option>
        </c:forEach>
    </select>
    <select name="selection">
        <c:forEach items="${coches}" var="coches">
            <option value="option1">${coches.modelo}</option>
        </c:forEach>
    </select>
    <select name="selection">
        <c:forEach items="${coches}" var="coches">
            <option value="option1">${coches.color}</option>
        </c:forEach>
    </select>


    <input type="text" name="coche1" placeholder="elcoche"/>
    <input type="submit" value="apreta"/>
</form>

</body>
</html>
