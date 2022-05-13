import java.util.Date;

public class Inventory implements Comparable<Inventory>{
    private int serialNum;
    private String manufactDate;
    private int lotNum;

    public Inventory() {
        this.serialNum = 0;
        this.manufactDate = new Date(System.currentTimeMillis()).toString();
        this.lotNum = 0;
    }

    public Inventory(int serialNum, String manufactDate, int lotNum) {
        this.serialNum = serialNum;
        this.manufactDate = manufactDate;
        this.lotNum = lotNum;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public String getManufactDate() {
        return manufactDate;
    }

    public int getLotNum() {
        return lotNum;
    }

    public void setLotNum(int lotNum) {
        this.lotNum = lotNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public void setManufactDate(String manufactDate) {
        this.manufactDate = manufactDate;
    }

    @Override
    public String toString() {
        return "Serial Number: " + this.getSerialNum() + "\nManufacture Date: " + this.getManufactDate() +
                "\nLot Number: " + this.getLotNum();
    }

    //This prevents a ClassCastException from being thrown
    @Override
    public int compareTo(Inventory o) {
        return 0;
    }
}
