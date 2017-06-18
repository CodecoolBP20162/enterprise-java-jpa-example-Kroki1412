package com.codecool.jpaexample.model;


public class CCLocation {

    public enum Location {MISKOLC, BUDAPEST, KRAKOW}

    public Location location;

    public CCLocation(Location location){
        this.location =location;
    }


}
