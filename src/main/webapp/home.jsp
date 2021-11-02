<%-- 
    Document   : home
    Created on : Nov 2, 2021, 11:38:44 AM
    Author     : Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"></jsp:include>
    <h1>Danh sách sản phẩm</h1>
<c:choose>
    <c:when test="${requestScope['products'] == null}">
        <div class="alert alert-info">Không có dữ liệu.</div>
    </c:when>
    <c:otherwise>

        <div class="table-responsive">
            <table class="table table-striped table-bordered" id="dataTable">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Name</th>
                        <th scope="col">Price</th>
                        <th scope="col">&nbsp;</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${requestScope['products']}" var="prod">
                        <tr>
                            <th scope="row">${prod.getId()}</th>
                            <td>${prod.getName()}</td>
                            <td>${prod.getPriceVND()}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/administrator/customers?act=show&id=${prod.getId()}"
                                   class="btn btn-secondary mr-1" data-toggle="tooltip"
                                   data-placement="top"
                                   title="View">Xem</a>
                                <a href="${pageContext.request.contextPath}/administrator/customers?act=edit&id=${prod.getId()}"
                                   class="btn btn-info mr-1" data-toggle="tooltip" data-placement="top"
                                   title="Edit">Sửa</a>
                                <a href="${pageContext.request.contextPath}/administrator/customers?act=delete&id=${prod.getId()}"
                                   class="btn btn-danger" data-toggle="tooltip" data-placement="top"
                                   title="Delete"
                                   onclick="return confirm('Are you sure you want to delete this item?');">Xóa</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <!-- /.table-responsive -->
    </c:otherwise>
</c:choose>
<jsp:include page="footer.jsp"></jsp:include>
