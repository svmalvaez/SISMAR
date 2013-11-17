<%-- 
    Document   : caja
    Created on : 11-nov-2013, 8:56:45
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
  </head>
  <body>
       <div class="container">
           <div class="row">   
      <!-- ================== Barra Navegadora ============================ -->
      <nav class="navbar navbar-default" role="navigation">
          <div class="navbar-header">  
          <a class="navbar-brand" href="#"><span class="glyphicon glyphicon-user"> Cajero</span></a>
          </div>
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
            <li class="active"><a href="#">Link1</a></li>
            <li><a href="#">Link2</a></li>
            </ul>          
              <form class="navbar-form navbar-right" name="buscar" id="buscar" role="search">
                <div class="form-group">
                  <input type="text" class="form-control" placeholder="Número de Usuario ">
                </div>
               <button type="submit" class="btn btn-default">Buscar <span class="glyphicon glyphicon-search"></span></button>
          </form>
          </div>
      </nav>
           </div>
     
      <div class="row">
      <!-- ============================== Barra Leteral ===================================-->
      <div class="col-lg-3 lateral">
            <div class="list-group">
                  <a href="#" class="list-group-item active">
                    <h4 class="list-group-item-heading">Promociones del dia</h4>
                    <p class="list-group-item-text">...</p>
                  </a>
                  <a href="#" class="list-group-item">
                    <h4 class="list-group-item-heading">Historial</h4>
                    <p class="list-group-item-text">...</p>
                  </a>
                <a href="#" class="list-group-item">
                    <h4 class="list-group-item-heading">Titulo</h4>
                    <p class="list-group-item-text">...</p>
                  </a>
                <a href="#" class="list-group-item">
                    <h4 class="list-group-item-heading">Titulo</h4>
                    <p class="list-group-item-text">...</p>
            </a>
            </div>
         </div>
      
      <!-- =========================== Contenido ====================================-->
        <div class="col-lg-9">
            <div class="row">
                <div class="col-lg-12">
                    <form name="pago" id="pago">  
                <select class="form-control" name="mesa" id="mesa">
                  <option>Mesa 1</option>
                  <option>Mesa 2</option>
                  <option>Mesa 3</option>
                  <option>Mesa 4</option>
                  <option>Mesa 5</option>
                </select>
                </div>
            </div>
            <div class="panel panel-default">
             <div class="panel-heading">
                 <h3 class="panel-title">Cuenta por pagar</h3>
             </div>
                    <table class="table table-striped">
                        <tr>
                            <th>#</th><th>Producto</th><th>SubTotal</th>
                        </tr>
                        <tr>
                            <td>4</td><td>Lasagna</td><td>120</td>
                        </tr>
                        <tr>
                            <td>4</td><td>Lasagna</td><td>120</td>
                        </tr>
                        <tr>
                            <td>4</td><td>Lasagna</td><td>120</td>
                        </tr>
                        <tr>
                            <td colspan="2">Total</td>
                            <td>1200</td>
                        </tr>
                    </table>
                </div>
              <div class="row">
              <div class="col-lg-12">    
                    <h4>Comentarios:</h4>
                    <textarea class="form-control" rows="3"></textarea>
                </div>
          </div>
           
        
          <hr class="featurette-divider">
          <div class="row">
          <div class="col-lg-offset-6 pago">
              <div class="row">
                  <div class="col-lg-12">
                  <h4>Total: </h4><div class="input-group"><span class="input-group-addon">$</span><input type="text" class="form-control"><span class="input-group-addon">.00</span></div>
                  <h4>Pago: </h4><div class="input-group"><span class="input-group-addon">$</span><input type="text" class="form-control"><span class="input-group-addon">.00</span></div>
                  <br>
                  <div class="row">
                        <div class="col-lg-12 opciones">
                        <div class="btn-group">
                            <button class="btn btn-success" type="submit"><span class="glyphicon glyphicon-ok"></span></button>
                            <button type="button" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span></button>
                            <button type="button" class="btn btn-primary"><span class="glyphicon glyphicon-print"></span></button>
                        </div>
                        </div>
                  </div>
                  <hr class="featurette-divider">
                  <h4>Cambio: </h4><div class="input-group"><span class="input-group-addon">$</span><input type="text" class="form-control"><span class="input-group-addon">.00</span></div>      
                  </div>
              </div>
      </div>
     </div>
      </div>
    </div>
      <hr class="featurette-divider">  
       <footer>    
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2013 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>         
  </div>
  </body>
</html>

