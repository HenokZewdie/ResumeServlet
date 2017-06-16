<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="SkillServlet" method = "post">
<h4>Skill</h4>
<table> 
   <TR>
      <TD>Good at</TD>
      <TD><input type = "text" name = "Skill" ></TD>
  </TR>
 <TR>
      <TD>Rate</TD>
      <TD><input type = "text" name = "Rating" ></TD>
  </TR>
</table>
<br><input type = "submit" value = "ADD MORE">
</form>
<form action="InsertToDB" method = "post">
<input type = "submit" value = "FINISH">
</form>
</body>
</html>