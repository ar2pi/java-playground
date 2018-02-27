package playground;

/**
 * BinarySearcher
 * 
 * @param {int[]} list List to search through
 */
public class BinarySearcher {

    private int halfcut;
    private int[] list;

    BinarySearcher(int[] list) {
        this.list = list;
        this.halfcut = (int) Math.floor(list.length / 2);
    }

    /**
     * 
     * @param {int} num Value to search for
     * @return {int} Index of found value, -1 if none   
     */
    public int search(int num) {
        if (this.list[halfcut] < num) {
            this.halfcut += (int) Math.ceil((float) (this.list.length - this.halfcut) / 2);
        } else if (this.list[halfcut] > num) {
            this.halfcut -= (int) Math.ceil((float) this.halfcut / 2);
        } else {
            return halfcut;
        }
        if (this.halfcut < list.length && this.halfcut >= 0) {
            return this.search(num);
        }
        return -1;
    }
}