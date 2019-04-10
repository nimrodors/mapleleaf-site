<%-- 
    Document   : player
    Created on : 2019.02.15., 11:14:55
    Author     : Lenovo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${forward}</title>
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
                <th>G</th>
                <th>A</th>
                <th>P</th>
                <th>+/-</th>
                <th>PIM</th>
            </tr>
            <c:forEach var="f" items="${forwardplayers}">
                <tr>
                    <th>${f.season}</th>
                    <th>${f.team}</th>
                    <th>${f.league}</th>
                    <th>${f.gp}</th>
                    <th>${f.g}</th>
                    <th>${f.a}</th>
                    <th>${f.p}</th>
                    <th>${f.plusMinus}</th>
                    <th>${f.pim}</th>
                </tr>

            </c:forEach> 

        </table>
    </body>
</html>
