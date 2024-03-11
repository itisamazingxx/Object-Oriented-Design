package module4.pactice;

public class Warrior extends Character{

    public Warrior(String n, int h, int x, int y) {
        super(n, h, x, y);
        //TODO Auto-generated constructor stub
    }

    @Override
    
    public void attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    /**
     * Demage is applied to health and when heath < 0, character eleminated
     */
    @Override
    void takeDemage(int demage) {
        this.health = this.health - demage;
        if (this.health < 0) {

        }
    }
    
}
