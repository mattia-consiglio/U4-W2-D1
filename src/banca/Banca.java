package banca;

public class Banca {
    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 2000.0);
        System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        try {
            conto1.preleva(1750.5);
            conto1.preleva(1750.5);
            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            System.out.println("Errore prelievo: " + e.getMessage());
        }

        ContoOnline conto2 = new ContoOnline("Luigi rossi", 50350.0, 15000);
        conto2.stampaSaldo();

        try {
            conto2.preleva(20000);
            conto2.stampaSaldo();
        } catch (BancaException e) {
            System.out.println("Errore prelievo: " + e.getMessage());
//            e.printStackTrace();
        }
    }
}
