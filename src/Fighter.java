public class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }


    public static String returnTheWinnerName(Fighter fighter1, Fighter fighter2) {
        while (fighter1.health > 0 && fighter2.health > 0) {
            fighter2.health -= fighter1.damagePerAttack;
            if (fighter2.health < 0) {
                break;
            }
            fighter1.health -= fighter2.damagePerAttack;
            if (fighter1.health < 0) {
                break;
            }
        }
        if (fighter2.health < fighter1.health) {
            return fighter1.name;
        } else {
            return fighter2.name;
        }
    }
}