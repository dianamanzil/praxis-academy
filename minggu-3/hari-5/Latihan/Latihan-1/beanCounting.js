function countBs(kata){
    let count=0
    let huruf='B'
    for(let i=0; i<kata.length; i++){
        if(kata[i]==huruf){
            count++;
        }
    }
    return count;

}
console.log(countBs("BBC"));

function countChar(word, huruf){
    let count=0;
    for(let i=0; i<word.length; i++){
        if(word[i]==huruf){
            count++;
        }
    }
    return count;
}
console.log(countChar("kakkerlak","k"))


