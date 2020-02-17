package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury", 88, 105946),
    VENUS("Venus", 225, 78339),
    EARTH("Earth", 365, 66622),
    MARS("Mars", 687, 53858),
    JUPITER("Jupiter", 4333, 29205),
    SATURN("Saturn", 10759, 21562),
    URANUS("Uranus", 30687, 15209),
    NEPTUNE("Neptune", 60200, 12158);


    private final String name;
    private final int yearLength;
    private final int orbitVelocity;

    Planets(String name, int yearLength, int orbitVelocity) {
        this.name = name;
        this.yearLength = yearLength;
        this.orbitVelocity = orbitVelocity;
    }

    public String getName(){
        return this.name;
    }

    public int getYearLength(){
        return this.yearLength;
    }

    public int getOrbitVelocity() {
        return orbitVelocity;
    }
}
