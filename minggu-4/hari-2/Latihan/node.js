function processData(callback){
    fetchData(function(err, data){
        if(err){
            console.log("An error has occured. Abort everything!");
            return callback(err);
        }
        data+=1;
        callback(data);
    });
}