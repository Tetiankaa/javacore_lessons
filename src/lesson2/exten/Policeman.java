package lesson2.exten;

class Policeman extends Human {
    private /*static*/ boolean status; // STATIC - The static keyword is a non-access modifier used for methods and attributes. Static methods/attributes can be accessed without creating an object of a class. Якщо потрібно використувуват дану харектиристику в контексті об'єкта, то це НЕ статична характеристика, а якщо не потрібно, тобто вона ніяк не пов'зана з нашим об'єктом то це статична.Static метод бачить тільки static, не може бачити наприклад public, privat.
}
