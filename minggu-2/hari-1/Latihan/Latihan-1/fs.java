//pure function
public class ObjectWithPureFunction{
    public int sum(int a, int b){
        return a+b;
    }
}
//non pure function
public class ObjectWithNonPureFunction{
    private int value = 0;

    public int add(int nextValue) {
        this.value += nextValue;
        return this.value;
    }
}
//High Order Function
public class HigherOrderFunction{
    public <T> IFactory<T> createFactory (IProducer<T> producer, IConfigurator <T> configurator){
        return ()->
        T instance = producer.produce();
        configurator.configure(instance);
        return instance;
    }
}
//functional interface
public interface IFactory<T>{
    T create();
}
public interface IProducer<T>{
    T produce();
}
public interface IConfigurator{
    void configure(T t);
}
//no external state
public class Calculator{
    public int sum(int a, int b){
        return a+b;
    }
}
//external state
public class Calculator{
    private int intVal =5;
    public int sum(int a){
        return intVal +a;
    }
}
//functional interface
public interface MyInterface{
    public void run();
}
public interface MyInterface2{
    public void run();

    public default void doIt(){
        System.out.println("doing it");
    }
    public static void doItStatistically(){
        System.out.println("doing it statically");
    }
}