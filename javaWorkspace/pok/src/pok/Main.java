package pok;
import java.util.Random;
import java.util.Scanner;

class Main {
    private String name;
    private String type;
    private int hp;
    private int attack;

    public Pokemon(String name, String type, int hp, int attack) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHP() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }
}

public class PokemonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 사용자 포켓몬 생성
        Pokemon userPokemon = new Pokemon("피카츄", "전기", 100, 20);

        // 랜덤 상대 포켓몬 생성
        String[] opponentNames = {"파이리", "꼬부기", "이상해씨"};
        String opponentName = opponentNames[random.nextInt(opponentNames.length)];
        Pokemon opponentPokemon = new Pokemon(opponentName, "불꽃", 100, 15);

        System.out.println("당신의 포켓몬: " + userPokemon.getName());
        System.out.println("상대 포켓몬: " + opponentPokemon.getName());

        while (userPokemon.getHP() > 0 && opponentPokemon.getHP() > 0) {
            System.out.println("\n어떤 공격을 사용하시겠습니까? (1. 일반 공격 / 2. 특수 공격)");
            int choice = scanner.nextInt();

            int userDamage = 0;
            int opponentDamage = 0;

            if (choice == 1) {
                userDamage = random.nextInt(userPokemon.getAttack());
                opponentDamage = random.nextInt(opponentPokemon.getAttack());
            } else if (choice == 2) {
                userDamage = random.nextInt(userPokemon.getAttack() + 10);
                opponentDamage = random.nextInt(opponentPokemon.getAttack() + 10);
            }

            opponentPokemon.takeDamage(userDamage);
            userPokemon.takeDamage(opponentDamage);

            System.out.println("당신의 " + userPokemon.getName() + "이(가) " + opponentPokemon.getName() + "에게 " + userDamage + "의 데미지를 입혔습니다.");
            System.out.println(opponentPokemon.getName() + "이(가) 당신의 " + userPokemon.getName() + "에게 " + opponentDamage + "의 데미지를 입혔습니다.");

            System.out.println("당신의 " + userPokemon.getName() + " 체력: " + userPokemon.getHP());
            System.out.println(opponentPokemon.getName() + " 체력: " + opponentPokemon.getHP());
        }

        if (userPokemon.getHP() <= 0) {
            System.out.println("당신의 포켓몬이 패배했습니다.");
        } else {
            System.out.println("당신의 포켓몬이 승리했습니다!");
        }
    }
}

