<%-- 
    Document   : result
    Created on : Aug 29, 2014, 3:32:43 PM
    Author     : netzl_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area of Calculations</title>
    </head>
    <body>
        <h3>Area Of The Rectangle!</h3>
        
        <p>
            <%
                String result = "";
                Object res = request.getAttribute("RecArea");
                if (res != null) {                
                     result = res.toString();
                }
            %>
            <%= result%>
        </p>
    </body>
</html>
