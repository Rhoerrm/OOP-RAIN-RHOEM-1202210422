
// ini namanya class
public class Customer {
    /* Tipe karakter tesktual
    /*  */
    // tipe karakter tekstual
    public String nama = "Oracle Customer";
    public char sex = 'M';

    // bilangan bulat
    public byte age; //-2^7 s.d 2^7)-1==> 8 bit
    public short customerID; //-2^15 s.d (2^15)-1 ==> 16 bit
    public int balanceinRupiah; //-2^31 s.d (2^31)-1 ==> 32 bit
    public long identityID; //-2^63 s.d (2^63)-1 ==> 64 bit
    public char customerType;

    // bilangan desimal
    public float discount = 0.0F; //32 bit
    public double balanceinDollar = 0.0; //64 bit

    /*konstruktor default (yang dipanggil)
    * Tujuan konstruktor adalah menginisiasikan nilai nilai atribut atau field
    */
    public Customer(){
        this.customerID= 1234;
    }
    
    // Overloading konstruktor (bisa lebih dari 1)
    public Customer (String name, char sex, byte age){
        this(); //ini manggil diatasnya, dan harus di baris pertama
        this.nama = name;
        confirmGender(sex);
        this.age = age;
    }

    // method yang mengembalikan nilai (function)
    public String getName(){
        return this.nama;
    }
    public float getAmount(float amount){
        float newAmount = amount - (this.discount * amount);
        return newAmount;
    }

    public void confirmGender(char sex){
        if (sex != 'M' || sex != 'm'|| sex != 'F'|| sex != 'f'){
            System.out.println("Mohon isi data dengan benar!");
        }else{
            this.sex=sex;
        }
        
    }


    public String confirmcustomerType(char customerType) {
        String confirm="";
        switch(this.customerType) {// char, byte, short, dan int
            case 'A':
                confirm ="Platinum";
                break;
            case 'B':
                confirm = "Gold";
                break;
            case 'c':
                confirm = "Silver";
                break;
            default:
                confirm = "Reguler";
                break;
        }
        return "tipe customer anda adalah" + confirm;
    }
  
    public void forloop() {
        /* $
         * $ $
         * $ $ $
         * $ $ $ $
         * $ $ $ $ $
         */
        bebas: for(byte i = 0; i < 5; i++) {
            System.out.println();
            for (byte j=0; j < 10; j++) {
                System.out.print("$");
                if (j==i){
                    continue bebas;
                }
            }
        }
    }

    // while (true) akan melooping terus
    public void whileDo() {
        byte i = 0;
        while (i < 10) {
            System.out.print("@");
            i++;
        }
    }

    public void doWhile() {
        byte i = 0;
        do {
            System.out. print("#");
            i++;
        }
        while (i<20);
    }

    // boolean (true or false)
    public boolean isGold = false;

    // ini namanya method atau behavior
    // tidak mengembalikan nilai (si void ini tidak mengembalikan nilai)
    public void displayCustomer() {
        System.out.println("Name : " + nama);
        System.out.println("Sex : " + sex);
        System.out.println("Customer ID : " + customerID);
        System.out.println("Age : " + age);
        System.out.println("discount : " + discount);
        System.out.println("Customer type : " );
        System.out.println("=================================");
    }
}
