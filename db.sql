CREATE DATABASE bpLaboratorio;
USE bpLaboratorio;
CREATE TABLE bpempleado(
emp_no int primary key auto_increment,
apellido varchar(150),
oficio varchar(150),
dir int,
fecha_alt date,
salario real,
comision real,
dept_no int
);
CREATE TABLE bpdepartamento(
dept_no int primary key auto_increment,
dnombre varchar(150),
loc varchar(150)
);
ALTER TABLE bpempleado ADD CONSTRAINT fk_empleado_departamento FOREIGN KEY (dept_no) REFERENCES bpdepartamento(dept_no);	

INSERT INTO bpdepartamento values (10,'CONTABILIDAD','SEVILLA');
INSERT INTO bpdepartamento values (20,'INVESTIGACION','MADRID');
INSERT INTO bpdepartamento values (30,'VENTAS','BARCELONA');
INSERT INTO bpdepartamento values (40,'PRODUCCION','BILBAO');

INSERT INTO bpempleado values (7369,'SANCHEZ','EMPLEADO',7902,'1990-12-17',1040,null,20);
INSERT INTO bpempleado values (7499,'ARROYO','VENDEDOR',7698,'1990-02-20',1500,390,30);
INSERT INTO bpempleado values (7521,'SALA','VENDEDOR',7698,'1991-02-22',1625,650,30);
INSERT INTO bpempleado values (7566,'JIMENEZ','DIRECTOR',7839,'1991-04-02',2900,null,20);
INSERT INTO bpempleado values (7654,'MARTIN','VENDEDOR',7698,'1991-09-29',1600,1020,30);
INSERT INTO bpempleado values (7698,'NEGRO','DIRECTOR',7839,'1991-05-01',3005,null,30);
INSERT INTO bpempleado values (7782,'CEREZO','DIRECTOR',7839,'1991-06-09',2885,null,10);
INSERT INTO bpempleado values (7788,'GIL','ANALISTA',7566,'1991-11-09',3000,null,20);
INSERT INTO bpempleado values (7839,'REY','PRESIDENTE',null,'1991-11-17',4100,null,10);
INSERT INTO bpempleado values (7844,'TOVAR','VENDEDOR',7698,'1991-09-08',1350,0.00,30);
INSERT INTO bpempleado values (7876,'ALONSO','EMPLEADO',7788,'1991-09-23',1430,null,20);
INSERT INTO bpempleado values (7900,'JIMENO','EMPLEADO',7698,'1991-12-03',1335,null,30);
INSERT INTO bpempleado values (7902,'FERNANDEZ','ANALISTA',7566,'1991-12-03',3000,null,20);
INSERT INTO bpempleado values (7934,'MUÑOZ','EMPLEADO',7782,'1992-01-23',1690,null,10);