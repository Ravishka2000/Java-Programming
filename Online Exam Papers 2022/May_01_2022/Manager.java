package May_01_2022;

public class Manager extends Employee{
    private String department;
    private int productNo1,productNo2,productNo3;

    public Manager(String empID, String name, String address, String department, int productNo1, int productNo2, int productNo3) {
        super(empID, name, address);
        this.department = department;
        this.productNo1 = productNo1;
        this.productNo2 = productNo2;
        this.productNo3 = productNo3;
    }

    public void read(){
        super.read();
        System.out.println("Enter Department : ");
        department = sc.next();
        try {
            System.out.println("Enter Product NO 1 : ");
            productNo1 = sc.nextInt();
            System.out.println("Enter Product NO 2 : ");
            productNo2 = sc.nextInt();
            System.out.println("Enter Product NO 3 : ");
            productNo3 = sc.nextInt();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    public void print(){
        super.print();
        System.out.println("Department : " + department);
        System.out.println("Product No 1 : " + productNo1);
        System.out.println("Product No 2 : " + productNo2);
        System.out.println("Product No 3 : " + productNo3);
    }
}
