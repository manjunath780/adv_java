<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page  isELIgnored="false" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
<h1>The list of forms</h1>
<h1>${name}</h1>
<table>
    <tr>
        <th>Id no.</th>
        <th>Name</th>
        <th>gmail</th>
        <th>phone number</th>
        <th>age</th>
        <th>address</th>
    </tr>

    <c:forEach items="${getAllForms}" var="dto" >
    <tr>
        <td>${dto.id}</td>
        <td>${dto.givenName}</td>
        <td>${dto.gmail}</td>
        <td>${dto.phoneNo}</td>
         <td>${dto.age}</td>
          <td>${dto.address}</td>
    </tr>
    </c:forEach>

</table>
</body>
</html>


