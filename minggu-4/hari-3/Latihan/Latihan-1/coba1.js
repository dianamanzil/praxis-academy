try{
    alert('Start of try runs');
    //..no error here
    console.log('ENd of try runs'); 
}catch(err){
    console.log('Catch is ignored, becaues there are no errors');
}
//contoh exception handling menggunakan asynchronous
setTimeout(function() {
    try {
      noSuchVariable; // try..catch handles the error!
    } catch {
      console.log( "error is caught here!" );
    }
  }, 1000);
