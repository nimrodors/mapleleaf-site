<%-- 
    Document   : goalie
    Created on : 2019.02.20., 18:19:05
    Author     : Lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Goalie</title>
    </head>
    <body>
        <%
            String name = (String) request.getAttribute("name");
        %>
        <h2><%=name%></h2>

        <table>
            <tr>
                <th>Season</th>
                <th>Team</th>
                <th>League</th>
                <th>GP</th>
                <th>GAA</th>
                <th>SV%</th>
            </tr>
            <c:forEach var="g" items="${goalie}">
                <tr>
                    <th>${g.season}</th>
                    <th>${g.team}</th>
                    <th>${g.league}</th>
                    <th>${g.gp}</th>
                    <th>${g.gaa}</th>
                    <th>${g.sv}</th>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
