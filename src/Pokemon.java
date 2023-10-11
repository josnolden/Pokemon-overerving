import java.util.List;

public abstract class Pokemon {
    String name;
    int level;
    int hp;
    String food;
    String sound;
    String type;
    List<String> attacks;
    public Pokemon(String nameInput, int levelInput, int hpInput, String foodInput, String soundInput, String typeInput){
        this.name = nameInput;
        this.level = levelInput;
        this.hp = hpInput;
        this.food = foodInput;
        this.sound = soundInput;
        this.type = typeInput;
    }
    public void setAttacks(List<String> attacksInput){
        this.attacks = attacksInput;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getHp(){
        return hp;
    }
    public int getLevel(){
        return level;
    }
    public String getFood(){
        return food;
    }
    public String getSound(){
        return sound;
    }
    public List<String> getAttacks() {
        return attacks;
    }
    public void decreaseHp(int decreaseBy){
        this.hp -= decreaseBy;
    }
}
