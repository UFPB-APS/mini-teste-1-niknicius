public class ICMS{
    
    private String estadoDaLoja = "PB";


    public double calcularCusto(Venda venda) {
        
        if (estadoDaLoja.equals(venda.getEstadoDoCliente())) {
            return 0.0;
        }
        
        return venda.getTotal() * 0.17;
    }    
}
