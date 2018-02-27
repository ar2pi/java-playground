package playground.model;

import playground.model.Compu;
import java.util.LinkedList;

/**
 *
 * @author arthur.picerna
 */
public class CompuList {
    private LinkedList<Compu> compuList;

    public CompuList() {
        // https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
        this.compuList = new LinkedList();
    }

    public void addCompu(String mac, String cpu, String ram, String storage) {
//        this.compuList.add(0, new Compu(mac, cpu, ram, storage));
        this.compuList.addFirst(new Compu(mac, cpu, ram, storage));
    }

    public Compu removeCompu() {
//        return this.compuList.remove(0);
        return this.compuList.removeFirst();
    }

    public String showCompu(int index) {
        return this.compuList.get(index).toString();
    }

    public String showAll() {
        String compus = "\n";
        for (int i = 0; i < this.compuList.size(); i++) {
            compus += this.showCompu(i) + "\n";
        }
        return compus;
    }
}
