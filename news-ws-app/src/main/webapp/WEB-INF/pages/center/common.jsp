<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<div class="row" style="margin-top:50px">
			<c:import url="${left}" />
			<c:import url="${center}" />
			<c:import url="#{right}" />
		 </div>