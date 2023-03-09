package lesson2.exten;

public class Main {

    public static void main(String[] args){
      Student student = new Student("vasya",26);// Student достукується тільки до публічних методів Human
        System.out.println(student);//Human{name='vasya', age=26}.To avoid it- need to apply toString in class Student. Answer:Student{} Human{name='vasya', age=26}
    }
}


//difference betwen composition and extension
//Якщо ми говоримо що людина Є студентом, то це extension, а якщо трактор МАЄ двигун то це композиція.
//!!! The key difference between composition and inheritance is that composition involves creating an object by combining other objects, while inheritance involves creating a new class
// that inherits the fields and methods of an existing class.

//***********
//
//        Composition and inheritance (also known as extension) are two fundamental concepts in object-oriented programming that allow you to build complex and flexible systems. While both concepts allow you to reuse code, they are fundamentally different in their approach.
//
//        Composition is a way of creating more complex objects by combining simpler objects together. In composition, an object is created by combining one or more other objects of different classes, where the combined objects become part of the newly created object. This means that the combined objects cannot exist independently of the newly created object.
//
//        Inheritance, on the other hand, is a way of creating a new class that is a subclass of an existing class. The new class inherits all the fields and methods of the existing class, and can also add new fields and methods or override existing ones.
//In summary, composition and inheritance are two different ways of creating more complex objects in object-oriented programming. Composition involves creating an object by combining other objects, while inheritance involves creating a new class that inherits the fields and methods of an existing class.