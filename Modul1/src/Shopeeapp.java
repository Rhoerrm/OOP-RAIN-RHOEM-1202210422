public class Shopeeapp {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();
        Customer cust3 = new Customer();
        Customer cust4 = new Customer("Rhoemanidar", 'F', (byte)19);

        cust1.nama = "Rhoemanidar";
        cust1.age = 19;
        cust1.sex = 'F';
        cust1.customerID = 3245;
        cust1.discount = 0.5F;

        cust2.nama = "Indah rizkiani";
        cust2.age = 19;
        cust2.sex = 'F';
        cust2.customerID = 4578;
        cust2.discount = 0.9F;

        cust3.nama ="san jaegar";
        cust3.age = 19;
        cust3.sex = 'M';
        cust3.discount = 0.225F;

        cust4.discount = 0.1F;

        cust1.displayCustomer();
        cust2.displayCustomer();
        cust3.displayCustomer();
        cust4.displayCustomer();

        String name = cust4.getName();
        System.out.println("Memanggil Customer 4 bernama" + name);
        float amount = cust4.getAmount(500000.0F);
        System.out.println("Jumlah yang harus dibayar Rp"+ amount);

        

        System.out.println(cust1.getName()+ ""+cust1. confirmcustomerType('A'));
        System.out.println(cust2.getName()+ ""+cust2. confirmcustomerType('B'));
        System.out.println(cust3.getName()+ ""+cust3. confirmcustomerType('C'));
        System.out.println(cust4.getName()+ ""+cust4. confirmcustomerType('D'));

        cust1.forloop();
        //cust1.whileDo();
        //cust1.doWhile();
    }

}
