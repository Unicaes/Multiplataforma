package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Departamento;
import java.util.ArrayList;
import Model.Empleado;
import base.conexion;

public final class Ejercicio01_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            Empleado oConexion = new Empleado();
            ArrayList<Empleado> empleados = oConexion.GetAllEmpleados();
            Departamento dep = new Departamento();
            ArrayList<Departamento> opciones = dep.GetAll();
        
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("              <a class=\"navbar-brand\" href=\"#\">Bryan Palma</a>\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link active\" aria-current=\"page\" href=\"Ejercicio01.jsp\">Ejercicio 01</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"Ejercicio02.jsp\">Ejercicio 02</a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/Servlet01\" method=\"post\">\n");
      out.write("                <select name=\"optDepartamento\">\n");
      out.write("                    ");
 for (int i = 0; i < opciones.size(); i++) {
                            out.println("<option>");
                            out.println(opciones.get(i).dnombre);
                            out.println("</option>");
                        }
                    
      out.write("\n");
      out.write("                </select>    \n");
      out.write("            </form>\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>id</th>\n");
      out.write("                    <th>apellido</th>\n");
      out.write("                    <th>oficio</th>\n");
      out.write("                    <th>dir</th>\n");
      out.write("                    <th>fecha</th>\n");
      out.write("                    <th>salario</th>\n");
      out.write("                    <th>comision</th>\n");
      out.write("                    <th>departamento</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

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
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        <h2>El salario medio de todos los empleados es: $ ");
 out.print(oConexion.getAverageSalarium());
      out.write("</h2>\n");
      out.write("        <h2>El salario mas alto es: $ ");
 out.print(oConexion.getMaxSalarium());
      out.write("</h2>\n");
      out.write("        <h2>El salario mas bajo es: $ ");
 out.print(oConexion.getMinSalarium());
      out.write("</h2>\n");
      out.write("        <table class=\"table\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Departamento</th>\n");
      out.write("                    <th>Empleados</th>\n");
      out.write("                    <th>Salario Promedio</th>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

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
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
