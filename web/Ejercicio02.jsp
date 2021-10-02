<%-- 
    Document   : Ejercicio02
    Created on : Oct 1, 2021, 11:42:38 AM
    Author     : bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
              <a class="navbar-brand" href="#">Bryan Palma</a>
              <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item">
                      <a class="nav-link active" aria-current="page" href="Ejercicio01.jsp">Ejercicio 01</a>
                  </li>
                  <li class="nav-item">
                      <a class="nav-link" href="Ejercicio02.jsp">Ejercicio 02</a>
                  </li>
                </ul>
              </div>
            </div>
        </nav>
        <div class="container">
            <form action="${pageContext.request.contextPath}/Servlet02" method="POST">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Nombre del departamento</label>
                    <input type="text" name="txtDepartamento" class="form-control" id="txtDepartamento" aria-describedby="emailHelp">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Ubicacion</label>
                    <input type="text" name="txtDepartamento" class="form-control" id="txtDepartamento" aria-describedby="emailHelp">
                </div>
                <button type="submit" class="btn btn-primary">Enviar Datos</button>
            </form>
        </div>
    </body>
</html>
