package lesson2.generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User<String> stringUser = new User<>();
        //в файллі User ми визначили тип ID, та потім коли ми будемо створювати юзера, то тип який я задам застосується в даному випадку тa у всіх випадках.
        //Я можу створити таких юзерів декілька з різними типами даних напр Integer  і тд
        User<Integer> integerString = new User<Integer>();

        ArrayList<User> users = new ArrayList<>();
        users.add(stringUser);
        users.add(integerString);
        //щоб проітерувати їх(в одному випадку це int, а в іншому це string, потрібно зробити перевірку)
        for (User user : users) {
            if (user.getId() instanceof  String){
                // у випадку якщо це стрінг, то  працюєте з ним як зі стрінгою
            }else if (user.getId() instanceof Integer){
                //у випадку якщо це інтегер, то виконується така умова
            }
        }

    }
}
