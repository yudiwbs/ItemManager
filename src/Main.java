/*
    Class uintuk ujicoba
 */

public class Main {

    public static void main(String[] args) {
        //testing
        ItemManager objItemManager = new ItemManager();

        // test item yang bisa dikombinasikan
        Pistol objPistol = new Pistol();
        objItemManager.tambah(objPistol);
        Peredam objPeredam = new Peredam();

        //berat dan kekuatan serang pistol sebelum di attach peredam
        System.out.printf("Berat pistol: %d , kekuatan menyerang: %d \n\n",objPistol.getBerat(),objPistol.getPointMenyerang());

        //jika mau dikombinasikan dua2nya perlu dipanggil karena masing2 ada interaksi
        objPistol.kombinasikan(objPeredam);
        objPeredam.kombinasikan(objPistol);

        //setelah ditempel, berat dan kekuatannya berubah
        System.out.printf("Berat pistol: %d , kekuatan menyerang: %d \n\n",objPistol.getBerat(),objPistol.getPointMenyerang());

        // test multiple inheritance
        PermenBom objPermenBom  = new PermenBom();
        objPistol.kombinasikan(objPermenBom);
        objPermenBom.kombinasikan(objPistol);
        objPermenBom.meledak();
        System.out.printf("Berat pistol: %d  \n\n",objPistol.getBerat(),objPistol.getPointMenyerang());
    }
}
