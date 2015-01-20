package org.rapidpm.demo.jdkio2015.v002;

/**
 * Created by sven on 19.01.15.
 */
public class AddService {

    public AddService() {
        System.out.println("constructor = " + this.getClass().getSimpleName());
    }

    public int add(int a, int b){
        return a +b;
    }
}
