<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>length of String </title>
<script src="/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="/js/welcomePage.js"></script>
</head>
<body>

<div class="container">
<div id="loaddate"><h1> the length of string is </h1></div>
<button type="button" id="btnclck">Click Me!</button>
</div>

<script type="text/javascript">
$(document).ready(function(){
	$('#btnclck').click(function(){
		$('#loaddata').load('welcomePage.js'),function(){
			alert("this is done....");
		};
	});
});


</script>
<h2>
${welcome}
</h2>
</body>

</html>
