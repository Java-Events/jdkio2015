package org.rapidpm.demo.jdkio2015.v003;

import org.rapidpm.demo.jdkio2015.v003.services.AddService;
import org.rapidpm.demo.jdkio2015.v003.services.String2Int;

/**
 * Created by sven on 19.01.15.
 *
 * Facade Pattern maybe
 *
 */
public class Controller {
    public Controller() {System.out.println("constructor = " + this.getClass().getSimpleName());
    }

    private AddService addService = new AddService();
    private String2Int string2Int = new String2Int();

    public String add(String v1, String v2){
        int intA = string2Int.convert(v1);
        int intB = string2Int.convert(v2);
        return addService.add(intA, intB) + "";
    }
}
