package lesson2.exten;

//The extends keyword extends a class (indicates that a class is inherited from another class).
//
//        In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" into two categories:
//
//        -subclass (child) - the class that inherits from another class
//        -superclass (parent) - the class being inherited from.
class Student extends Human{

    public  Student(String name, int age){
        super(name, age);
    }

    @Override
    public String toString() {
        return "Student{} " + super.toString();//Student{} - характеристик немає + super.toString() - значиьб будемо використовувати батьківсткі характеристики.
    }
}


