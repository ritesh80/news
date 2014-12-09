<%@page language="java" pageEncoding="UTF-8"  isELIgnored="false" %>
   
    <link href="/${initParam['webappctx']}/css/bootstrap.min.css" rel="stylesheet"/>
	  <style type="text/css">
       body {
         padding-top: 0px;
       }
	   		 #div_mid{
		 margin-top:50px;/*margin-left:350px;*/
		  }
		  .div_right{
		  			 margin-top:20px;
		   }
		  #example-navbar-collapse2{
		  position:fixed;height:100%;margin-top:10px;
		   }
		   .a-nav{
		   		   padding-left:0px !important;
				   padding-right:0px;
		    }
			#left_nav{
		   		margin-left:0px;margin-top:0px;display:none;
		    }
       @media (max-width: 979px) {
         body {
           padding-top: 0;
         }
		 #div_mid{
		 		  margin-top:50px;margin-left:10px;
				  margin-bottom:60px;
		  }
		  #example-navbar-collapse2{
		   background-color:#E4E4E4;position:absolute;height:100%;margin-top:0px;width:100%;
		   }
		   #left_nav{
		   		margin-left:0px;margin-top:35px;display:block;
		    }
			#sm_menu{
			margin-left:20px;
			 }
			 .a-nav{
		   		   padding-left:15px !important;
				   padding-right:20px;
			    }
       }
     </style>