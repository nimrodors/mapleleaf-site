<%-- 
    Document   : defense
    Created on : 2019.02.18., 16:11:08
    Author     : Lenovo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${defense}</title>
    </head>
    <body>
        <%
            String name = (String) request.getAttribute("name");
        %>
        <h1><%=name%></h1>

        <table>
            <tr>
                <th>Season</th>
                <th>Team</th>
                <th>League</th>
                <th>GP</th>
                <th>G</th>
                <th>A</th>
                <th>P</th>
                <th>+/-</th>
                <th>PIM</th>
            </tr>

            <c:forEach var="d" items="${df}">
                <tr>
                    <th>${d.season}</th>
                    <th>${d.team}</th>
                    <th>${d.league}</th>
                    <th>${d.gp}</th>
                    <th>${d.g}</th>
                    <th>${d.a}</th>
                    <th>${d.p}</th>
                    <th>${d.plusMinus}</th>
                    <th>${d.pim}</th>
                </tr>

            </c:forEach> 
        </table>
    </body>
</html>
