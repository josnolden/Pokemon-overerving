import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{
    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");
    public WaterPokemon(String nameInput, int levelInput, int hpInput, String foodInput, String soundInput){
        super(nameInput, levelInput, hpInput, foodInput, soundInput, "water");
        setAttacks(attacks);
    }
    public void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with Surf");
        int damage;
        switch (enemy.getType()){
            case "water":
                damage = 15;
                break;
            case "grass":
                damage = 25;
                break;
            case "electric":
                damage = 35;
                break;
            default:
                damage = 45;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with HydroPump");
        int damage;
        switch (enemy.getType()){
            case "water":
                damage = 20;
                break;
            case "grass":
                damage = 25;
                break;
            case "electric":
                damage = 30;
                break;
            default:
                damage = 35;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with HydroCanon");
        int damage;
        switch (enemy.getType()){
            case "water":
                damage = 10;
                break;
            case "grass":
                damage = 20;
                break;
            case "electric":
                damage = 30;
                break;
            default:
                damage = 40;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with RainDance");
        int damage;
        switch (enemy.getType()){
            case "water":
                damage = 10;
                break;
            case "grass":
                damage = -10;
                break;
            case "electric":
                damage = 0;
                System.out.println("has no effect on " + enemy.getName());
                break;
            default:
                damage = 50;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
}

