package arvore;

public class Arvore {
    private NO raiz,atual;

    public NO getRaiz() {
        return raiz;
    }

    public void inserir(int numero) {
        if (raiz == null) {
            raiz = new NO(numero,null,null);
        }else {
            atual=new NO(numero,null,null);
            inserir(raiz);
        }
    }

    private void inserir(NO e){
        if(atual.getNumero()<e.getNumero()){
            if(e.getEsq()==null) {
                e.setEsq(atual);
            }else{
                inserir(e.getEsq());
            }
        }else {
            if (e.getDir()==null) {
                e.setDir(atual);
            }else{
                inserir(e.getDir());
            }
        }
    }


    public void ordem(NO e) {
        if(e != null) {
            ordem(e.getEsq());//esquerda
            System.out.print(" "+e.getNumero());//Raiz
            ordem(e.getDir());//direita
        }
    }


    public void preOrdem (NO ep) {
        if (ep!=null) {
            System.out.print(" "+ep.getNumero());//Raiz
            preOrdem(ep.getEsq());//esquerda
            preOrdem(ep.getDir());//direita
        }
    }

    public void posOrdem(NO epo) {
        if (epo!=null) {
            posOrdem(epo.getEsq());//esquerda
            posOrdem(epo.getDir());//direita
            System.out.print(" "+epo.getNumero());//Raiz
        }
    }
}
