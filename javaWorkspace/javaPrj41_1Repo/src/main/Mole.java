package main;

class Mole extends Character {
    public Mole(String name, int health) {
        super(name, health);
    }

    public void takeDamage(int damage) {
            int newHealth = getHealth() - damage;
            if (newHealth <= 0) {
                System.out.println(getName() + "이(가) 쓰러졌습니다!");
                setHealth(newHealth);
            } else {
                setHealth(newHealth);
                System.out.println(getName() + "의 체력: " + getHealth());
            }
        }
    }