package lesson2.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
//The @Data annotation generates several standard methods for a class automatically, including:
//
//        Getters and setters for all non-static fields
//        A toString() method that returns a string representation of the object, useful for debugging
//        An equals() and a hashCode() method for comparing objects
public class User {
    private int id;
    private String name;
    private  Gender gender;

}
