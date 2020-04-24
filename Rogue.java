public class Rogue extends Character {

    public Rogue(String name, int str, int def, int hp){
        super(name, str, def, hp);
        this.strength = str + 5;
        this.defense = def - 3;
        this.health = 100;
    }

}

