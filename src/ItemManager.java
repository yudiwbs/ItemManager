import java.util.ArrayList;
/*
     ItemManager mengelola item. Bisa digunakan pada player, NPC, & musuh
 */
public class ItemManager {
    protected   ArrayList<Item> arrItem = new ArrayList();

    public void tambah(Item objItem) {
        arrItem.add(objItem);
    }
    public void buang(Item objItem) {
        arrItem.remove(objItem);
    }
    public int jumItem() {
        return arrItem.size();
    }
}
