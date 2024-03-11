package banca;

public class ContoOnline extends ContoCorrente {
    double maxPrelievo;

    ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    void stampaSaldo() {
        System.out.println("Titolare: " + titolare + " - Saldo: " + saldo + " - Numero movimenti: " + nMovimenti + " - Massimo movimenti: " + maxMovimenti + " - Massimo prelievo: " + maxPrelievo);
    }

    void preleva(double x) throws BancaException {
        if (x <= maxPrelievo) {
            super.preleva(x);
        } else {
            throw new BancaException("il prelievo non è disponibile");
        }
    }
}
