<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h4>YOUR INFORMATION</h4>
<table> 
   <TR>
      <TD>Full Name</TD>
      <TD><p>${FullNameSession}</p></TD>
  </TR>
 <TR>
      <TD>Email</TD>
      <TD><p>${EmailSession}</p></TD>
  </TR>
  </table>
  <table>
  <p><h5>Educational Background</h5></p>
   
 <c:forEach items="${EducALSession}" var="Educ">
    
    <tr>      
        <td>${Educ} </td>
    </tr>
    </c:forEach>
    </table>
    <table>

   <p><h5>Work Experiance</h5></p>
  <c:forEach items="${ExpALSession}" var="Educ">
    
    <tr>      
        <td>${Educ} </td>
    </tr>
    </c:forEach>
    </table>
    <table>

   <p><h5>Skills</h5></p>
    <c:forEach items="${SkillSession}" var="Educ">
     
    <tr>      
        <td>${Educ} </td>
    </tr>
</c:forEach>
   
</table>

<h1>:) :)</h1>
</body>
</html>