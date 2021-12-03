import java.util.HashMap;
import java.util.Iterator;

public class Cafe
{
  private String name;
  private HashMap<String, Beverage> menus = new HashMap<String, Beverage>();

  public Cafe(String name)
  {
    this.name = new String(name);
  }

  public String toString()
  {
    String msg = " Cafe Name : " + name + " Beverage Count: " + menus.size()+ "\n";
    Iterator<Beverage> values = menus.values().iterator();
    while (values.hasNext())
      msg += "\t" + values.next() + "\n";
    return msg;
  }

  @Override
  public int hashCode()
  {
    return menus.hashCode() + name.hashCode();
  }

  @Override
  public boolean equals(Object o)
  {
    if (o instanceof Cafe) {
      Cafe c = (Cafe) o;
      return c.name.equals(this.name) && this.menus.equals(c.menus);
    }
    return false;
  }

  public void removeAllBeverage()
  {
    menus.clear();
  }

  public void addBeverage(Beverage newBeverage)
  {
    menus.put(newBeverage.getBeverageName(), newBeverage);
  }

  public Beverage findBeverage(String name, String type)
  {
    Beverage b = new Beverage(name, type);
    if (menus.values().contains(b))
      return b;
    else
      return null;
  }

}