<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>


	<div class="container col-md-10 col-md-offset-1">
		<div class="panel panel-primary">
			<div class="panel-heading">Ventes</div>
			<div class="panel-body">${num}</div>
		</div>
	</div>
</body>
</html>
