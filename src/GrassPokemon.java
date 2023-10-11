import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");
    public GrassPokemon(String nameInput, int levelInput, int hpInput, String foodInput, String soundInput){
        super(nameInput, levelInput, hpInput, foodInput, soundInput, "grass");
        setAttacks(attacks);
    }
    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with LeafStorm");
        int damage;
        switch (enemy.getType()){
            case "grass":
                damage = 15;
                break;
            case "water":
                damage = 25;
                break;
            case "fire":
                damage = 35;
                break;
            default:
                damage = 45;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with SolarBeam");
        int damage;
        switch (enemy.getType()){
            case "grass":
                damage = 20;
                break;
            case "water":
                damage = 25;
                break;
            case "fire":
                damage = 30;
                break;
            default:
                damage = 35;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with LeechSeed");
        int damage;
        switch (enemy.getType()){
            case "grass":
                damage = 5;
                break;
            case "water":
                damage = 10;
                break;
            case "fire":
                damage = 15;
                break;
            default:
                damage = 20;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        name.decreaseHp(-damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with LeaveBlade");
        int damage;
        switch (enemy.getType()){
            case "grass":
                damage = 15;
                break;
            case "water":
                damage = 20;
                break;
            case "fire":
                damage = 30;
                break;
            default:
                damage = 35;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
}
