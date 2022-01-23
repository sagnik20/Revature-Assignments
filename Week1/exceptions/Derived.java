//Demonstrate that a derived-class constructor cannot catch exceptions thrown by its base-class constructor

package com.week1.exceptions;

class Base {
    Base() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

public class Derived extends Base {

    Derived() throws CloneNotSupportedException, RuntimeException {
    	super();
    }

    public static void main(String[] args) {
        try {
            Derived d = new Derived();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        catch(RuntimeException re){}
    }
}