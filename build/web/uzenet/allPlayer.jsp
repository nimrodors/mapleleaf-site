<%-- 
    Document   : allPlayer
    Created on : 2019.02.14., 13:24:29
    Author     : Lenovo
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Goalies"%>
<%@page import="model.Defense"%>
<%@page import="java.util.List"%>
<%@page import="model.Forward"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Maple Leaf Roster</title>
        <link href=".//Styles/allplayer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="row">
            <a href="" class="logout--button">logout</a>
            <h1 class="roster--title">2018-2019 ROSTER</h1>
        </div>
        <div class="row">
            <h2 class="player--position">Forwards</h2>
        </div>

        <div class="row">
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Number</th>
                    <th>Position</th>
                    <th>Sh</th>
                    <th>Ht</th>
                    <th>Wt</th>
                    <th>Born</th>
                    <th>Birth Place</th>
                    <th>Drafted Year</th>
                    <th>Drafted By</th>
                </tr>

                <c:forEach var="f" items="${forward}">
                    <tr>
                        <td><a href="player?forwardid=${f.id}">${f.firstName}</a></td>
                        <td>${f.lastName}</td>
                        <td> ${f.number}</td>
                        <td> ${f.position}</td>
                        <td> ${f.sh}</td>
                        <td> ${f.ht}</td>
                        <td> ${f.wt}</td>
                        <td> ${f.born}</td>
                        <td> ${f.birthPlace}</td>

                        <c:choose>
                            <c:when  test="${f.draftYear == 0}">
                                <td>Undrafted</td>
                            </c:when>
                            <c:otherwise>
                                <td> ${f.draftYear}</td>
                            </c:otherwise>
                        </c:choose>

                        <c:choose>
                            <c:when test="${f.draftedBy == ''}">
                                <td>-</td>
                            </c:when>
                            <c:otherwise>
                                <td>${f.draftedBy}</td>
                            </c:otherwise>
                        </c:choose>
                    </tr>
                </c:forEach>

            </table>
        </div>

        <div class="row">
            <h2 class="player--position">DEFENSE</h2>
        </div>

        <div class="row">
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Number</th>
                    <th>Sh</th>
                    <th>Ht</th>
                    <th>Wt</th>
                    <th>Born</th>
                    <th>Birth Place</th>
                    <th>Drafted Year</th>
                    <th>Drafted By</th>
                </tr>

                <c:forEach var="d" items="${defense}">
                    <tr>
                        <td><a href="defense?defenseid=${d.id}">${d.firstName}</a></td>
                        <td> ${d.lastName}</td>
                        <td> ${d.number}</td>
                        <td> ${d.sh}</td>
                        <td> ${d.ht}</td>
                        <td> ${d.wt}</td>
                        <td> ${d.born}</td>
                        <td> ${d.birthPlace}</td>

                        <c:choose>
                            <c:when  test="${d.draftYear == 0}">
                                <td>Undrafted</td>
                            </c:when>
                            <c:otherwise>
                                <td> ${d.draftYear}</td>
                            </c:otherwise>
                        </c:choose>
                        <c:choose>
                            <c:when test="${d.draftedBy == null}">
                                <td>-</td>
                            </c:when>
                            <c:otherwise>
                                <td> ${d.draftedBy}</td>
                            </c:otherwise>
                        </c:choose>

                    </tr>
                </c:forEach>

            </table>
        </div>

        <div class="row">
            <h2 class="player--position">Goalies</h2>
        </div>

        <div class="row">
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Number</th>
                    <th>Ht</th>
                    <th>Wt</th>
                    <th>Born</th>
                    <th>Birth Place</th>
                    <th>Drafted Year</th>
                    <th>Drafted By</th>
                </tr>

                <c:forEach var="g" items="${goalies}">
                    <tr>
                        <td><a href="goalie?goalieid=${g.id}"> ${g.firstName}</a></td>
                        <td>${g.lastName}</td>
                        <td> ${g.number}</td>
                        <td> ${g.ht}</td>
                        <td> ${g.wt}</td>
                        <td> ${g.born}</td>
                        <td> ${g.birthPlace}</td>
                        <td> ${g.draftedYear}</td>
                        <td> ${g.draftedBy}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </body>
</html>
