public class LibraryItem {

    private String barcode;
    private Title title;

    public LibraryItem(String barcode, Title title) {
        this.barcode = barcode;
        this.title = title;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}
