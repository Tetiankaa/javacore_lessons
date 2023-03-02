package lesson1;

import java.util.ArrayList;

//In Java, every application begins with a class name,
// and that class must match the filename.
//A class should always start with an uppercase first letter.
//    The main() method is required and any code inside the main() method will be executed.
//        The curly braces {} marks the beginning and the end of a block of code.
//        System is a built-in Java class that contains useful members, such as out, which is short for "output".
//        The println() method, short for "print line", is used to print a value to the screen (or a file).
//There is also a print() method, which is similar to println().
//        The only difference is that it does not insert a new line at the end of the output
//psvm
public class Main {
    //sout
    public static void main(String[] args) {
        System.out.println("hello");
//        Ячейка userInstance буде побудована за допомогою конструктора User.
//        User userInstance = new User();
//        System.out.println(userInstance);

//        userInstance.name = "Tanya";
//        userInstance.age = 26;
//        userInstance.status = false;
//        userInstance.weight = 47.5;
//        System.out.println(userInstance.name);
//        System.out.println(userInstance.age);
//        System.out.println(userInstance.status);
//        System.out.println(userInstance.weight);

//        System.out.println(userInstance.toString());

//        User userInstance = new User("kokos",25,true, 15.4);
//        System.out.println(userInstance);
//        userInstance.setName("tanya");
//        System.out.println(userInstance.getName());
//        System.out.println(userInstance.isStatus());
//***********************

//        System.out.println(userInstance);

       // One more possibility to write array of skills:
//        String[] skills = {"java","python"};


//        for (int i = 0; i < skills.length; i++) {
//            String skill = skills[i];
//
//        }
       /* *********/
//        for (String skill : skills) {
//       !!!   instead "of" will be":" !!!
//        }

        // Another way to create array of skills
        ArrayList <String> skills = new <String>ArrayList();
        skills.add("java");
        skills.add("python");

        System.out.println(skills);
    }
}
