public class Boss extends GameEnitity{
    Weapon weapon =new Weapon(" blade "," katana ");



    public Boss(int health, int damage, String typeOfAttack) {
        super(health, damage, typeOfAttack);
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return  this.getTypeOfAttack()+" " +this.getHealth()+" ["+this.getDamage()+"] ";
    }

}
