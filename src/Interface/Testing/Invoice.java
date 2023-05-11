package Interface.Testing;

public class Invoice implements Payable {

    int totalItem;
    int harga;

    public Invoice() {
    }

    public Invoice(int totalItem, int harga) {
        this.totalItem = totalItem;
        this.harga = harga;
    }

    @Override
    public void getPayableAmount() {
        int sum = 0;
        sum += harga * totalItem;
        System.out.println(sum);
    }
}
