public class LogicaVenda {

    private CustoSobreValorTotal iv = new CustoSobreValorTotal("Imposto sob a Venda", 0.05);
    private LogicaCustoSobreValorTotal logicaCusto = new LogicaCustoSobreValorTotal();
    private CustoSobreValorTotal seguro;

    public CustoSobreValorTotal getSeguro() {
        return seguro;
    }
    
    public void setSeguro(CustoSobreValorTotal seguro) {
        this.seguro = seguro;
    }

    public double calcularTotal(Venda venda) {
        venda.setTotal(0.0);
        
        
        for (ItemVenda item: venda.getItens()) {
            if (item != null) {
                venda.setTotal(venda.getTotal() + item.getSubTotal());
            }
        }
        
        if ( this.iv != null) {
            venda.setTotal(venda.getTotal() + this.logicaCusto.calcularCusto(this.iv,venda));
        }
        
        if ( this.seguro != null) {
            venda.setTotal(venda.getTotal() + this.logicaCusto.calcularCusto(this.seguro,venda));
        }
        
        return venda.getTotal();
    }
}
