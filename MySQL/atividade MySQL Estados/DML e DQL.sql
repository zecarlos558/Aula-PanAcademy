
select * from Estados;

select * from Estados
where id = 27;

-- Ordenar por sigla
select * from Estados
order by sigla asc;

-- Soma da população por região
select regiao as REGIÃO, sum(populacao) as "População Total" from Estados
group by regiao;

-- Média da população por Região
select regiao as REGIÃO, avg(populacao) as "Média População" from Estados
group by regiao;

-- Exibir estados por região
select  regiao as REGIÃO, group_concat(nome)  as "Estados da Região" from Estados
group by regiao;


insert into Estados (nome, sigla, regiao, populacao) values ("Acre","AC","Norte",869265);
insert into Estados (nome, sigla, regiao, populacao) values ("Amapá","AP","Norte",4080611);
insert into Estados (nome, sigla, regiao, populacao) values ("Amazonas","AM","Norte",829494);
insert into Estados (nome, sigla, regiao, populacao) values ("Tocantis","TO","Norte",1550194);
insert into Estados (nome, sigla, regiao, populacao) values ("Pará","PA","Norte",8578051);
insert into Estados (nome, sigla, regiao, populacao) values ("Roraima","RR","Norte",576568);
insert into Estados (nome, sigla, regiao, populacao) values ("Rondônia","RO","Norte",1787279);
insert into Estados (nome, sigla, regiao, populacao) values ("Ceará","CE","Nordeste",9075649);
insert into Estados (nome, sigla, regiao, populacao) values ("Alagoas","AL","Nordeste",3322820);
insert into Estados (nome, sigla, regiao, populacao) values ("Bahia","BA","Nordeste",14812617);
insert into Estados (nome, sigla, regiao, populacao) values ("Maranhão","MA","Nordeste",7035055);
insert into Estados (nome, sigla, regiao, populacao) values ("Paraíba","PB","Nordeste",3996496);
insert into Estados (nome, sigla, regiao, populacao) values ("Pernambuco","PE","Nordeste",9946294);
insert into Estados (nome, sigla, regiao, populacao) values ("Piauí","PI","Nordeste",3264531);
insert into Estados (nome, sigla, regiao, populacao) values ("Rio Grande do Norte","RN","Nordeste",3479010);
insert into Estados (nome, sigla, regiao, populacao) values ("Sergipe","SE","Nordeste",2278308);
insert into Estados (nome, sigla, regiao, populacao) values ("Goiás","GO","Centro-Oeste",3441998);
insert into Estados (nome, sigla, regiao, populacao) values ("Mato Grosso","MT","Centro-Oeste",2478023);
insert into Estados (nome, sigla, regiao, populacao) values ("Mato Grosso do Sul","MS","Centro-Oeste",3039444);
insert into Estados (nome, sigla, regiao, populacao) values ("Espírito Santo","ES","Sudeste",4016356);
insert into Estados (nome, sigla, regiao, populacao) values ("Minas Gerais","MG","Sudeste",21119536);
insert into Estados (nome, sigla, regiao, populacao) values ("Rio de Janeiro","RJ","Sudeste",16718956);
insert into Estados (nome, sigla, regiao, populacao) values ("São Paulo","SP","Sudeste",45538936);
insert into Estados (nome, sigla, regiao, populacao) values ("Paraná","PR","Sul",11348937);
insert into Estados (nome, sigla, regiao, populacao) values ("Santa Catarina","SC","Sul",6910553);
insert into Estados (nome, sigla, regiao, populacao) values ("Rio Grande do Sul","RS","Sul",11329605);
insert into Estados (nome, sigla, regiao, populacao) values ("Brasília Distrito Federal","DF","Centro-Oeste",11329605);
