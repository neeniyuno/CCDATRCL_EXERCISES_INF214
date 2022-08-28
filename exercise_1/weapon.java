public class Weapon 
{
    
    // Weapon attributes
    int damage;
    int weight;
    String name;
    String rarity;
    String description;

    //Weapon method
    public void weaponDescription()
    {
        System.out.println(description + " The " + name + " is a " + rarity + " weapon that has " + damage + " damage and weighted around " + weight + ".");
    }

}
