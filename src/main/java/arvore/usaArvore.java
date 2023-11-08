package arvore;
import arvore.*;

public class usaArvore {
    public static void main (String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserir(10);
        arvore.inserir(6);
        arvore.inserir(12);
        arvore.inserir(5);
        arvore.inserir(3);
        arvore.inserir(45);
        arvore.inserir(30);
        arvore.inserir(4);
        arvore.inserir(15);
        arvore.inserir(25);


        arvore.ordem(arvore.getRaiz());
        System.out.println("\n===============================");
        arvore.preOrdem(arvore.getRaiz());
        System.out.println("\n===============================");
        arvore.posOrdem(arvore.getRaiz());
    }
}
