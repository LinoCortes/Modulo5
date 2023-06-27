

create DATABASE perfilusuario;
use perfilusuario;

CREATE TABLE usuario(
id INT AUTO_INCREMENT,
nombre VARCHAR (100) NOT NULL,
run VARCHAR (100) NOT NULL,
fecha_nacimiento VARCHAR(50) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE cliente(
id_cliente INT AUTO_INCREMENT,
id_usuario INT,
rut VARCHAR(100),
edad INT,
apellido VARCHAR(100),
telefono VARCHAR(20),
afp varchar(20),
direccion VARCHAR(100),
comuna VARCHAR(50), 
PRIMARY KEY (id_cliente),
FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

CREATE TABLE profesional(
id_profesional INT AUTO_INCREMENT,
id_usuario INT,
titulo VARCHAR (100),
fecha_ingreso VARCHAR(100),
PRIMARY KEY (id_profesional),
FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

CREATE TABLE administrativo(
id_administrativo INT AUTO_INCREMENT,
id_usuario INT,
area VARCHAR (100),
exp_previa VARCHAR (100),
PRIMARY KEY (id_administrativo),
FOREIGN KEY (id_usuario) REFERENCES usuario(id)
);

CREATE TABLE capacitaciones(
id INT  PRIMARY KEY AUTO_INCREMENT,
identificador INT,
duracion INT,
cantidadAsistentes INT,
tematica VARCHAR(100),
rutCliente VARCHAR(100),
dia VARCHAR(10),
hora VARCHAR(10),
lugar VARCHAR(100)
);


-- Ingreso de datos a la tabla Capacitaciones
INSERT INTO capacitaciones (identificador, duracion, cantidadAsistentes, tematica,rutCliente,dia,hora, lugar) 
VALUES (-5,2,20,'orden','1212212','lunes','15:00','Providencia');
-- Ingreso de datos a las tablas usuario
INSERT INTO USUARIO (nombre,run,fecha_nacimiento) values ("Martin","1821","02/12/1994");
INSERT INTO USUARIO (nombre,run,fecha_nacimiento) values ("Pedro","1352457","02/12/1994");
INSERT INTO USUARIO (nombre,run,fecha_nacimiento) values ("Sebastian","14574475","02/12/1994");
INSERT INTO USUARIO (nombre,run,fecha_nacimiento) values ("Rafael","18210748","02/11/1992");
INSERT INTO USUARIO (nombre,run,fecha_nacimiento) values ("Sergio","16431524","14/07/2022");
INSERT INTO USUARIO (nombre,run,fecha_nacimiento) values ("Nicolas","1643174","24/06/1990");

-- Ingreso de datos para cada uno de los tipos de usuarios
insert into profesional (id_usuario,titulo,fecha_ingreso) values (1,"Ingeniero biomolecular","14/08/2011");
insert into administrativo (id_usuario,area,exp_previa) values (2,"TI","Gerente de TI");
insert into cliente (id_usuario,rut,edad,apellido,telefono,afp,direccion,comuna) values (3,"4516",65,"Segovia","99004715","Colmena","Las perdices","La florida");
insert into profesional (id_usuario,titulo,fecha_ingreso) values (4,"Prevencionista de riesgo","13/02/2010");
insert into administrativo (id_usuario,area,exp_previa) values (5,"Contabilidad","Jefe de contabilidad");
insert into cliente (id_usuario,rut,edad,apellido,telefono,afp,direccion,comuna) values (6,"14221",22,"Valdés","99143485","Uno","Cuenca","Puente alto");
