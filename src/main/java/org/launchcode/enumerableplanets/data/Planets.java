package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury"),
    VENUS("Venus"), EARTH("Earth"), MARS("Mars"), JUPITER("Jupiter"),
    SATURN("Saturn"), URANUS("Uranus"), NEPTUNE("Neptune"), PLUTO("Pluto");



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
