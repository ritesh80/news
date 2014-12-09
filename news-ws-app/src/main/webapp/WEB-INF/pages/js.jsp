<%@page language="java" pageEncoding="UTF-8"  isELIgnored="false" %>
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