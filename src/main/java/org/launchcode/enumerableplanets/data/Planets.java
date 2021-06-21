package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury",2),
    VENUS("Venus",3), EARTH("Earth",4), MARS("Mars",5), JUPITER("Jupiter",6),
    SATURN("Saturn",7), URANUS("Uranus",8), NEPTUNE("Neptune",9), PLUTO("Pluto",1);



    private final String name;

    private final int yearLength;

    Planets(String name, int yearLength){
        this.name=name;
        this.yearLength = yearLength;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

}
