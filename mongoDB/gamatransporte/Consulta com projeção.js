db.getCollection('Passagem').find({"valor" : {$gte:200}},{"passageiro":1,"_id":0})