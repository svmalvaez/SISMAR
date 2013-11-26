
<!-- Modal Menu-->
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
                                  </div>
                                  <div class="col-lg-2 precio">
                                      <p>$ 135</p>
                                  </div>   
                              </div>
                              </c:if>
                              <div class="row">
                                  <div class="col-lg-10 producto">
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                  </div>
                                  <div class="col-lg-2 precio">
                                      <p>$ 135</p>
                                  </div>   
                              </div>  

                              <div class="row">
                                  <div class="col-lg-10 producto">
                                      <h5>LASAGNA</h5>
                                      <p class="descripcion">Nuestra tradicional lasagna servida al estilo italiano.</p>
                                  </div>
                                  <div class="col-lg-2 precio">
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
</c:forEach>
    