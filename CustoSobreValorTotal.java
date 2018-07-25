
public class CustoSobreValorTotal{
    private String nome;
    private double taxa;
    
    public CustoSobreValorTotal(String nome, double taxa){
        this.nome = nome;
        this.taxa = taxa;        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getTaxa(){
        return this.taxa;
    }
    
    public void setTaxa(double taxa){
        this.taxa = taxa;
    }
   
}
