create table pessoa(

                       id int(11) not null auto_increment primary key,
                       nome varchar(200) not null,
                       cpf varchar(14) not null unique,
                       email varchar(200) not null,
                       telefone varchar(15) default null,
                       sexo varchar(20) not null,
                       dataNascimento date not null
);

INSERT INTO pessoa
(nome,cpf,email,telefone,sexo,dataNascimento)
    value("Pessoa Teste","111.111.111","teste@teste.com","(67)9661-3232",
       "MASCULINO","2021-01-08");


create table endereco(
                         id int(11)not null auto_increment primary key,
                         rua varchar(255) not null,
                         complemento varchar(100) default null,
                         idPessoa int(11) not null,
                         constraint foreign key (idPessoa) references pessoa(id));

select last_insert_id();

INSERT INTO endereco
(rua,complemento,idPessoa)
    value("Rua teste","predio teste apartamento teste");

create table Pacotes(
                        idpacote int(11) not null primary key,
                        preco double not null,
                        nomePacote varchar(50),
                        quantidadeEstoque int(99)
);

INSERT INTO Pacotes

(idpacote,preco,nomePacote)
    value("111","5000","CocaCola","9999")