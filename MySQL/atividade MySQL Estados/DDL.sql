create table Estados (

	id int not null auto_increment,
    nome varchar(100),
    sigla enum("AC","AL","AP","AM","BA","CE","ES","GO","MA"
			  ,"MT","MS","MG","PA","PB","PR","PE","PI","RJ"
			  ,"RN","RS","RO","RR","SC","SP","SE","TO","DF"),
	regiao enum("Norte","Nordeste","Centro-Oeste","Sudeste","Sul"),
    populacao long,
    constraint pk_Estados primary key(id),
    constraint unique_nome unique key(nome)
);