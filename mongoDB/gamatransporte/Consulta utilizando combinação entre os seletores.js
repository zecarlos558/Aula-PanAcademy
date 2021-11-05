db.getCollection('Passagem').find({"passageiro.nome":"Jenifer","dataHora": {$gte:
ISODate('2021-07-12 11:00:00.000Z') }})