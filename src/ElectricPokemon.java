import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");
    public ElectricPokemon(String nameInput, int levelInput, int hpInput, String foodInput, String soundInput){
        super(nameInput, levelInput, hpInput, foodInput, soundInput, "electric");
        setAttacks(attacks);
    }
    public void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with ThunderPunch");
        int damage;
        switch (enemy.getType()){
            case "electric":
                damage = 15;
                break;
            case "fire":
                damage = 25;
                break;
            case "grass":
                damage = 35;
                break;
            default:
                damage = 45;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with ElectroBall");
        int damage;
        switch (enemy.getType()){
            case "electric":
                damage = 20;
                break;
            case "fire":
                damage = 25;
                break;
            case "grass":
                damage = 30;
                break;
            default:
                damage = 35;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with Thunder");
        int damage;
        switch (enemy.getType()){
            case "electric":
                damage = -10;
                break;
            case "fire":
                damage = 25;
                break;
            case "grass":
                damage = 40;
                break;
            default:
                damage = 50;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
    public void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + "  attacks " + enemy.getName() + " with VoltTackle");
        int damage;
        switch (enemy.getType()){
            case "electric":
                damage = 10;
                break;
            case "fire":
                damage = 20;
                break;
            case "grass":
                damage = 30;
                break;
            default:
                damage = 40;
        }
        System.out.println(enemy.getName() + " loses " + damage + " hp");
        enemy.decreaseHp(damage);
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }
}
