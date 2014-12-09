<%@page language="java" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<div class="row" style="margin-top:50px">
		  	<c:set var="urlvalue" value="${initParam['protocol']}${initParam['domain']}/"/>
			<c:import url="${urlvalue}${initParam['webappctx_spring']}${left}" />
			<c:import url="${urlvalue}${initParam['webappctx_spring']}${center}" />
			<c:import url="${urlvalue}${initParam['webappctx_spring']}${right}" />
	</div>