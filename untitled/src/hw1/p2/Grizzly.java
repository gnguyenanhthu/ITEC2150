package hw1.p2;

public class Grizzly {
    private static int numGrizzlies = 0;
    protected int id;
    protected String name;

    public Grizzly(String name) {
        this.name = name;
        numGrizzlies++;
        id = numGrizzlies;

    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Grizzly) {
            Grizzly other = (Grizzly) obj;
            return this.id == other.id;
        }
        return true;
    }

}
