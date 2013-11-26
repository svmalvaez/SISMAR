<%-- 
    Document   : registro
    Created on : 23-oct-2013, 19:35:33
    Author     : Sergio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <% Object u= request.getSession().getAttribute("usuarioCliente");%>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
         <link href="dist/css/bootstrap.css" rel="stylesheet">
         <link href="css/registro.css" rel="stylesheet">
         <script src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
         <script src="//ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
         <script src="assets/js/jquery.validation.js"></script>
         <script src="dist/js/bootstrap.js"></script>
    </head>
    <body>
        <div class="container">
            <!-- NAVBAR
================================================== -->
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
            <li class="active"><a href="#">Inicio</a></li>
            <li><a href="#about">Quienes Somos</a></li>
            <li><a href="#contact">Menú</a></li>
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
            <button type="submit" class="btn btn-success">Entrar</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </div>
            <!-- ==================== Registro ====================== -->
            <br><br>
            <div class="alert alert-danger fade in" id="error" hidden="">
                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
                <h2>Datos incorrectos!.</h2>
                <p>Porfavor, Verifica los campos incorrectos para continuar.</p>
            </div>
            <div class="container">
            <h1>Registro</h1>
            <form role="form" action="ServletRegistroUsuario" method="post" id="idform">
                   <div class="row">
                <div class="col-lg-6">
                        <div class="form-group" >
                            <label for="nombre">Nombre <span class="glaphycon glyphicon-asterisk"></span></label>
                              <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Introduzca su nombre">
                        </div>
                        <div class="form-group">
                              <label for="nombre">Apellido Paterno <span class="glaphycon glyphicon-asterisk"></span></label>
                              <input type="text" class="form-control" id="paterno" name="paterno" placeholder="Introduzca su apellido paterno">
                        </div>
                        <div class="form-group">
                              <label for="nombre">Apellido Materno <span class="glaphycon glyphicon-asterisk"></span></label>
                              <input type="text"  class="form-control" id="materno" name="materno" placeholder="Introduzca su apellido materno">
                        </div>
                       <div class="form-group">
                              <label for="nombre">Correo <span class="glaphycon glyphicon-asterisk"></span></label>
                              <input type="email" class="form-control" id="correo" name="correo" placeholder="Introduzca su correo electrónico">
                        </div>
                </div>
            </div>
                <div class="row"> 
                <div class="col-lg-6">
                    
                            <div class="row">
                                <div class="col-lg-6">
                                        <div class="form-group">
                                            <label for="nombre">Contraseña <span class="glaphycon glyphicon-asterisk"></span></label>
                                            <input type="password" class="form-control" id="password" name="password" placeholder="Introduzca su contraseña">
                                        </div>
                                </div>
                                <div class="col-lg-6">
                                <div class="form-group">
                                      <label for="nombre">Confirmación Contraseña <span class="glaphycon glyphicon-asterisk"></span></label>
                                      <input type="password" class="form-control"  id="password_conf" name="password_conf" placeholder="Confirme su contraseña">
                                </div>
                                </div>
                            </div>
                </div>
               </div>
            <div class="row">
                <div class="col-lg-6">
                     <div class="form-group">
                              <label for="nombre">Dirección</label>
                              <input type="text" class="form-control" id="direccion" name="direccion" placeholder="Introduzca su direccion">
                     </div>
                     <div class="form-group">
                              <label for="nombre">Telefono </label>
                              <input type="text" class="form-control" id="telefono" name="telefono" placeholder="Introduzca su telefono">
                        </div>
                    </div>
                </div>
             <div class="row"> 
                <div class="col-lg-6">
                        <div class="form-group" >
                            <label for="numTarjeta">Numero de Tarjeta <span class="glaphycon glyphicon-asterisk"></span></label>
                              <input type="text" class="form-control" id="numTarjeta" name="numTarjeta" placeholder="XXXX-XXXX-XXXX-XXXX">
                        </div>
                    
                            <div class="row">
                                <div class="col-lg-6">
                                        <div class="form-group">
                                            <label for="codSeguridad">Código de Seguridad <span class="glaphycon glyphicon-asterisk"></span></label>
                                            <input type="password" class="form-control" id="codSeguridad" name="codSeguridad" placeholder="Introduzca su codigo se seguridad">
                                        </div>
                                </div>
                                <div class="col-lg-6">
                                <div class="form-group">
                                      <label for="tipoTajeta">Tipo de Tajeta <span class="glaphycon glyphicon-asterisk"></span></label>
                                      <select class="form-control" name="tipoTarjeta">
                                            <option value="visa">Visa</option>
                                            <option value="visaelectron">Visa Electron</option>
                                            <option value="mastercard">Master Card</option>
                                            <option value="american">American Express</option>
                                      </select>
                                </div>
                                </div>
                            </div>
                </div>
             </div>
                   <div class="row">
                       <div class="col-lg-3" >
                         <span>  <input type="checkbox" id="aceptar" name="aceptar"> Acepto <a data-toggle="modal" id="terminos" href="#myModal">Terminos y Condiciones</a></span>
                       </div>
                       <div class="col-lg-3">
                         <span><button type="submit" class="btn btn-primary">Registrar</button></span>
                         <span><a href="index.jsp"><button type="button" class="btn btn-danger">Cancelar</button></a></span>
                     </div>
                   </div> 
            </form>
            </div>
           
  <!-- Modal Terminos y Condiciones-->
  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h4 class="modal-title">Términos y Condiciones</h4>
        </div>
        <div class="modal-body"> 
            <p> SISMAR obliga al cliente ....</p>
        </div>
        <div class="modal-footer">          
          <button type="button" class="btn btn-primary" data-dismiss="modal">Aceptar</button>
        </div>
      </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
  </div><!-- /.modal -->            
    </div>           
       
   
       
             <hr class="featurette-divider">
              <!-- FOOTER -->
                <footer>
                  <p class="pull-right"><a href="#">Back to top</a></p>
                  <p>&copy; 2013 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
                </footer> 
       
<script >

        $(document).ready(function() {  
        $("#idform").validate({
                
                rules: {
                    numero: { required: true, minlength: 2},
                    nombre: { required: true, minlength: 3},
                    paterno: { required: true, minlength: 3},
                    materno: { required: true, minlength: 3},
                    password: "required",
                    password_conf: {
                        equalTo: "#password"
                    },
                    direccion: { required: true, minlength: 5},
                    numTarjeta: { required: true, creditcard: true},
                    codSeguridad: { required: true, maxlength: 3},
                    email: { required:true, email: true},
                    telefono: { minlength: 10, maxlength: 15},
                    aceptar: "required",
                    
                    
                },
                messages: {
                    numero: "Verificar numero.",
                    nombre: "Debe introducir su nombre.",            
                    email : {
                            required: "We need your email address to contact you.",
                            email: "Your email address must be in the format of name@domain.com."
                        },
                    telefono : "El número de teléfono introducido no es correcto.",
                    password: "Mínimo 8 caracteres, Máximo 10 caracteres ",
                    aceptar: "Debes leer y aceptar los Términos y Condiciones para continuar.",
                    password_conf: "Deben coincidir las contraseñas",
                    codSeguridad: "Invalido"
            },
                  submitHandler: function(form) {
                    // do other things for a valid form
            alert("Datos insertados con éxito");        
            form.submit();
                    
            },
                invalidHandler: function(click, form) {
                    $("#error").show("slow");
            }
             
        });
            }); 

</script>
    </body>
</html>
