<%-- 
    Document   : Login
    Created on : Oct 31, 2021, 8:15:37 AM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="header.jsp"></jsp:include>
    <form method="POST" action="/demo/LoginServlet">
        <div class="form-group">
            <label for="txtUsername">Username</label>
            <input type="text" class="form-control" name="username" id="username">
        </div>
        <div class="form-group">
            <label for="txtPassword">Password</label>
            <input type="password" class="form-control" name="password" id="password">
        </div>
        <div class="form-group form-check">
            <input type="checkbox" class="form-check-input" name="rememberMe" value="1" id="rememberMe">
            <label class="form-check-label" for="rememberMe">Remember me?</label>
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
<jsp:include page="footer.jsp"></jsp:include>