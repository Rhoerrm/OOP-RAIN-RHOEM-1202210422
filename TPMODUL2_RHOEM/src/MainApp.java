public class MainApp {
    public static void main(String[] args)  {
        Perangkat perangkatawal = new Perangkat("adata", 2, (float)1.80);
        Laptop laptopawal = new Laptop("seagate",8, (float)2.40, true);
        Handphone handphoneawal = new Handphone("sand disk", 3, (float)2.20, false);
        perangkatawal.informasi();

        laptopawal.informasi();
        laptopawal.bukaGame("Dota 2");
        laptopawal.kirimEmail("rroemm24@gmail.com");
        laptopawal.kirimEmail("rhoemanidarrm@student.telkomuniversity.ac.id", "sanjaegarr26@gmail.com");

        handphoneawal.informasi();
        handphoneawal.telfon(628122122);
        handphoneawal.kirimSms(62852112);
        handphoneawal.kirimSms(62812122, 62929221);
    }


}
