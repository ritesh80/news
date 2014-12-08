<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script src="/${initParam['webappctx']}/js/bootstrap.js"></script>
    <!--[if IE]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
	<script type="text/javascript">
        $(document).ready(function(){ 
            $("#myTab a").click(function(e){
            	e.preventDefault();
            	$(this).tab('show');
            });
        });
	  </script>