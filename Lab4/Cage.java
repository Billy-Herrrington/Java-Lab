package Lab4;

public class Cage {
    private String cage_list;
    public Cage() {
        super();
    }

    public void Cage(String cage_list){
        this.cage_list = cage_list;
    }

    public String toString() {
        return String.valueOf(cage_list);
    }
}
