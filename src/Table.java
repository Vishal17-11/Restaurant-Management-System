public class Table {

    private int tableNo;
    private boolean isOccupied;

    public Table(boolean isOccupied, int tableNo) {
        this.isOccupied = isOccupied;
        this.tableNo = tableNo;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }
}
