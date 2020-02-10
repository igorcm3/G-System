

-- Banco de dados para a academia Body Master
-- owner database: Igor Corona de Matos

-- A idéia é ajudar a controlar as informações de clientes de uma academia. 
-- por uma aplicação desktop em java
-- posteriormente em Android... 


-- CRIAÇÃO DAS TABELAS
create database Gym;
use  Gym;
-- drop database gym;
create table Empresa (
	idEmpresa int not null auto_increment,
	fantasia varchar(50),
    razaoSocial varchar(50),
    cpfcnpj varchar(14),
    primary key (idEmpresa)
);

create table Enderecos (
	idEndereco int not null auto_increment,
	endereco varchar(200),
    numero varchar(10),
    complemento varchar (150),
    referencia varchar (200),
    cep varchar(8),
    cidade varchar(50),
    uf varchar(2),
    primary key (idEndereco)
);

create table Personal (
	idPersonal int not null auto_increment ,
	nome varchar(50),
    rgcpf varchar(11),
    descricao varchar(500),
    primary key (idPersonal)
);

create table Treino (
	idTreino int not null auto_increment,
    descricao varchar(200),
    nome varchar(50),
    diasSemana varchar(50),
    quantidadeSemana int,
    primary key (idTreino)
);

create table Mensalidade (
	idMensalidade int not null auto_increment,
    valor float,
    idTreino int,
    primary key (idMensalidade),
    foreign key  (idTreino) references Treino (idTreino) 
); 

create table Aluno (
	idAluno int not null auto_increment,
    nome varchar (50),
    celular varchar (11),
    sexo char (1),
    rgcpf varchar (11),
    idEndereco int,
    idPersonal int,
    idMensalidade int,
    primary key (idAluno),
    foreign key (idEndereco) references Enderecos (idEndereco),
    foreign key (idPersonal) references Personal (idPersonal),
    foreign key (idMensalidade) references Mensalidade (idMensalidade)
);

create table Medidas (
	idMedidas int not null auto_increment,
    idAluno int not null,
    cintura varchar (3),
    quadril varchar (3),
    busto varchar (3),
    coxa varchar (3),
    panturrilha varchar (3),
    peitoral varchar (3),
    braco varchar (3),
    peso varchar (5),
    altura varchar(3),    
    pctGordura float,
    primary key (idMedidas),
	foreign key  (idAluno) references Aluno (idAluno)  
);

create table Receber (
	idReceber int not null auto_increment,
    pago boolean,
    dataPagamento date, 
    idAluno int not null,
    primary key (idReceber),
    foreign key  (idAluno) references Aluno (idAluno)  
);

insert into empresa values(1,'Academia Body Master', 'Vagner Vanchett', '0000000') ;
insert into Aluno values (0, 'Gabriela Rhoden', '9999999', 'F', '05805805805', 1, null , 1);




select * from aluno;
select * from mensalidade;


    
