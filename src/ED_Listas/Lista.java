package ED_Listas;

public abstract class Lista <T extends Comparable>{
    public void Lista(){
    }
    public abstract void incluir (T elemento) thows Exception;
    public abstract void incluirInicio(T elemento) throws Exceptiom;
    public abstract void incluir (T elemento, int posicao) throws Exception;
    public abstract T get (int posicao) throws Exception;
    public abstract void remover (int posicao) thwos Exception;
    public abstract void limpar();
    public abstract int getTamanho();
    public abstract boolean contem (T elemento) throws Exception;

}
