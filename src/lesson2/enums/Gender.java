package lesson2.enums;


//In Java, an enum is a special data type that represents a fixed set of values.
//        An enum is typically used to define a set of constants that have a specific meaning or purpose.
//separate the constants with a comma. Note that they should be in uppercase letters.
//You can also have an enum inside a class.
public enum Gender {
        MALE(true),FEMALE(false);
        private boolean isYachor;

        Gender(boolean isYachor){
                this.isYachor = isYachor;
        }
}

//        Difference between Enums and Classes
//        An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
//
//        An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
//
//        Why And When To Use Enums?
//        Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.