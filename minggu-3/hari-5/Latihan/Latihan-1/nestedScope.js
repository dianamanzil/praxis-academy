const hummus=function(factor){
    const ingredient=function(amount, unit, name){
        let ingredientAmount=amount*factor;
        if (ingredientAmount > 1){
            unit +="s";
        }
        console.log('${ingredientAmount} ${unit} ${name}');
    };
    ingredient(1,"can","chickpeas");
    ingredient(0.25,"cup","tahini");
    ingredient(0.25, "cup","lemon juice");
    ingredient(1, "clove", "garlic");
    ingredient(2, "tablespoon", "olive oil");
    ingredient(0.5, "teaspoon", "cumin");

}
let launchMissiles=function(){
    missilesSystem.launch("now");
};
if (safeMode){
    launchMissiles=function(){
        /* do nothing */};
}

console.log("The future says :", future());
function future(){
    return "You'll never have flying cars";
}

function greet(who){
    console.log("Hello"+who);
}
greet("Harry");
console.log("Bye");

function wrapValue(n){
    let local =n;
    return ()=> local;
}
let wrap1=wrapValue(1);
let wrap2=wrapValue(2);
console.log(wrap1());
console.log(wrap2())