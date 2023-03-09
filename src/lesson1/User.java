//package lesson1;
//
//import lombok.*;
//
//import java.util.ArrayList;
//
////Variables are containers for storing data values.
////
////        In Java, there are different types of variables, for example:
////
////        String - stores text, such as "Hello". String values are surrounded by double quotes
////        int - stores integers (whole numbers), without decimals, such as 123 or -123
////        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
////        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
////        double - is a data type that can store fractional numbers from 1.7e−308 to 1.7e+308.
////               Note that you should end the value with a "d":
////        boolean - stores values with two states: true or false
////To create a variable, you must specify the type and assign it a value:
//@NoArgsConstructor //- it is changed the default constructor, like "public User() {}"
//@AllArgsConstructor // - all items will be used
//@ToString
//@Getter
//@Setter
////@FieldDefaults(level = AccessLevel.PUBLIC) - щоб в кожному рядку не писати, що всі поля публічні.
//public class User {
//    public String name;
//    public int age;
//    public boolean status;
//    public double weight;

   // private - access within the class

   // **************************
//    long age = 31L - це найчастіше буде використовуватися та short
    //byte age; -128 +127
//    short age; -32000 +32000
//    **********************************

//public String toString(){
//    return this.name + " " + this.age;
//
//}

//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", status=" + status +
//                ", weight=" + weight +
//                '}';
//    }
////    ****************************
//    //Це дефолтний конструктор. Його потрібно  визначати ЗАВЖДИ, тому що потім можуть виникнути проблеми.
////    public User{
////
////    }
//
//    public User(String name, int age, boolean status, double weight){
//        this.name = name;
//        this.age = age;
//        this.status=status;
//        this.weight=weight;
//    }

//    Щоб цього всього не прописувати можна користуватись анотаціями.(getter, setter) ↑

//    String[] skills; //- we add new array skills of our user
    // Another way to create array of skills
//    ArrayList<String> skills;
//}
