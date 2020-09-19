<%--
  Created by IntelliJ IDEA.
  User: Manuja
  Date: 9/19/2020
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="springtag" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cart</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<springtag:form>

    <c:choose>
        <c:when test="${saveFlag}">
            <input type="submit" value="Save" class="btn btn-primary"/>
        </c:when>
        <c:otherwise>
            &nbsp;<input type="submit" value="Update" class="btn btn-primary"/>
        </c:otherwise>
    </c:choose>

        <table class="table table-hover" >
            <thead>
            <tr>
                <td>Id</td>
                <td>Items available</td>
                <td>Quantity</td>
                <td>Price</td>
                <td></td>
                <td></td>
            </tr>
            </thead>

            <tbody>
            <c:forEach items="${cartList}" var="Cartt">
                <tr>
                    <td>${Cartt.id}</td>
                    <td>${Cartt.cartItemList}</td>
                    <td>${Cartt.totalquantity}</td>
                    <td>${Cartt.price}</td>
                    <td><a href="<c:url value='/edit-cart-${Cartt.id}'/>" class="btn btn-warning">edit</a></td>
                    <td><a href="<c:url value='/delete-cart-${Cartt.id}'/>" class="btn btn-danger">delete</a></td>
                </tr></c:forEach>

            </tbody>

        </table>

    </div>
</springtag:form>
</body>
</html>
