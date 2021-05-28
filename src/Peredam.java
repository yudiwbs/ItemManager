/*
    Aksesoris dari pistol, impelemnt itemkombinasi
 */
public class Peredam extends Item implements ItemDikombinasikanInterface  {

    public Peredam() {
        nama = "Peredam";
        berat = 100;
        deskripsi = "Peredam yang bisa diattach ke pistol/senapan, menambah berat, mengurangi serangan";
    }

    @Override
    public void kombinasikan(ItemDikombinasikanInterface objItemInterface) {
        //hanya tipe senjata yang bisa menggunakan
        if (objItemInterface.getTipeItem().equals("senjata_api")) {
            //casting, hati2 harus dipastikan objItemInterface classnya Senjata & turunanannya
            Senjata itemSenjata = (Senjata) objItemInterface;

            //update berat & point menyerang senjata yang diattach peredam ini
            //kenapa tdk dilakukan di class Pistol?
            itemSenjata.setBerat(itemSenjata.getBerat()+this.berat); //tambah berat objek yang diattach peredam
            itemSenjata.setPointMenyerang(itemSenjata.getPointMenyerang()-10); //kurangi kekuatan menyerang
        }
    }

    @Override
    public String getTipeItem() {
        return "aksesoris_senjata_api";
    }
}
