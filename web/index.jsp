<%@page contentType="text/html" pageEncoding="UTF-8"%>


<% 
    if (request.getSession().getAttribute("usuario")!=null){
        response.sendRedirect("indexUser.jsp");
    }
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/ico/favicon.png">

    <title>SISMAR</title>
    
    <!-- Bootstrap core CSS -->
    <link href="dist/css/bootstrap.css" rel="stylesheet">
    <link href="css/carousel.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">
  </head>
<!-- NAVBAR
================================================== -->
  <body>
    <div class="navbar navbar-inverse navbar-fixed-top navbar-wrapper">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">SISMAR</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
              <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
            <li><a href="#about">Quienes Somos</a></li>
            <li><a data-toggle="modal" id="menu" href="#ModalMenu">Menú</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Sucursales <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li class="dropdown-header">Zona Sur</li>
                <li><a href="#">Pedregal</a></li>
                <li><a href="#">San Ángel</a></li>
                <li><a href="#">Coyoacán</a></li>
                <li class="divider"></li>
                <li class="dropdown-header">Zona Centro</li>
                <li><a href="#">Reforma</a></li>
                <li><a href="#">Polanco</a></li>
              </ul>
            </li>
          </ul>
          <form class="navbar-form navbar-right" method="post" action="ServletLoginUser">
            <div class="form-group">
                <input type="text" placeholder="Número de Usuario" class="form-control" name="usuario">
            </div>
            <div class="form-group">
                <input type="password" placeholder="Contraseña" class="form-control" name="password">
            </div>
            <button type="submit" class="btn btn-warning">Entrar</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </div>


    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner">
        <div class="item active">
            <img style="opacity: .8" src="images/restaurante.jpg" >
          <div class="container">
            <div class="carousel-caption">
              <h1>Únete a nosotros.</h1>
              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
              <p><a class="btn btn-large btn-primary btnregistro" href="registro.jsp">Registrate</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img style="opacity: .8" src="images/platillos.jpg">
          <div class="container">
            <div class="carousel-caption">
              <h1>Another example headline.</h1>
              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
              <p><a class="btn btn-large btn-primary" href="#">Ver Menú</a></p>
            </div>
          </div>
        </div>
        <div class="item">
          <img style="opacity: .7" src="images/maps.png">
          <div class="container">
            <div class="carousel-caption">
              <h1>One more for good measure.</h1>
              <p>Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
              <p><a class="btn btn-large btn-primary" href="#">Contacto</a></p>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
    </div><!-- /.carousel -->



    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container marketing">

      <!-- Three columns of text below the carousel -->
      <div class="row">
        <div class="col-lg-4">
          <img class="img-circle" src="images/rest.jpg" data-src="holder.js/140x140" alt="Generic placeholder image">
          <h2>Promociones</h2>
          <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna.</p>
          <p><a class="btn btn-default" href="#">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/png;base64," data-src="holder.js/140x140" alt="Generic placeholder image">
          <h2>Mas..</h2>
          <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh.</p>
          <p><a class="btn btn-default" href="#">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
        <div class="col-lg-4">
          <img class="img-circle" src="data:image/png;base64," data-src="holder.js/140x140" alt="Generic placeholder image">
          <h2>Contacto</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <p><a class="btn btn-default" href="#">View details &raquo;</a></p>
        </div><!-- /.col-lg-4 -->
      </div><!-- /.row -->

      <hr class="featurette-divider">

      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2013 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>

    </div><!-- /.container -->
    <c:forEach items="${productos}" var="productos">
    <!-- Modal Menu-->
    <div class="modal fade" id="ModalMenu" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
         <div id="menuCarousel" class="carousel1 slide"> 
              <ol class="carousel-indicators">
                <li data-target="#menuCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#menuCarousel" data-slide-to="1"></li>
                <li data-target="#menuCarousel" data-slide-to="2"></li>
              </ol>
             <!-- Carousel items -->
              <div class="carousel-inner">
                    <div class="item active">
                        <div class="modal-content">
                            <div class="modal-header">
                              <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                              <h2 class="modal-title title">Alimentos</h2>
                            </div>
                            <div class="modal-body"> 
                              <div class="row">
                                  <div class="col-lg-10 producto">
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                    </div>
                                  <div class="col-lg-2 precio">
                                      <p>$ 135</p>
                                      <p>$ 135</p>
                                      <p>$ 135</p>
                                  </div>   
                              </div>  
                            </div>
                            <div class="modal-footer">                       
                            <ul class="pagination pags">                           
                                <li><a href="#menuCarousel" data-slide="prev">&laquo;</a></li>
                                <li class="active"><a href="#menuCarousel">1</a></li>
                                <li><a href="#menuCarousel">2</a></li>
                                <li><a href="#menuCarousel">3</a></li>                               
                                <li><a href="#menuCarousel" data-slide="next">&raquo;</a></li>
                              </ul>   
                            
                        
                                <button type="button" class="btn btn-warning" data-dismiss="modal">Aceptar</button>
                           
                            </div>
                        </div><!-- /.modal-content -->
                       </div> <!-- Item 1 -->
                    <div class="item">
                        <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                             <h2 class="modal-title title">Bebidas</h2>
                           </div>
                           <div class="modal-body"> 
                               <p>Bla bla bla </p>
                           </div>
                           <div class="modal-footer"> 
                             <ul class="pagination pags">                           
                                <li><a href="#menuCarousel" data-slide="prev">&laquo;</a></li>
                                <li><a href="#menuCarousel">1</a></li>
                                <li class="active"><a href="#menuCarousel">2</a></li>
                                <li><a href="#menuCarousel">3</a></li>                               
                                <li><a href="#menuCarousel" data-slide="next">&raquo;</a></li>
                              </ul>   
                             <button type="button" class="btn btn-warning" data-dismiss="modal">Aceptar</button>
                           </div>
                       </div><!-- /.modal-content -->
                   </div> <!-- Item 2 -->
                  <div class="item">
                        <div class="modal-content">
                           <div class="modal-header">
                             <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                             <h2 class="modal-title title">Postres</h2>
                           </div>
                           <div class="modal-body"> 
                               <p> </p>
                           </div>
                           <div class="modal-footer">
                               <ul class="pagination pags">                           
                                <li><a href="#menuCarousel" data-slide="prev">&laquo;</a></li>
                                <li><a href="#menuCarousel">1</a></li>
                                <li><a href="#menuCarousel">2</a></li>
                                <li class="active"><a href="#menuCarousel">3</a></li>                               
                                <li><a href="#menuCarousel" data-slide="next">&raquo;</a></li>
                              </ul> 
                             <button type="button" class="btn btn-warning" data-dismiss="modal">Aceptar</button>
                           </div>
                       </div><!-- /.modal-content -->
                  </div> <!-- Item 3 -->
            </div><!-- Inner -->
        </div><!-- Menu Carousel -->
    </div><!-- /.modal-dialog -->
  </div><!-- /.modal -->
  </c:forEach>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <script src="assets/js/holder.js"></script>
  </body>
</html>
