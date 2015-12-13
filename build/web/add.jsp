<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a new hero</title>
        <link rel="stylesheet" type="text/css" href="styleD.css"/>
        <form name="searchForm" action="search" method="get">
            <input type="text" name="searchVal" value="" />
            
            <br>
            
            <input type="submit" name="submit" value="Search" />.
        </form>
    </head>
    <body>
        <h1>Add a new Hero</h1>
        
        <form name="addForm" action="Add" method="get">
           
            <label>Hero Name:</label>
            <input type="text" name="name" value="" />
            <br>
            <label>Property:</label>
            <input type="text" name="property" value="" />
            <br>
            <label>Level:</label>
            <input type="text" name="level" value="" />
            <br>
            <input type="reset" name="reset" value="clear" />
            <input type="submit" name="submit" value="Submit" />
        </form>
            
            
    </body>
</html>
