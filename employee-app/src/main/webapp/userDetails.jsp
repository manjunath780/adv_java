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
<h1>hii ${uName}</h1>
<h1>The list of users</h1>
<table>
    <tr>
        <th>Id no.</th>
        <th>Employee Name</th>
        <th>Salary</th>
    </tr>

    <c:forEach items="${listOfEmployees}" var="dto" varStatus="status">
    <tr>
        <td>${status.index+1}</td>
        <td>${dto.getEmployeeName()}</td>
        <td>${dto.getSalary()}</td>
    </tr>
    </c:forEach>

</table>
</body>
</html>




