<%-- 
    Document   : mesero
    Created on : 14-nov-2013, 8:54:18
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/ico/favicon.png">
    
    <title>SISMAR Caja</title>
     <link href="css/caja.css" rel="stylesheet">
    <!-- Bootstrap core CSS -->
    <link href="dist/css/bootstrap.css" rel="stylesheet">
    <link href="css/mesero.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
  </head>
  <body>
       <div class="container">
      <!-- ================== Barra Navegadora ============================ -->
      <nav class="navbar navbar-default" role="navigation">
          <div class="navbar-header">  
          <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-user"> Mesero</span></a>
          </div>
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
            <li class="active"><a href="#">Link</a></li>
            <li><a href="#">Link</a></li>
            </ul>
          </div>
      </nav>
      
      <!-- ================================ Contenido =================================== -->
      <div class="row">
          <div class="col-lg-offset-2 col-lg-8 mesas">
          <ul class="nav nav-pills">
              <li class="active"><a href="#">Mesa 1</a></li>
            <li><a href="#">Mesa 2</a></li>
            <li><a href="#">Mesa 3</a></li>
            <li><a href="#">Mesa 4</a></li>
            <li><a href="#">Mesa 5</a></li>
            <li><a href="#">Mesa 6</a></li>
            <li><a href="#">Mesa 7</a></li>
            <li><a href="#">Mesa 8</a></li>
            <li><a href="#">Mesa 9</a></li>
          </ul>
        </div>
      </div>
      <div class="row">
      <!-- ============================= Menu =============================== -->
          <div class="col-lg-6">
                <div class="panel panel-default">
                     <div class="panel-heading">
                         <div> <h3 class="panel-title"><span class="glyphicon glyphicon-list-alt"></span> Menú</h3></div>
                        <div class="input-group">
                        <input type="text" class="form-control">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button"><span class="glyphicon glyphicon-search"></span></button>
                        </span>
                      </div><!-- /input-group -->
                     </div>
                     <div class="panel-body menu">
                          <div class="row">
                                  <div class="col-lg-8 producto">
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                  </div>
                                  <div class="col-lg-2 precio">
                                      <p>$ 135</p>
                                  </div>
                              <div class="col-lg-2">
                                  <button type="button" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span></button>
                              </div>
                              </div>  
                         <div class="row">
                                  <div class="col-lg-8 producto">
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                  </div>
                                  <div class="col-lg-2 precio">
                                      <p>$ 135</p>
                                  </div>
                              <div class="col-lg-2">
                                  <button type="button" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span></button>
                              </div>
                              </div>  
                         <div class="row">
                                  <div class="col-lg-8 producto">
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                  </div>
                                  <div class="col-lg-2 precio">
                                      <p>$ 135</p>
                                  </div>
                              <div class="col-lg-2">
                                  <button type="button" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span></button>
                              </div>
                              </div>
                         <div class="row">
                                  <div class="col-lg-8 producto">
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                  </div>
                                  <div class="col-lg-2 precio">
                                      <p>$ 135</p>
                                  </div>
                              <div class="col-lg-2">
                                  <button type="button" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span></button>
                              </div>
                              </div>  
                         <div class="row">
                                  <div class="col-lg-8 producto">
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                  </div>
                                  <div class="col-lg-2 precio">
                                      <p>$ 135</p>
                                  </div>
                              <div class="col-lg-2">
                                  <button type="button" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span></button>
                              </div>
                              </div>  
                         <div class="row">
                                  <div class="col-lg-8 producto">
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                  </div>
                                  <div class="col-lg-2 precio">
                                      <p>$ 135</p>
                                  </div>
                              <div class="col-lg-2">
                                  <button type="button" class="btn btn-success"><span class="glyphicon glyphicon-plus"></span></button>
                              </div>
                              </div>  
                     </div>
                </div>
          </div>
      <!-- ==================================== Comanda ================================ -->
          <div class="col-lg-6">
               <div class="panel panel-default">
                     <div class="panel-heading">
                         <h3 class="panel-title"><span class="glyphicon glyphicon-pencil"></span> Comanda</h3>
                     </div>
                     <table class="table table-hover">
                        <tr>
                            <th>#</th><th>Producto</th><th>SubTotal</th>
                        </tr>
                        <tr>
                            <td>4</td><td>Lasagna</td><td>120</td><td><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-minus"></span></button></td>
                        </tr>
                        <tr>
                            <td>4</td><td>Lasagna</td><td>120</td><td><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-minus"></span></button></td>
                        </tr>
                        <tr>
                            <td>4</td><td>Lasagna</td><td>120</td><td><button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-minus"></span></button></td>
                        </tr>
                        <tr>
                            <td colspan="2">Total</td>
                            <td>1200</td>
                        </tr>
                    </table>
                </div>
              <div class="row">
                  <div class="col-lg-offset-6">
                      <button type="button" class="btn btn-primary right">Enviar Comanda <span class="glyphicon glyphicon-send"></span></button>
                      <button type="button" class="btn btn-success right">Cerrar Cuenta <span class="glyphicon glyphicon-check"></span></button>
                  </div>
              </div>
          </div>
      </div>  
      <!-- ================================ Pie de Pagina =============================== --> 
      <hr class="featurette-divider">
      <footer>    
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2013 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer> 
       </div>
  </body>
</html>