CREATE TABLE piezas (
  id int AUTO_INCREMENT,
  nombre varchar(100) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE proveedores (
  id varchar(4) NOT NULL,
  nombre varchar(100) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE suministra (
  id int AUTO_INCREMENT,
  codigopieza int NOT NULL,
  proveedorid varchar(4) NOT NULL,
  precio int DEFAULT NULL,
  PRIMARY KEY (id),
  CONSTRAINT Suministra_ibfk_1 FOREIGN KEY (codigopieza) REFERENCES piezas (id),
  CONSTRAINT Suministra_ibfk_2 FOREIGN KEY (proveedorid) REFERENCES proveedores (id)
);

INSERT INTO piezas (nombre) VALUES ("Tornillo");
INSERT INTO piezas (nombre) VALUES ("Claves");
INSERT INTO piezas (nombre) VALUES ("Bisagra");
INSERT INTO piezas (nombre) VALUES ("Llave");

INSERT INTO proveedores (id, nombre) VALUES ("A","Bosh");
INSERT INTO proveedores (id, nombre) VALUES ("B","LG");
INSERT INTO proveedores (id, nombre) VALUES ("C","Brother");
INSERT INTO proveedores (id, nombre) VALUES ("D","Balay");

INSERT INTO suministra (codigopieza,proveedorid,precio) VALUES (1,"A",90);
INSERT INTO suministra (codigopieza,proveedorid,precio) VALUES (2,"B",91);
INSERT INTO suministra (codigopieza,proveedorid,precio) VALUES (3,"C",92);
INSERT INTO suministra (codigopieza,proveedorid,precio) VALUES (2,"D",93);