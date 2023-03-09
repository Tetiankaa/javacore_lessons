package lesson2.composition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Truck {
    private String manufacture;
    private int seatCount;
    private Engine engine;
}
