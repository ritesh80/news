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
        <!-- Bootstrap Core CSS -->
    <link href="/${initParam['webappctx']}/css/bootstrap.min.css" rel="stylesheet"/>
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
  </head>
  
  <body>
  <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
  		<div class="row">
			 <div class="col-md-3">
			     <div class="navbar-header">
                  <button type="button" class="navbar-toggle" data-toggle="collapse" 
                     data-target="#example-navbar-collapse">
                     <span class="sr-only">Toggle navigation</span>
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                     <span class="icon-bar"></span>
                  </button>
              	 	  <a class="navbar-brand" href="#">WebSiteName</a>
              	 </div>
				 </div>
			 <div class="col-md-6">top-center
			 	  
			 </div>
			 <div  class="col-md-3">
			 	<div id ="example-navbar-collapse" class="row collapse navbar-collapse">
					 <div  class="col-sm-3 ">
        			 	<ul class="nav  navbar-nav navbar-right" style="padding-left:0px" >
                          <li class="dropdown">
                              <a href="#" class="dropdown-toggle a-nav" data-toggle="dropdown">
                                  <i class="icon-th-large"></i> Alert
                                  <b class="caret"></b>
                              </a>
                              <ul class="dropdown-menu">
                                  <li><a href="#">Item1</a></li>
                                  <li><a href="#">Item2</a></li>
                                  <li><a href="#">Item3</a></li>
                              </ul>
                          </li>
        				 </ul>					 
					 </div>
					 <div class="col-sm-4" style="padding-left:0px">
        			 	<ul class="nav  navbar-nav navbar-right" >
                          <li class="dropdown">
                              <a href="#" class="dropdown-toggle a-nav" data-toggle="dropdown">
                                  <i class="icon-th-large"></i> ADMIN
                                  <b class="caret"></b>
                              </a>
                              <ul class="dropdown-menu">
                                  <li><a href="#">Item1</a></li>
                                  <li><a href="#">Item2</a></li>
                                  <li><a href="#">Item3</a></li>
                              </ul>
                          </li>
        				 </ul>		 
				
					 </div>
					 <div class="col-sm-4" style="padding-left:0px">
					 	  <ul class="nav  navbar-nav navbar-right" style="padding-left:0px">
                            <li class="dropdown" ><!--style="margin-left:190px"-->
                                <a href="#" class="dropdown-toggle a-nav" data-toggle="dropdown">
                                    <i class="icon-th-large"></i> Drop Down
                                    <b class="caret"></b>
                                </a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Item1</a></li>
                                    <li><a href="#">Item2</a></li>
                                    <li><a href="#">LOG IN</a></li>
                                </ul>
                            </li>						  
						  </ul>
					 </div>
				</div>


			 </div>
		</div>
	</nav>

		<div class="row" style="margin-top:50px">
		  <div class="col-md-3">
		  		<div id="left_nav" class="navbar-header">
                     <button type="button" data-toggle="dropdown" class="btn btn-default dropdown-toggle">Action <span class="caret"></span></button>
                      <ul id="sm_menu" class="dropdown-menu">
                        <li class="nav-header">What we are?</li>
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#">Our Clients</a></li>
                        <li><a href="#">Our Services</a></li>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Contact Us</a></li>
                        <li class="nav-header">Our Friend</li>
                        <li><a href="#">Google</a></li>
                        <li><a href="#">Yahoo!</a></li>
                        <li><a href="#">Bing</a></li>
                        <li><a href="#">Microsoft</a></li>
                        <li><a href="#">Gadgetic World</a></li>
                      </ul>
              	 </div>
  			 <div id="example-navbar-collapse2" class="visible-lg visible-md visible-lgnavbar navbar-default collapse navbar-collapse span4 ">
                    <ul class="nav nav-list">
                        <li class="nav-header">What we are?</li>
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#">Our Clients</a></li>
                        <li><a href="#">Our Services</a></li>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Contact Us</a></li>
                        <li class="nav-header">Our Friend</li>
                        <li><a href="#">Google</a></li>
                        <li><a href="#">Yahoo!</a></li>
                        <li><a href="#">Bing</a></li>
                        <li><a href="#">Microsoft</a></li>
                        <li><a href="#">Gadgetic World</a></li>
                    </ul>
  	 
  			 </div>
			 </div>
			 <div id="div_mid" class="col-lg-6" ><!--style="margin-top:50px;margin-left:350px"-->
  			 	  <div class="tabbable">
				  	   <ul class="nav nav-tabs">
					   	   <li class="active"><a href="#sect_1" data-toggle="tab">input</a></li>
						   <li><a href="#sect_2" data-toggle="tab">input1</a></li>
						   <li><a href="#sect_3" data-toggle="tab">input2</a></li>
					   </ul>
				  </div>
           <form class="form-horizontal">
				  <div class="tab-content">
				  	   <div id="sect_1" class="tab-pane fade in active">
					   <div class="panel panel-default">
					   		<div class="panel-heading">s1</div>
							<div class="panel-body">

					    sect 1
                                 <fieldset disabled="disabled">
                                      <div class="form-group">
                                          <label for="inputEmail" class="control-label col-xs-3">Email</label>
                                          <div class="col-xs-10">
                                              <input type="email" class="form-control" id="inputEmail" placeholder="Email">
                                          </div>
                                      </div>
                                      <div class="form-group">
                                          <label for="inputPassword" class="control-label col-xs-3">Password</label>
                                          <div class="col-xs-10">
                                              <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                                          </div>
                                      </div>
                                      <div class="form-group">
                                          <div class="col-xs-offset-2 col-xs-10">
                                              <div class="checkbox">
                                                  <label><input type="checkbox"> Remember me</label>
                                              </div>
                                          </div>
                                      </div>
                                     <div class="form-group">
                                          <div class="col-xs-offset-2 col-xs-10">
                                              <button type="submit" class="btn btn-primary">Login</button>
                                          </div>
                                      </div>
                                 </fieldset>
							</div>
					   </div>
					   </div>
				  	   <div id="sect_2" class="tab-pane fade">
					   <div class="panel panel-default">
					   		<div class="panel-heading">sect 2</div>
							<div class="panel-body">

					    sect 2
                          <div class="form-group">
                                <label for="name">Select list</label>
                                <select class="form-control">
                                   <option>1</option>
                                   <option>2</option>
                                   <option>3</option>
                                   <option>4</option>
                                   <option>5</option>
                                </select>
                          
                                <label for="name">Mutiple Select list</label>
                                <select multiple class="form-control">
                                   <option>1</option>
                                   <option>2</option>
                                   <option>3</option>
                                   <option>4</option>
                                   <option>5</option>
                                </select>
                             </div>
							</div>
					   </div>							 
					   </div>
				  	   <div id="sect_3" class="tab-pane fade">
					   <div class="panel panel-default">
					   		<div class="panel-heading">sect 3</div>
							<div class="panel-body">

					    sect 3
                            <div class="form-group">
                                  <input class="form-control input-lg" type="text" 
                                     placeholder=".input-lg">
                               </div>
                            
                               <div class="form-group">
                                  <input class="form-control" type="text" placeholder="Default input">
                               </div>
                            
                               <div class="form-group">
                                  <input class="form-control input-sm" type="text" 
                                     placeholder=".input-sm">
                               </div>
                               <div class="form-group">
                               </div>
                               <div class="form-group">
                                  <select class="form-control input-lg">
                                     <option value="">.input-lg</option>
                                  </select>
                               </div>
                               <div class="form-group">
                                  <select class="form-control">
                                     <option value="">Default select</option>
                                  </select>
                               </div>
                               <div class="form-group">
                                  <select class="form-control input-sm">
                                     <option value="">.input-sm</option>
                                  </select>
                               </div>
                            
                               <div class="row">
                                  <div class="col-lg-2">
                                     <input type="text" class="form-control" placeholder=".col-lg-2">
                                  </div>
                                  <div class="col-lg-3">
                                     <input type="text" class="form-control" placeholder=".col-lg-3">
                                  </div>
                                  <div class="col-lg-4">
                                     <input type="text" class="form-control" placeholder=".col-lg-4">
                                  </div>
                               </div>
							</div>
					   </div>						
					   </div>
				</form>	
				  </div>
			  
			 </div>
				  <div class="col-sm-3">
				  	   <div class="panel panel-default div_right">
					   		<div class="panel-heading">RIGHT</div>
							<div class="panel-body mypanel"> sample body</div>
					   </div>
				  </div>	
		 </div>
		</div>
		 <nav class="navbar navbar-default navbar-fixed-bottom" role="navigation">
		<div class="row">
			 <div class="col-md-3">footer-left</div>
			 <div class="col-md-6" style="text-align: center;">@</div>
			 <div class="col-md-3">footer-right</div>
		</div>
		</nav>
  </body>
</html>