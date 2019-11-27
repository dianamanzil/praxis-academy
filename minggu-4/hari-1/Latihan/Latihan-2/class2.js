function Hero(name, level){
    this.name=name;
    this.level=level;
}

class Hero{
    constructor(name, level){
        this.name=name;
        this.level=level;
    }

    greet(){
        return `${this.name} says hello.`
    }
}

const hero1= new Hero('Varg', 1);