
<%
    int postId=Integer.parseInt(request.getParameter("post_id"));
    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Going to show single blocks</h1>
        <h1>Post id : <%=postId %></h1>
    </body>
</html>
