<%-- 
    Document   : login-success
    Created on : Oct 31, 2021, 8:16:05 AM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"></jsp:include>
        <p>Welcome <strong>${pageContext.request.getAttribute("username")}</strong>, you have successfully login.</p>
<jsp:include page="footer.jsp"></jsp:include>