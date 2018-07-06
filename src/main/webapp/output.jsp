<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.*,com.test.Customer,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
List<Customer> c = (List<Customer>)request.getAttribute("mycust");
%>

<table border=1>
<th><b>Name</b></th><th><b>city</b></th>
<% for(Customer cu : c) { %>
<tr>
<td><%=cu.getCustomerName() %> </td><td> <%=cu.getCustomerCity() %></td>
</tr>
<% } %>
</table>




</body>
</html>