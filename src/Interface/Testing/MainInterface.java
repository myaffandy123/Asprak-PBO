package Interface.Testing;

public class MainInterface {
    
    public static void main(String[] args) {
        Karyawan kar = new Karyawan("Yusuf", 10000);
        Invoice inv1 = new Invoice(2, 1000);

        kar.invoices[0] = inv1;

        Payable p = inv1;
        p.getPayableAmount();
    }
}
