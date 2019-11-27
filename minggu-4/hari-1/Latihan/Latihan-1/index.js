var s= "";
var n= 0;
var b= false;
var sm= Symbol()
var a=[];
var o={};
var f=function(){}

console.log('typeof s.constructor==>', typeof s.constructor,', name ==>', s.constructor.name);
console.log('typeof n.constructor==>', typeof n.constructor,', name ==>', n.constructor.name);
console.log('typeof b.constructor==>', typeof b.constructor,', name ==>', b.constructor.name);
console.log('typeof sm.constructor==>', typeof sm.constructor,', name ==>', sm.constructor.name);
console.log('typeof a.constructor==>', typeof a.constructor,', name ==>', a.constructor.name);
console.log('typeof o.constructor==>', typeof o.constructor,', name ==>', o.constructor.name);
console.log('typeof f.constructor==>', typeof f.constructor,', name ==>', f.constructor.name);

var mike={name: 'Mike'};
var odd =[1];
var morning = function(){
    return "Greetings!";
}
morning.info='Morning greeting function';
//re-assign to new variables
var evening=morning;
var john=mike;
var even=odd;

//reassign to new variable and modify value
var kate=mike;
kate={name: 'Kate'};

//ressign to new variable and modify value
evening.info='Evening greeting function';
john.name='John';
even[0]=1;

console.log('First ==> ', morning.info, mike,odd);
console.log('Second ==> ', evening.info, john, even);

function Animal(name){
    this.name=name;

    this.getName=function(){
        return 'Animal name is => '+this.name;
    }
}

var a= new Animal('Dog');
console.log('a object ==> ', a);
console.log('a.getName()==> ', a.getName());
console.log('a.constructor === Animal ', a.constructor== Animal);