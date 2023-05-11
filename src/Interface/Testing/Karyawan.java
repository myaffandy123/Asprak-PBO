package Interface.Testing;

public class Karyawan implements Payable {

    String nama;
    int gaji;
    Invoice[] invoices;

    public Karyawan() {
    }

    public Karyawan(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
        invoices = new Invoice[2];
    }

    @Override
    public void getPayableAmount() {
        int sum = 0;
        for (Invoice invoice : invoices) {
            if (invoice != null) {
                sum += invoice.harga * invoice.totalItem;
            }
        }
        System.out.println(gaji - sum);
    }

}
