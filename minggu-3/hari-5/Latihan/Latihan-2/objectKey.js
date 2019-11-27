let user={
    name: "John",
    age:30
};
//loop over values
for(let value of Object.values(user)){
    console.log(value);
}
let price={
    banana: 1,
    orange: 2,
    meat: 4,
};
let doublePrices=Object.fromEntries(
    Object.entries(price).map(([key,value])=>[key,value*2])
);
console.log(doublePrices.meat);

function sumSalaries(salaries) {

    let sum = 0;
    for (let salary of Object.values(salaries)) {
      sum += salary;
    }
  
    return sum; // 650
  }
let salaries={
    "John": 100,
    "Pete": 300,
    "Mary": 250
};
console.log(sumSalaries(salaries));