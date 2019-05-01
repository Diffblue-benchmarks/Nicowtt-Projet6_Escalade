<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Les amis de l'escalade</title>
    <meta name="description" content="Le site de partage pour fan d'escalade">

    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

    <spring:url value="/resources/css/style.css " var="stylecss" />
    <link href="${stylecss}" rel="stylesheet" />

    <%--<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>resources/css/style.css">--%>

    <%--<link rel="stylesheet" media="screen" type="text/css" title="main_css"--%>
    <%--href="resources/css/style.css" />--%>

</head>

<header class="raw">

    <!-- Navigation
    ================================================== -->
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand page-top" href="/home">Les amis de l'escalade</a>
        </div>
        <!-- All elements on navbar -->
        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="/recherche">Recherche</a></li>
                <li><a href="/creationTopo">Creation de Topo</a></li>
                <li><a href="/echangeTopo">Echange de Topo</a></li>
            </ul>

            <!-- identification -->
            <ul class="nav navbar-nav navbar-right"> <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">S'identifier <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li class="dropdown-header">Vous n'êtes pas identifié.</li>
                    <li><form class="navbar-form" method="post" action="/login?redirect=/">
                        <input type="text" class="form-control" name="username" placeholder="Identifiant" /><br />
                        <input type="password" class="form-control" name="password" placeholder="Mot de passe"/>
                        <input type="submit" class="btn btn-primary btn-xs btn-block" /></form></li>
                    <li class="disabled"><a href="#">Mot de passe oublié ?</a></li>
                    <li class="disabled"><a href="#">Créer un compte...</a></li>
                </ul>
            </li>
            </ul>

        </div>
    </nav>

</header>
<div class="container">

    <!-- Body
    ================================================== -->

    <!-- display site -->
    <div id="listerCommentaire">
        <p></p>
        <table class="table">
            <tr>
                <th>Date Commentaire</th><th>Nom</th><th>commentaire</th>
                <%--<th>Element_id</th><th>Secteur_id</th>--%>
            </tr>
            <c:forEach items="${commentaire}" var="co">
                <tr>
                    <td>${co.dateCommentaire}</td>
                    <td><c:forEach items="${utilisateur}" var="ut"> <c:out value="${ut.prenom}" /></c:forEach></td>
                    <td>${co.commentaire}</td>
                </tr>
            </c:forEach>
        </table>
    </div>


    <%--<h3>test CSS</h3>--%>
</div>


<!-- jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- Javascript de Bootstrap -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>


</body>
</html>




<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--<title>Index Page</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<a href="/index">Go To Home Page</a>--%>
<%--</body>--%>
<%--</html>--%>
