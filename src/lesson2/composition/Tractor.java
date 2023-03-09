package lesson2.composition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tractor {
    private String model;
    private Engine engine;

    public Tractor(String model, int volume, int power, String mark) {
       this.model=model;
       this.engine=new Engine(volume,power,mark);
    }
}
