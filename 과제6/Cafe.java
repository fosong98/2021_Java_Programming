package edu.pnu.admin;
import edu.pnu.collection.*;

public class Cafe {
    private String name;
    private GenericList<Beverage> menus = new GenericList<Beverage>();

    public Cafe(String name) { this.name = new String(name); }

    public void removeAllBeverage() {
        menus.clear();
    }

    public void addBeverage(Beverage newBeverage) {
        menus.add(newBeverage);
    }

    public Beverage findBeverage(String name, String type)
    {
        Beverage b = new Beverage(name, type);
        return menus.find(b);
    }

    @Override
    public String toString()
    {
        String msg = " Cafe Name : " + name + " Beverage Count: " + menus.size() + "\n";
        return msg + menus.toString();
    }

    @Override
    public int hashCode() { return menus.hashCode() + name.hashCode(); }

    @Override
    public boolean equals(Object o)
    {
        if (o instanceof Cafe) {
            Cafe c = (Cafe)o;
            return c.name.equals(this.name) && this.menus.equals(c.menus);
        }
        return false;
    }
}
