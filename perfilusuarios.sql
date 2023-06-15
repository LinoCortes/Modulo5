create DATABASE perfilusuario;

use perfilusuario;
CREATE TABLE usuario(
id INT AUTO_INCREMENT,
nombre VARCHAR (100) NOT NULL,
correo VARCHAR (100) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE cliente(
id_cliente INT AUTO_INCREMENT,
id_usuario INT,
direccion VARCHAR(100),
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

INSERT INTO capacitaciones (identificador, duracion, cantidadAsistentes, tematica,rutCliente,dia,hora, lugar) 
VALUES (5,2,20,'orden','1212212','lunes','15:00','Providencia');

SELECT * FROM capacitaciones;



