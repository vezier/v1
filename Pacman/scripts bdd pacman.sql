-- creación de tablas


create table mesa(
  	numero int primary key,
    id_cuenta int references cuenta(id_cuenta) 
);


create table consumible (
	id_consumible int auto_increment primary key,
 	nombre varchar(99) not null,
    precio int not null
);


create table cuenta(
	id_cuenta int auto_increment primary key, 
    estado_cuenta int default 0
);


create table comanda(
	id_lista int not null auto_increment primary key,
	id_cuenta int references cuenta(id_cuenta),
 	id_consumible int references consumible(id_consumible),
 	comentario varchar(200)
);



