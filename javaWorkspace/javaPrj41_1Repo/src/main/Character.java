package main;


class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void attack(Mole mole) {
        System.out.println(name + "이(가) " + mole.getName() + "을(를) 공격합니다!");
        int damage = (int) (Math.random()*10 + 1);
        System.out.println(name + "의 데미지는 " + damage);
        mole.takeDamage(damage);
    }
}