package org.launchcode.enumerableplanets.data;

public enum Planets {
    Mercury("Mercury"),
    Venus("Venus"), Earth("Earth"), Mars("Mars"), Jupiter("Jupiter"),
    Saturn("Saturn"), Uranus("Uranus"), Neptune("Neptune"), Pluto("Pluto");



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
