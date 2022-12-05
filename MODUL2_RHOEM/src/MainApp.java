public class MainApp {
    public static void main(String[] args) throws Exception{
        TransportasiAir ta = new TransportasiAir(4, 20000);
        ta.informasi();
        ta.berlayar();
        ta.berlabuh();
        Sampan sa = new Sampan(20, 50000, 2);
        sa.informasi();
        sa.berlayar();
        sa.berlabuh();
        sa.berlabuh(2);
        Kapal ka = new Kapal(50, 100000,);
        ka.informasi();
        ka.berlayar();
        ka.berlayar(20);
        ka.berlabuh();
    }
}
