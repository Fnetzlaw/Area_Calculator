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
        <h3>Area Of The Rectangle is:</h3>
        
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
        <h3>Area Of The Circle is:</h3>
        <p>
            <%
                result = "";
                Object res2 = request.getAttribute("CirArea");
                if (res2 != null) {                
                     result = res2.toString();
                }
            %>
            <%=result%>
        </p>
        <h3>The Length Of Your Missing Side is:</h3>
        <p>
            <%
                result = "";
                Object res3 = request.getAttribute("TriSide");
                if (res3 != null) {                
                     result = res3.toString();
                }
            %>
            <%=result%>
        </p>
        <p>
            <%
                out.println(getServletConfig().getInitParameter("adminEmail"));
            %>
        </p>
    </body>
</html>
