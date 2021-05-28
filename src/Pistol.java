import java.util.ArrayList;

/*
      turunan dari senjata, implement itemkombinasi
 */

public class Pistol extends Senjata implements ItemDikombinasikanInterface {

    ArrayList<ItemDikombinasikanInterface> arrAksesoris = new ArrayList<>();
    //constructor
    public Pistol() {
        pointMenyerang = 80;
        berat = 2000;
        nama = "Pistol";
        deskripsi = "Pistol yang bisa dikombinasikan";
    }

    @Override
    public void kombinasikan(ItemDikombinasikanInterface objItemInterface) {
        //hanya yang aksosirs senjata api yang boleh dikombinasikan
        if (objItemInterface.getTipeItem().equals("aksesoris_senjata_api") || objItemInterface.getTipeItem().equals("semua") ) {
            //tambahkan aksesoris ke arraylist
            arrAksesoris.add(objItemInterface);
        }
    }

    @Override
    public String getTipeItem() {
        return "senjata_api";
    }


}

