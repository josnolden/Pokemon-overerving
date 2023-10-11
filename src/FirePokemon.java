import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");
    public FirePokemon(String nameInput, int levelInput, int hpInput, String foodInput, String soundInput){
        super(nameInput, levelInput, hpInput, foodInput, soundInput, "fire");
        setAttacks(attacks);
    }
    public void inferno(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with Inferno");
        int damage;
        switch (enemy.getType()){
            case "fire":
                damage = 15;
                break;
            case "electric":
                damage = 25;
                break;
            case "water":
                damage = 35;
                break;
            default:
                damage = 45;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with PyroBall");
        int damage;
        switch (enemy.getType()){
            case "fire":
                damage = 20;
                break;
            case "electric":
                damage = 25;
                break;
            case "water":
                damage = 30;
                break;
            default:
                damage = 35;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with FireLash");
        int damage;
        switch (enemy.getType()){
            case "fire":
                damage = 10;
                break;
            case "electric":
                damage = 20;
                break;
            case "water":
                damage = 35;
                break;
            default:
                damage = 50;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with FlameThrower");
        int damage;
        switch (enemy.getType()){
            case "fire":
                damage = 20;
                break;
            case "electric":
                damage = 25;
                break;
            case "water":
                damage = 35;
                break;
            default:
                damage = 40;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
}
