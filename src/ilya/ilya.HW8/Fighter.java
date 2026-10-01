package ilya.ilya.HW8;

public class Fighter {
    private String name;
    private int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Fighter theWinner(Fighter firstFighter,
                                    Fighter secondFighter,
                                    String whoGetFirstAttack) {
        if (whoGetFirstAttack == null) {
            System.out.println("Ошибка: имя первого атакующего не может быть null.");
            return null;
        }
        Fighter fOne;
        Fighter fTwo;
        if (whoGetFirstAttack.equals(firstFighter.getName())) {
            fOne = firstFighter;
            fTwo = secondFighter;
        } else if (whoGetFirstAttack.equals(secondFighter.getName())) {
            fOne = secondFighter;
            fTwo = firstFighter;
        } else {
            System.out.println("Ошибка: имя первого атакующего не соответствует ни одному из бойцов.");
            return null;
        }
        while (fOne.getHealth() > 0 && fTwo.getHealth() > 0) {
            fTwo.setHealth((fTwo.getHealth() - fOne.getDamagePerAttack()));
            System.out.println(
                    fOne.getName() +
                            " attack " + fTwo.getName() +
                            "; " + fTwo.getName() + " now has " + fTwo.getHealth() + " health.");
            if (fTwo.getHealth() <= 0) {
                System.out.println(fTwo.getName() + " is dead. " + fOne.getName() + " wins!");
                return fOne;
            }
            if (fTwo.getHealth() > 0) {
                fOne.setHealth((fOne.getHealth() - fTwo.getDamagePerAttack()));
                System.out.println(
                        fTwo.getName() +
                                " attack " + fOne.getName() +
                                "; " + fOne.getName() + " now has " + fOne.getHealth() + " health.");
                if (fOne.getHealth() <= 0) {
                    System.out.println(fOne.getName() + " is dead. " + fTwo.getName() + " wins!");
                    return fTwo;
                }
            }
        }
        return null;
    }
}

