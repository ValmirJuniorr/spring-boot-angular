CREATE TABLE persons (
    id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    active INTEGER,
    street VARCHAR(50),
    number INTEGER,
    complement VARCHAR(50),
    neighborhood VARCHAR(50),
    zip_code VARCHAR(50),
    city VARCHAR(50),
    state VARCHAR(50)   
) ENGINE=InnoDB DEFAUlT CHARSET=utf8; 

INSERT INTO persons (name,active,street,number,complement,neighborhood,zip_code,city,state)
values ("José",1,"Rua Dr.José de Lurdes",312,"Casa","Lagoa seca","321.456.789-32","Crato","Ceará");

INSERT INTO persons (name,active,street,number,complement,neighborhood,zip_code,city,state)
values ("Pedro",1,"Rua Dr.Pedro de Lurdes",312,"Casa","Lagoa seca","321.456.789-32","Crato","Ceará");

INSERT INTO persons (name,active,street,number,complement,neighborhood,zip_code,city,state)
values ("Rafael",1,"Rua Dr.Rafael de Lurdes",312,"Casa","Lagoa seca","321.456.789-32","Crato","Ceará");

INSERT INTO persons (name,active,street,number,complement,neighborhood,zip_code,city,state)
values ("Joaquim",1,"Rua Dr.Joaquim de Lurdes",312,"Casa","Lagoa seca","321.456.789-32","Crato","Ceará");

