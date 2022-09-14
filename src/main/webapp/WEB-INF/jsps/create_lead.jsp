<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Lead | create</title>
</head>
<body>
<h2>Lead | create </h2>
<form action="saveLead" method="post">
<pre>
	first Name<input type="text" name="firstName"/>
	last Name<input type="text" name="lastName"/>
	lead Source :<select name="leadSource">
					<option value="radio"> radio</option>
					<option value="newspaper"> newspaper</option>
					<option value="tv"> tv</option>
					<option value="online"> online</option>
				</select>
	email<input type="text" name="email"/>
	mobile<input type="text" name="number"/>
	<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>