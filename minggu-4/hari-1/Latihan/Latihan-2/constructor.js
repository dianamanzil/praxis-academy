function Hero(name, level){
    this.name=name;
    this.level=level;
}
Hero.prototype.greet=function(){
    return `${this.name} says hello.`;
}