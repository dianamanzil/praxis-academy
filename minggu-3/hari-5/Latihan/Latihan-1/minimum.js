function min(a,b){
    if (a<b){
        return a;
    }else if(a>b){
        return b;
    }else if(a==b){
        return("Bilangan Sama!!!")
    }
}
console.log(min(0,10));
console.log(min(0,-10));