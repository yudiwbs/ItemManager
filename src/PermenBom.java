/* multiple implement interface
*
* bisa dikombinasikan dengan item lain (ItemDikombinasikan), bisa juga meledak (MeledakInterface)
*
* */

public class PermenBom extends  Item implements ItemDikombinasikanInterface, MeledakInterface {

    ItemDikombinasikanInterface itemTempatMenempel; //item permen ini ditempel

    //punya ItemKombinasi interface
    @Override
    public void kombinasikan(ItemDikombinasikanInterface objItemInterface) {
        //simpan item ini menempel pada objek apa
        itemTempatMenempel = objItemInterface;
    }

    @Override
    public String getTipeItem() {
        return "semua";  //bisa menempel ke item apapun
    }

    //punya MeledakInterface
    @Override
    public void meledak() {
        //casting untuk mendapatkan item
        Item objItem = (Item) itemTempatMenempel;
        System.out.printf("%s meledak! \n",objItem.getNama());
        objItem.setBerat(0);
    }
}
