package banca;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    void preleva(double x) throws BancaException {
        if (saldo - x < 0) {
            nMovimenti++;

            throw new BancaException("Il saldo non e' sufficiente per prelevare");
        }

        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;
        } else {
            saldo = saldo - x - 0.50;
        }

        nMovimenti++;
    }

    double restituisciSaldo() {
        return saldo;
    }
}