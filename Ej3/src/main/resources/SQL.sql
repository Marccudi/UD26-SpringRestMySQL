CREATE TABLE cajeros (
  id int AUTO_INCREMENT NOT NULL,
  nomapels varchar(100) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE maquinasregistradoras (
  id int AUTO_INCREMENT NOT NULL,
  piso int NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE productos (
  id int AUTO_INCREMENT NOT NULL,
  nombre varchar(100) NOT NULL,
  precio int NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE ventas (
  id int AUTO_INCREMENT NOT NULL,
  cajero int NOT NULL,
  producto int NOT NULL,
  maquinasregistradoras int NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT Venta_ibfk_1 FOREIGN KEY (cajero) REFERENCES cajeros (id),
  CONSTRAINT Venta_ibfk_2 FOREIGN KEY (producto) REFERENCES productos (id),
  CONSTRAINT Venta_ibfk_3 FOREIGN KEY (maquinasregistradoras) REFERENCES maquinasregistradoras (id)
);

INSERT INTO cajeros (nomapels) VALUES ("Tornillo");
INSERT INTO cajeros (nomapels) VALUES ("Claves");
INSERT INTO cajeros (nomapels) VALUES ("Bisagra");
INSERT INTO cajeros (nomapels) VALUES ("Llave");

INSERT INTO maquinasregistradoras (piso) VALUES (1);
INSERT INTO maquinasregistradoras (piso) VALUES (2);
INSERT INTO maquinasregistradoras (piso) VALUES (3);
INSERT INTO maquinasregistradoras (piso) VALUES (4);

INSERT INTO productos (nombre, precio) VALUES ("A",1);
INSERT INTO productos (nombre, precio) VALUES ("B",2);
INSERT INTO productos (nombre, precio) VALUES ("C",3);
INSERT INTO productos (nombre, precio) VALUES ("D",4);

INSERT INTO ventas (cajero,producto,maquinasregistradoras) VALUES (1,1,1);
INSERT INTO ventas (cajero,producto,maquinasregistradoras) VALUES (2,2,2);
INSERT INTO ventas (cajero,producto,maquinasregistradoras) VALUES (3,3,3);
INSERT INTO ventas (cajero,producto,maquinasregistradoras) VALUES (4,4,4);