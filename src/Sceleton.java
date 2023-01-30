public class Sceleton extends Boss {
    private int arrows;

    public Sceleton(int health, int damage, String typeOfAttack, int arrows) {
        super(health, damage, typeOfAttack);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;

    }

    public String printInfo( ) {
       return super.printInfo()+"Arrows limit: "+this.arrows;
    }
}

