package lesson2.composition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine {

    private int volume;
    private  int power;
    private  String mark;

}

//    Composition in Java is a way of creating more complex objects by combining simpler objects together. It allows you to build objects that are composed of other objects, in a way that enables reusability, flexibility, and maintainability.
//
//        In composition, an object is created by combining one or more other objects of different classes, where the combined objects become part of the newly created object. This means that the combined objects cannot exist independently of
//        the newly created object. In other words, the lifetime of the combined objects is dependent on the lifetime of the newly created object.