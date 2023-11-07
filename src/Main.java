import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Enemy Enemy = new Enemy();

        System.out.println("Izvēlies supervaroni: s- Superman, b- Batman, p- Spiderman");
        String user_choice = input.nextLine();

        switch(user_choice) {
            case "s":
                Hero Superman = new Hero();

                Superman.attack_name = "met tīklu";
                Superman.damage = 10;

                Superman.attack1();

                Enemy.attack_name = "šauj";
                Enemy.damage = 35;

                Enemy.attack_e();

                Superman.defence_name = "lec prom";
                Superman.defence_num = 15;

                Superman.defence1();


                break;

            case "b":
                Hero Batman = new Hero();

                Batman.attack_name = "šauj";
                Batman.damage = 20;

                Batman.attack1();

                Enemy.attack_name = "šauj";
                Enemy.damage = 35;

                Enemy.attack_e();

                Batman.defence_name = "aizlido";
                Batman.defence_num = 30;

                Batman.defence1();
                break;

            case "p":
                Hero Spiderman = new Hero();

                Spiderman.attack_name = "lido";
                Spiderman.damage = 40;

                Spiderman.attack1();

                Enemy.attack_name = "šauj";
                Enemy.damage = 35;

                Enemy.attack_e();

                Spiderman.defence_name = "šauj pretī";
                Spiderman.defence_num = 60;

                Spiderman.defence1();

                break;
        }
    }

}