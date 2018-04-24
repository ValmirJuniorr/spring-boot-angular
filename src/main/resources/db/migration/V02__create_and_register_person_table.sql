CREATE TABLE persons (
    id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    active INTEGER,
    stret VARCHAR(50),
    complement VARCHAR(50),
    neighborhood VARCHAR(50),
    zipCode VARCHAR(50),
    city VARCHAR(50),
    estate VARCHAR(50),
    
) ENGINE=InnoDB DEFAUlT CHARSET=utf8; 

INSERT INTO persons (name,active,street,complement,neighborhood,zipCode,city,state)
values ("José","Rua Dr.José de Lurdes","Casa","Lagoa seca","321.456.789-32","Crato","Ceará");

INSERT INTO persons (name,active,street,complement,neighborhood,zipCode,city,state)
values ("Pedro","Rua Dr.Pedro de Lurdes","Casa","Lagoa seca","321.456.789-32","Crato","Ceará");

INSERT INTO persons (name,active,street,complement,neighborhood,zipCode,city,state)
values ("Rafael","Rua Dr.Rafael de Lurdes","Casa","Lagoa seca","321.456.789-32","Crato","Ceará");

INSERT INTO persons (name,active,street,complement,neighborhood,zipCode,city,state)
values ("Joaquim","Rua Dr.Joaquim de Lurdes","Casa","Lagoa seca","321.456.789-32","Crato","Ceará");

