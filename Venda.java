public class Venda {

    private String data;
    private ItemVenda[] itens = new ItemVenda[10];
    private String estadoDoCliente;
    private double total;
    
    public ItemVenda[] getItens() {
        return this.itens;
    }
    
    private void setEstadoDoCliente(String estadoDoCliente) {
        this.estadoDoCliente = estadoDoCliente;
    }
        
    public String getEstadoDoCliente() {
        return estadoDoCliente;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public String getData() {
        return data;
    }
    
    public void addNoCarrinho(ItemVenda item, int posicao) {
        this.itens[posicao] = item;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    
}
