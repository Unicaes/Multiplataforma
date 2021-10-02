/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import base.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bryan
 */
public class Empleado {
    public int emp_no;
    public String apellido;
    public String oficio;
    public int dir;
    public Date fecha_alt;
    public double salario;
    public double comision;
    public int dep_no;
    private conexion oConexion;
    public ArrayList<Empleado> GetAllEmpleados() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        oConexion = new conexion();
        ResultSet rs = oConexion.consultar("*", "bpempleado");
        ArrayList<Empleado> empleados = new ArrayList<>();
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
            empleados.add(oEmpleado);
        }
        return empleados;
    }
    public double getAverageSalarium() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oConexion = new conexion();
        ResultSet rs = oConexion.consultar("AVG(salario)", "bpempleado");
        double resp=0;
        while(rs.next()){
            resp = rs.getDouble(1);
        }
        resp = resp*100;
        resp = Math.floor(resp);
        resp = resp/100;
        return resp;
    }
    public double getMaxSalarium() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oConexion = new conexion();
        ResultSet rs = oConexion.consultar("MAX(salario)", "bpempleado");
        double resp=0;
        while(rs.next()){
            resp = rs.getDouble(1);
        }
        return resp;
    }
    public double getMinSalarium() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        oConexion = new conexion();
        ResultSet rs = oConexion.consultar("MIN(salario)", "bpempleado");
        double resp=0;
        while(rs.next()){
            resp = rs.getDouble(1);
        }
        return resp;
    }
}
