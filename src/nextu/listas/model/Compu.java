package nextu.listas.model;

/**
 *
 * @author arthur.picerna
 */
public class Compu {
    private String mac;
    private String cpu;
    private String ram;
    private String storage;

    public Compu(String mac, String cpu, String ram, String storage) {
        this.mac = mac;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Compu {" + "mac=" + mac + ", cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + '}';
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }


}
