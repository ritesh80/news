<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
