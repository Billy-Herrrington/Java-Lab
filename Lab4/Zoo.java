package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Cage> cages = new ArrayList<>();

    public List<Cage> getCages() {
        return cages;
    }

    public void setCages(List<Cage> cages) {
        this.cages = cages;
        cages.add(new Cage());
    }

    public void getCountOfAnimals(){
    }
    public  void addCage(){

    }
}
