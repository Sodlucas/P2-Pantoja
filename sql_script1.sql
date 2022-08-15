drop database if exists p2;
create database if not exists p2;
use p2;

CREATE TABLE CLIENTE (
idCliente int auto_increment not null,
nome varchar(50),
telefone varchar(20),
usuario varchar(30),
senha varchar(25),
PRIMARY KEY (idCliente));

SELECT * FROM CLIENTE

INSERT INTO CLIENTE VALUES (null, 'Valmir', '21969697171', 'gay', 'bicha') 