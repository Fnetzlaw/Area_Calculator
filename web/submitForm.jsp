<%-- 
    Document   : submitForm
    Created on : Aug 29, 2014, 3:31:30 PM
    Author     : netzl_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculation of Rectangle</title>
    </head>
    <body>
        <h3>Calculating Area for a Rectangle.</h3>
        <form name="SubmitCalculateDismension" method="POST" action="Submit">
            <p>Enter in the dimension for your rectangle:<br    />  
                <p>Length: </p><input type="text" name="Length" id="length"/><br />
                <p>Width: </p><input type="text" name="Width" id="width"/><br />
            <input type="submit" value="Calculate" name="Calculate"/>
            </p>              
        </form>
    </body>
</html>
