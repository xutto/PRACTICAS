<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html ng-app=""> <%--iniciando aplicacion--%>

<head>
    <title></title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/custom.css"/>
    <script src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
</head>
<body>



<div ng-show="{{'${show}'}}" class="tag1">{{ titulo }}</div>

<div><p>{{ 20 + 30 + "${hola}"}}</p></div>
<br/>

<p>filtro euros {{ 50 | currency:" € "}} importada de {{ 'INdia' | uppercase}}</p>

<hr/>

<form method="post" action="angular.htm">
    <select name="aparece">
        <option value="true">true</option>
        <option value="false">false</option>
    </select>

    <input type="submit" value="apreta">
</form>

<hr/>

<input type="text" ng-model="titulo"/> <br/>


</body>

</html>
