<%@page contentType="text/html" pageEncoding="UTF-8"  isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="generator" content="CoffeeCup HTML Editor (www.coffeecup.com)">
    <meta name="dcterms.created" content="Wed, 12 Nov 2014 09:43:37 GMT">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <title></title>
    <%@include file="./css.jsp" %>
    <%@include file="./js.jsp" %>
  </head>
  
  <body>
  	<c:set var="urlvalue" value="${initParam['protocol']}${initParam['domain']}/"/>
   	<c:import url="${urlvalue}${initParam['webappctx_spring']}${requestScope.header}"/>
  	<c:import url="${urlvalue}${initParam['webappctx_spring']}${common}"/>
 	<c:import url="${urlvalue}${initParam['webappctx_spring']}${footer}"/>
  </body>
</html>