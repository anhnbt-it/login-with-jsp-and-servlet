<%-- 
    Document   : index
    Created on : Oct 31, 2021, 7:23:19 PM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"></jsp:include>
    <div>Welcome to Hà Nội Aptech</div>
    <p>Max session = 
        <%
            out.println(application.getAttribute("count"));
        %>
    </p>
<jsp:include page="footer.jsp"></jsp:include>