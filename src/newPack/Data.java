package newPack;

public class Data {
    private String id;
    private String fName;
    private String lName;
    private String yearHire;

    public Data(String id, String fName, String lName, String yearHire){
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.yearHire = yearHire;
    }

    @Override
    public String toString() {
        return "Data ~ " +
                "id = " + id +
                ", fName = '" + fName + '\'' +
                ", lName = '" + lName + '\'' +
                ", yearHire = " + yearHire;
    }
}
