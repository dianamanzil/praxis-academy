# Error handling,"try..catch"
=========================
Hallo, kali ini kita akan belajar tentang error handling. Apakah itu error handling? Error handling adalah satu penanganan kesalahan (error) pada berbagai macam keadaan dalam pemrograman. 
## The "try...catch" syntax
---------------------
>try{
 >>   //code...
>} catch(err){
 >>   //eror handling
>}

Cara kerja code diatas adalah: 
1. Pertama, code dalam scope **try{...}** dijalankan.
2. Jika dalam code tersebut tidak terdapat error, maka code **catch(err)** diabaiikan.
3. Jika terdapat error, maka code **try** dihentikan, kemudian menjalankan code yang terdapat dalam **catch(err)**.

Lihat contoh pada file 

### try..catch hanya bekerja untuk runtime error

Dalam pemrograman javascript kesalahan penulisan syntax akan menjadikan error pada suatu program tersebut, sehinnga perlu diberi **try..catch** seperti contoh dibawah ini

>try{
>>    {{{{
>} catch(e){
 >>   console.log("The engine can't understand this code, it's valid")
>}

### try..catch bekerja secara synchronous

Jika suatu exception handling terdapat kode "scheduled", seperti setTimeout, maka **try..catch** tidak bekerja. Contoh pemrograman
>try{
>>setTimeout(function(){
>>   noSuchVariable;
>},1000);
>} catch(e){
>>    console.log("won't work);
>}

untuk melakukan exception handling dengan asynchronous dapat dilakukan seperti contoh code berikut:
>setTimeout(function() {
>>  try {
>>>    noSuchVariable; // try..catch handles the error!
 >> } catch {
 >>>   console.log( "error is caught here!" );
 >> }
>}, 1000);

##Error Object