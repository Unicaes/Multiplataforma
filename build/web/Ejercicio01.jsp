<%-- 
    Document   : index
    Created on : Oct 1, 2021, 7:50:05 AM
    Author     : bryan
--%>

<%@page import="Model.Singleton"%>
<%@page import="Model.Departamento"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Empleado"%>
<%@page import="base.conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    </head>
    <body>
        <% 
            Empleado oConexion = new Empleado();
            ArrayList<Empleado> empleados;
                empleados = oConexion.GetAllEmpleados();
            Departamento dep = new Departamento();
            ArrayList<Departamento> opciones = dep.GetAll();
        %>
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
            <table class="table table-striped">
            <thead>
                <tr>
                    <th>id</th>
                    <th>apellido</th>
                    <th>oficio</th>
                    <th>dir</th>
                    <th>fecha</th>
                    <th>salario</th>
                    <th>comision</th>
                    <th>departamento</th>
                </tr>
            </thead>
            <tbody>
                <%
                for (int i = 0; i < empleados.size(); i++) {
                        out.println("<tr>");
                        out.println("<td>");
                        out.println(empleados.get(i).emp_no);
                        out.println("</td>");
                        out.println("<td>");
                        out.println(empleados.get(i).apellido);
                        out.println("</td>");
                        out.println("<td>");
                        out.println(empleados.get(i).oficio);
                        out.println("</td>");
                        out.println("<td>");
                        out.println(empleados.get(i).dir);
                        out.println("</td>");
                        out.println("<td>");
                        out.println(empleados.get(i).fecha_alt);
                        out.println("</td>");
                        out.println("<td>");
                        out.println(empleados.get(i).salario);
                        out.println("</td>");
                        out.println("<td>");
                        out.println(empleados.get(i).comision);
                        out.println("</td>");
                        out.println("<td>");
                        out.println(empleados.get(i).dep_no);
                        out.println("</td>");
                        out.println("</tr>");

                    }
                %>
            </tbody>
        </table>
        <h2>El salario medio de todos los empleados es: $ <% out.print(oConexion.getAverageSalarium());%></h2>
        <h2>El salario mas alto es: $ <% out.print(oConexion.getMaxSalarium());%></h2>
        <h2>El salario mas bajo es: $ <% out.print(oConexion.getMinSalarium());%></h2>
        <table class="table">
            <thead>
                <tr>
                    <th>Departamento</th>
                    <th>Empleados</th>
                    <th>Salario Promedio</th>
            </thead>
            <tbody>
                <%
                    ArrayList<Departamento> departamentos = dep.GetData();
                    for (int i = 0; i <departamentos.size() ; i++) {
                        out.println("<tr>");
                        out.println("<td>");
                        out.println(departamentos.get(i).dnombre);
                        out.println("</td>");
                        out.println("<td>");
                        out.println(departamentos.get(i).hijo.dir);
                        out.println("</td>");
                        out.println("<td>"); 
                        out.println(departamentos.get(i).hijo.salario);
                        out.println("</td>");
                        out.println("</tr>");
                    }
                %>
            </tbody>
        </table>
        </div>
    </body>
</html>
