package lesson2.abstraction;

public class Main {
    public static void main(String[] args){
Horse horse = new Horse(4,true,"pfjkf");

//Animal animal = new Animal() - will generate an error
//Animal animal = new Animal(){
    //якщо прописати так, то воно створить новий енімал, навіть якщо у нас визначено abstract
//};
        Animal animal = new Animal(){
            @Override
            public void scream() {
                //саме тут  вказуємо як буде реалізовуватись наш метод
                System.out.println("fffff");
            }
        };
        animal.scream();// виведе "fffff"
}
}
