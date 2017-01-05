<html>
<head>
<title>Book Management</title>
</head>
<jsp:include page="header.jsp" />
<body>
	<h3>Add Book</h3>
	
	<%
	 String msg = (String)request.getAttribute("message");
	 String succussMsg = msg == null ? "" : msg;
	 out.print(succussMsg);
	%>
	<form action="book" method="post">
		Book Name:<input type="text" name="bookName"> Cost:<input
			type="text" name="bookCost"> <input type="submit"
			value="Add Book">
	</form>

</body>
</html>