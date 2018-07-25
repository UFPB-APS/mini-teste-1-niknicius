public class LogicaCustoSobreValorTotal implements Custo
{
    @Override
    public double calcularCusto(CustoSobreValorTotal custo,Venda venda){
        double custoSobreVenda = venda.getTotal() * custo.getTaxa();
        return custoSobreVenda;
    }
}
