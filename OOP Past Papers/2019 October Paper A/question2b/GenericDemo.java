package question2b;

public class GenericDemo {
    public static void main(String[] args) {

        AscendingTable<Integer, String> myTable = new AscendingTable<>();
        myTable.add(40, "ddd");
        myTable.add(10, "aaa");
        myTable.add(30, "ccc");
        myTable.add(20, "bbb");

        AscendingTable<Integer, Double> myTableD = new AscendingTable<>();
        myTableD.add(40, 10.123);
        myTableD.add(30, 23.456);
        myTableD.add(20, 34.567);
        myTableD.add(10, 45.678);

        AscendingTable.display(myTable);
        AscendingTable.display(myTableD);

    }
}
