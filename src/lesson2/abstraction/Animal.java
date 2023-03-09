package lesson2.abstraction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
abstract public class Animal { // abstract - //щоб заборонити використовувати Animal,як екземпляр(тобто створювати new Animal в Main) але надалі можна було екстендити

    private int legs;
    private boolean brain;

    public Animal(int legs, boolean brain) {
        this.legs = legs;
        this.brain = brain;
    }

    public Animal() {
    }

    public abstract void scream();
}
