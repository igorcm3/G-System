

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
    codigo varchar(6),
	fantasia varchar(50),
    razaoSocial varchar(50),
    cpfcnpj varchar(14),
    primary key (idEmpresa)
);

create table Enderecos (
	idEndereco int not null auto_increment,
    codigo varchar(6),
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
    codigo varchar(6),
	nome varchar(50),
    rgcpf varchar(11),
    descricao varchar(500),
    primary key (idPersonal)
);

create table Treino (
	idTreino int not null auto_increment,
    codigo varchar(6),
    descricao varchar(200),
    nome varchar(50),
    diasSemana varchar(50),
    quantidadeSemana int,
    primary key (idTreino)
);

create table Mensalidade (
	idMensalidade int not null auto_increment,
    pago boolean,
    codigo varchar(6),
    valor float,
    dataPagamento date,
    id_treino int,
    primary key (idMensalidade),
    foreign key  (id_Treino) references Treino (idTreino)
); 



create table Medidas (
	idMedidas int not null auto_increment,
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
    primary key (idMedidas)
);

create table Aluno (
	idAluno int not null auto_increment,
    codigo varchar (6),
    nome varchar (50),
    celular varchar (11),
    sexo char (1),
    rgcpf varchar (11),
    idEndereco int not null,
    idPersonal int,
    idMedidas int,
    idMensalidade int not null,
    primary key (idAluno),
    foreign key (idEndereco) references Enderecos (idEndereco),
    foreign key (idPersonal) references Personal (idPersonal),
    foreign key (idMensalidade) references Mensalidade (idMensalidade),
    foreign key (idMedidas) references Medidas (idMedidas)
);


insert into Enderecos values (0,'0001', 'Rua Oscar Von Hohenbruch', '281', 'Apartamento 101', 'Prédio de esqquina com as creches', '89650000', 'Treze Tílias', 'SC');
insert into Mensalidade values (0, False, '0001', 70.00, curdate(),null);

insert into Aluno values (0, '0001', 'Gabriela Rhoden', '9999999', 'F', '05805805805', 1, null, null, 1);

-- select * from Enderecos;
-- select * from Mensalidade;
-- select * from Medidas;


select a.nome, m.valor, m.pago from Aluno a left join Mensalidade m on (m.idMensalidade = a.idMensalidade);

    
