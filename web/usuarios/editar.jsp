<%@page import="accesodato.Coneccion"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Starter Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="../template/css/bootstrap.min.css" rel="stylesheet">

  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Proyecto Java Enterprise Edition</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="../">Inicio</a></li>
                        <li><a href="index.jsp">Usuarios</a></li>
                        <li><a href="../ciudades">Ciudades</a></li>
                        <li><a href="../reportes">Reportes</a></li>
                    </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <div class="container">  
        <br><br><br>
            <div class="row">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Crear Usuarios</h3>
                    </div>
                    <%
                        int id=Integer.parseInt(request.getParameter("edit"));
                        Coneccion con=new Coneccion();
                        con.setConsulta("select * from Usuarios where usuario_id='" + id + "'");
                        String ciu = "";
                    %>
                    <div class="panel-body">
                        <% while(con.getResultado().next()){ 
                        ciu = con.getResultado().getString("ciudad_id");%>
                        <form method="POST" action="../ServletUsuario">
                            <div class="form-group">
                                <label for="usuario_id">ID</label>
                                <input type="text" class="form-control" value="<% out.println(""+con.getResultado().getString("usuario_id"));%>" name="usuario_id" id="usuario_id" readonly="true">
                                <label for="nombre">Nombre </label>
                                <input type="text" class="form-control" name="nombre" id="nombre" value="<% out.println(""+con.getResultado().getString("nombre"));%>" placeholder="Ingresar Nombre">
                            </div>
                             <div class="form-group">
                                <label for="apepat">Apellido Paterno</label>
                                <input type="text" class="form-control" name="apepat" id="apepat" value="<% out.println(""+con.getResultado().getString("apepat"));%>" placeholder="Ingresar Apellido Paterno">
                            </div>
                             <div class="form-group">
                                <label for="apemat">Apellido Materno</label>
                                <input type="text" class="form-control" name="apemat" id="apemat" value="<% out.println(""+con.getResultado().getString("apemat"));}%>" placeholder="Ingresar Apellido Materno">
                            </div>
                             <div class="form-group">
                                <label for="ciudad_id">Ciudad</label>
                                <%
                                    con.setConsulta("select * from ciudades");
                                %>
                                <select name="ciudad" class="form-control">
                                    <%while(con.getResultado().next()){
                                        if(ciu.equals(con.getResultado().getString("ciudad_id"))){
                                           out.println("<option value='" + con.getResultado().getString("ciudad_id") + "' selected>" + con.getResultado().getString("nombre") + "</option>"); 
                                        }
                                        else{
                                        out.println("<option value='" + con.getResultado().getString("ciudad_id") + "'>" + con.getResultado().getString("nombre") + "</option>");
                                        }
                                    } %>
                                </select>
                            </div>
                            
                            <button type="submit" name="actualizar" class="btn btn-default" value="guardar">Guardar</button>
                        </form>
                        

                    </div>
                </div>
            </div>
    </div><!-- /.container -->

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="../template/js/bootstrap.min.js"></script>
  </body>
</html>
