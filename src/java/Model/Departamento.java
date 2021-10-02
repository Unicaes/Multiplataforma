/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import base.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Departamento {
    conexion oConexion;
    public int dept_no;
    public String dnombre;
    public String loc;
    public Empleado hijo;
    
    public ArrayList<Departamento> GetData() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oConexion= new conexion();
        String query = "select dnombre,count(bpempleado.dept_no),AVG(bpempleado.salario) from bpdepartamento d \n" +
                       "left join bpempleado on d.dept_no = bpempleado.dept_no\n" +
                       "group by d.dept_no;";
        ResultSet rs=this.oConexion.DoQuery(query);
        ArrayList<Departamento> departamentos = new ArrayList<>();
        while(rs.next()){
            Departamento item = new Departamento();
            item.dnombre=rs.getString("dnombre");
            item.hijo = new Empleado();
            item.hijo.salario = rs.getDouble(3);
            item.hijo.dir = rs.getInt(2);
            departamentos.add(item);
        }
        return departamentos;
    }
    public ArrayList<Departamento> GetAll() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oConexion= new conexion();
        String query = "";
        ResultSet rs=this.oConexion.consultar("*","bpdepartamento");
        ArrayList<Departamento> departamentos = new ArrayList<>();
        while(rs.next()){
            Departamento item = new Departamento();
            item.dnombre=rs.getString("dnombre");
            item.loc=rs.getString("loc");
            departamentos.add(item);
        }
        return departamentos;
    }
    public ArrayList<Empleado> GetByDepartment(String department) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oConexion= new conexion();
        String query = "";
        ResultSet rs=this.oConexion.consultar("*","bpdepartamento","dnombre = '"+department+"'");
        ArrayList<Empleado> Empleados = new ArrayList<>();
        while(rs.next()){
            Empleado oEmpleado = new Empleado();
            oEmpleado.apellido = rs.getString("apellido");
            oEmpleado.oficio = rs.getString("oficio");
            oEmpleado.dir = rs.getInt("dir");
            oEmpleado.fecha_alt = rs.getDate("fecha_alt");
            oEmpleado.salario = rs.getDouble("salario");
            oEmpleado.comision = rs.getDouble("comision");
            oEmpleado.dep_no = rs.getInt("dept_no");
            oEmpleado.emp_no = rs.getInt("emp_no");
            Empleados.add(oEmpleado);
        }
        return Empleados;
    }
}
