db.getCollection('Passagem').update(
    // query 
    {
        "passageiro.nome" : "Ana"
    },
    
    // update 
    { $set: {
            "passageiro.telefone" : "1111-1111"
        }
    },
    
    // options 
    {
        "multi" : false,  // update only one document 
        "upsert" : false  // insert a new document, if no existing document match the query 
    }
);