public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(600,35,"swordman");
        System.out.println(boss.getHealth()+"XP "+" "+boss.getTypeOfAttack()+" damage["+ boss.getDamage()+"]");

        System.out.println("");
        Boss boss2 =new Boss(500,25,"punch");
        System.out.println(boss2.printInfo());

        Sceleton sceleton= new Sceleton(120,10," arrow ",10);
        System.out.println(sceleton.printInfo());
        Sceleton sceleton2= new Sceleton(100,5," fire arrow ",15);
        System.out.println(sceleton2.printInfo());


    }
}