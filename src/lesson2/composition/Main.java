package lesson2.composition;

public class Main {
    public static void main(String[] args){
        Engine engine = new Engine(2,5,"t400");
        Tractor tractor = new Tractor("xxx",engine);//це композиція
        System.out.println(tractor);
        System.out.println(tractor.getEngine().getMark()); // t400

//        Truck truck = new Truck("ghgh",1,new Engine(1,2,"t400"));//one more possibility to create inside object.
        Tractor tractor1 = new Tractor("ghhg",1,2,"fgd");//це агрегація

    }
}
