import java.util.Scanner;
public class Menu {
    String name;
    String category;
    int price;
    
    public static void main(String[]args){
        Database db = new Database();

        Menu menu1 = new Menu();
        menu.setName("Bakso");
        menu.setcategory("Makanan");        
        menu.setPrice("Rp. 10000");

        Menu menu2 = new Menu();
        menu.setName("Es teh");
        menu.setcategory("Minuman");        
        menu.setPrice("Rp. 5000");

        Menu menu3 = new Menu();
        menu.setName("Brownies");
        menu.setcategory("Dessert");        
        menu.setPrice("Rp. 5000");

        db.insertmenu(menu1);
        db.insertmenu(menu2);
        db.insertmenu(menu3);
    }
}

