<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html ng-app="presentaCoches"> <%--iniciando aplicacion--%>

<head>
    <title></title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/custom.css"/>
    <script src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
</head>
<body>

<hr/>
<div ng-controller="controlTitulo">
    <div ng-show="{{'${show}'}}" class="tag1">{{ titulo | uppercase}}</div>
    <br/>

    <!-- EL FORMULARIO ENVIA EL PARAMETRO "titulon" QUE CONTIENE EL VALOR DEL TITULO HACIA EL CONTROLADOR SPRING-->
    <form method="post" action="angular.htm">
        <label>Esto es lo del titulo</label><br/>

        <!-- EL TITULO DEPENDE DE LO QUE PONGAS EN EL INPUT, CUANDO DAS A SUBMIT CAMBIAS EL VALOR POR DEFECTO .....
        PEEEEEERO A TRAVES DEL CONTROLADOR DE SPRING-->
        <input type="text" name="titulon" ng-model="titulo"/><br/><br/>

        <select name="aparece">
            <option value="true">true</option>
            <option value="false">false</option>
        </select>

        <input type="submit" value="apreta">
    </form>
</div>
<hr/>


<div><p>{{ "Esto es una operacion 20 + 30 concatenado con variable de spring ${'${hola}'} --- " + (20 + 30) + " "+"${hola}"}}</p></div>
<br/>

<p>filtro euros {{ 50 | currency:" € "}} importada de {{ 'INdia' | uppercase}}</p>


<hr/>
<br/>


<div ng-controller="controlador1"> <%--AQUI SE EJECUTA EL CONTROLADOR1 DEFINIDO EN LA SCRIPT DE MAS ABAJO--%>
    <h2>frutas</h2>
    <label>Esto es el controlador1</label>
    <input type="text" ng-model="cantidad"/> <br/>

    <!--EJEMPLO DE CALCULO EN TIEMPO REAL CON DATOS DEL CONTROLLER DE ANGULAR-->
    Esto es el precio: {{ cantidad * precio }}

</div>
<br/>
<hr/>
<br/>

<div ng-controller="controlador3">
    <h2>coches</h2>

    <ul>
        <li ng-repeat=" nombre in nombres">
            {{ nombre }}
        </li>
    </ul>
        <input type="search" ng-model="buscar"/> <!-- TODO AQUI ESTA EL FILTRO, SE NOMBRA EN EL NG-MODEL -->
    <ul>
        <li ng-repeat=" coche in coches | filter:buscar "> <!-- TODO AQUI SE LLAMA AL JSON QUE HEMOS TRAIDO DEL CONTROLADOR SPRING ojo al filtro de BUSQUEDA -->
            {{coche.marca}} {{coche.modelo}} {{coche.color}}
        </li>
    </ul>

</div>


<script>
    var miApp = angular.module('presentaCoches', [])
    /*crear aplicacion*/

    miApp.controller('controlador1', ['$scope', function ($scope) {  /* EL CODIGO DEL CONTROLADOR*/
        /*instanciar un controlador*/


        $scope.cantidad = 1
        $scope.precio = 2.5

    }])


    miApp.controller('controlTitulo', ['$scope', function ($scope) {
        /*AQUI PODEMOS VER COMO SE RECIBE EL PARAMETRO DESDE EL CONTROLADOR DE SPRING*/
        $scope.titulo = "${titulo}";
    }])
    miApp.controller('controlador3', ['$scope', function ($scope) {
        $scope.nombres = ["polloman", "gracia", "alfredaco"]
        $scope.coches= ${coches} /* TODO nos estamos tryendo un JSON */
    }])
</script>
</body>

</html>
