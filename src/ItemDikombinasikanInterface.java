// item yang bisa dikombinasikan

public interface ItemDikombinasikanInterface {
    void kombinasikan(ItemDikombinasikanInterface objItemInterface);
    String getTipeItem(); //untuk mengecek kompatibilitas item apakah bisa dikombinasikan.
}
