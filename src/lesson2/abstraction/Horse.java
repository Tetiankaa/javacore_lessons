package lesson2.abstraction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Horse extends Animal{
    private String breed;

    public Horse(int legs, boolean brain, String breed) {
        super(legs, brain);
        this.breed = breed;
    }

    public Horse() {
    }

  //  Ctrl+I - реалізуємо абстрактиний метод з Animal
    @Override
    public void scream() {

    }
}
