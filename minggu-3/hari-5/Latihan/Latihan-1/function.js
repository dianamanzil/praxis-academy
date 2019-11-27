const square = function(x){
    return x*x;
};
//memanggil fungsi
console.log(square(12));

const makeNoise=function(){
    console.log("Pling");
}
//memanggil fungsi makeNoise()
makeNoise();

const power = function(base, exponent) {
    let result = 1;
    for (let count = 0; count < exponent; count++) {
      result *= base;
    }
    return result;
  };
  
  console.log(power(3, 10));
  // → 1024

const halve = function(n){
    return n/2;
};
let n=10;
console.log(halve(100));
console.log(n);
