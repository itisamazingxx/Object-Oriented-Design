package module4.pactice;

public abstract class Character implements Comparable<Character> {
    
    protected String name;
    protected int health;
    protected int x;
    protected int y;

    public Character(String n, int h, int x, int y) {
        this.name = n;
        this.health = h;
        this.x = x;
        this.y = y;
    }

    
    abstract void attack();
    abstract void takeDemage(int damage);
    
    public int getHealth() {
        return this.health;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Health: %d (%d, %d)", this.name, this.health, this.x, this.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Character character = (Character) obj;
        return name.equals(character.name) && health == character.health && x == character.x && y == character.y;
    }

    @Override
    public int compareTo(Character c) {
        return Integer.compare(this.health, c.health);
    }
    

}
