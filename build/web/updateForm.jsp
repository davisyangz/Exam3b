
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Hero" %>
<% Hero hero=(Hero) request.getAttribute("hero"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styleD.css"/>
        <title>Update Page</title>
    </head>
    <body>
        <h1>Update a hero's record</h1>
        
        <form name="updateForm" action="update" method="get">
            <label>Hero ID:</label>
            <input type="text" name="name" value="<%=hero.getHeroID() %>" />
            <br>
            <label>Hero Name:</label>
            <input type="text" name="name" value="<%=hero.getHeroName() %>" />
            <br>
            <label>Property:</label>
            <input type="text" name="property" value="<%=hero.getProperty() %>" />
            <br>
            <label>Level:</label>
            <input type="text" name="level" value="<%=hero.getHLevel() %>" />
            <br>
            <input type="submit" name="submit" value="Submit" />
        </form>
    </body>
</html>
