public class Hero {
    String attack_name = null;
    int damage = 0;

    String defence_name = null;
    int defence_num = 0;

    public void attack1() {
        System.out.println("Uzbrūk: " + attack_name + ", izmantotais spēks: " + damage);
    }

    public void defence1() {
        System.out.println("Aizsargājas: " + defence_name + ", ar spēku: " + damage);
    }
}