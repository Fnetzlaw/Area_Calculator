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
                <img src="Images/rectangle.jpg" height="125" width="250"/>
                <p>Length: </p><input type="text" name="Length" id="length"/><br />
                <p>Width: </p><input type="text" name="Width" id="width"/><br />
            <input type="submit" value="Calculate" name="Calculate"/>
            </p>              
        </form>
        <br    />
        <br    />
        <h3>Calculating Area for a Circle</h3>
        <form name="SubmitCalculateDismension" method="POST" action="Submit">
            <p>Enter in the Radius for your Circle:<br    />
            <img src="Images/circle.jpg" height="175" width="350"/>    
                <p>Radius: </p><input type="text" name="Radius" id="radius"/><br />
                <input type="submit" value="Calculate" name="Calculate"/>                 
            </p>
        </form>
        <br    />
        <br    />
        <h3>Calculating The Missing side of a Triangle</h3>
        <form name="SubmitCalculateDismension" method="POST" action="Submit">
            <p>Enter in two sides you know of:<br    />
            <img src="Images/triangle.jpg" height="175" width="325"/>    
                <p>A: </p><input type="text" name="SideA" id="sideA"/><br />
                <p>B: </p><input type="text" name="SideB" id="sideB"/><br />
                <p>C: </p><input type="text" name="SideC" id="sideC"/><br />
                <input type="submit" value="Calculate" name="Calculate"/>                 
            </p>
        </form>
    </body>
</html>
