# JavaEE

mysql> create database javaee;
Query OK, 1 row affected (0.01 sec)

mysql> use javaee;
Database changed
mysql> create table Usuarios(
    -> usuario_id int(10) primary key not null auto_increment,
    -> nombre varchar(25),
    -> apepat varchar(25),
    -> apemat varchar(25),
    -> ciudad_id int(10),
    -> estado varchar(25));
Query OK, 0 rows affected (0.02 sec)

mysql> create table Ciudades(
    -> ciudad_id int(10) primary key not null auto_increment,
    -> nombre varchar(25),
    -> estado varchar(25));
Query OK, 0 rows affected (0.01 sec)
