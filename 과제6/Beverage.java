package edu.pnu.admin;

public class Beverage {
    private String type;
    private String name;

    public Beverage(String name, String type) {
        this.type = type;
        this.name = name;
    }

    public String getBeverageName()
    {
        return name;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", name, type);
    }

    @Override
    public int hashCode() {
        return type.hashCode() + name.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Beverage))
            return false;
        Beverage b = (Beverage) o;
        return b.type.equals(this.type) && b.name.equals(this.name);
    }
}
