

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    Object u=request.getSession().getAttribute("usuarioCliente");
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
            <a class="navbar-brand" data-toogle="tooltip" data-placement="bottom" title data-original-title="Perfil" href="#">
              <% if (u==null){ %>
              SISMAR<% } else { out.println("<span class=\"glyphicon glyphicon-user\"> "+u.toString()+"</span>");}%>
          </a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
              <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
            <li><a href="#"><%if (u==null){ %>Quienes Somos<%}else{ %>Perfil<%}%></a></li>
            <li><a data-toggle="modal" id="menu" href="#ModalMenu">Menú <span class="glyphicon glyphicon-cutlery"></span></a></li>
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
          <% if(u!=null){ %> 
          <li><a href="ServletCerrar" id="CerrarSesion">Cerrar Sesión</a></li>
            <% } else{ %>
          </ul> 
          <form class="navbar-form navbar-right" method="post" action="ServletLoginCliente">
            <div class="form-group">
                <input type="text" placeholder="Número de Usuario" class="form-control" name="usuarioCliente">
            </div>
            <div class="form-group">
                <input type="password" placeholder="Contraseña" class="form-control" name="password">
            </div>
            <button type="submit" class="btn btn-success">Entrar</button>
          </form>
             <% } %>
              
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

    
    <!-- Modal Menu-->
    <div class="modal fade" id="ModalMenu" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    
  </div><!-- /.modal -->
  
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
    <script src="assets/js/holder.js"></script>
    <script>
       
        $(function(){
            $('#menu').on('click',function(e){
                e.preventDefault();
                $.get('/sismar/ServletMenu',{},function(d){
                   $('#ModalMenu').append(d);  
                })               
            })
        })
    </script>
  </body>
</html>
