package lesson2.enums;

public class Main {
    public static void main(String[] args){

        User user = new User(1,"tanya",Gender.MALE);//Shift+Enter+пробіл and it will show a choise
        System.out.println(user);
        Gender gender = user.getGender();
        System.out.println(gender.ordinal()); // витягне порядковий номер гендера(0)
    }
}
