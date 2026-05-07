package javaapplication1;
public class Apartamento extends imovel{
    public int andar;
    public Apartamento(int idImovel, String endereco, double valor, int andar){
        super(idImovel,endereco,valor);
        this.andar=andar;
    }
    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Andar:" + andar);
    }
}
