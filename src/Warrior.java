public class Warrior extends Player{
    public Warrior(int hp, int level, String type, String weapon) {
        super(hp, level, type, weapon);
    }
    String armor; // броня

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    @Override
    public String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + armor;
    }

    @Override
    public int levelUp() {
        return level++;
    }

    @Override
    public boolean doDamage() {
        return true;
    }
}
