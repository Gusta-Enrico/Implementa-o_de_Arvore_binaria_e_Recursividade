package arvore;

public class NO {
    private int numero;
    private NO esq,dir;

    public NO(int numero, NO esq, NO dir) {
        this.numero = numero;
        this.esq = esq;
        this.dir = dir;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public NO getEsq() {
        return esq;
    }

    public void setEsq(NO esq) {
        this.esq = esq;
    }

    public NO getDir() {
        return dir;
    }

    public void setDir(NO dir) {
        this.dir = dir;
    }
}
