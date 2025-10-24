public class CanceladoEstado implements IEstado {
    private final Pedido _pedido;

    public CanceladoEstado(Pedido _pedido) {
        this._pedido = _pedido;
    }

    @Override
    public void pagar() {
        System.out.println("CanceladoEstado: Pedido sendo cancelado, pagamento não será efetuado (mas seu dinheiro fica com a gente).");
    }

    @Override
    public void enviar() {
        System.out.println("CanceladoEstado: Pedido foi cancelado e sua entrega também!");
    }

    @Override
    public void entregar() {
        System.out.println("CanceladoEstado: Ah, safado, querendo receber produto cancelado E pedir reembolso? É isso aí?");
    }

    @Override
    public void cancelar() {
        System.out.println("CanceladoEstado: Pedido cancelado com sucesso... ^__^");
    }
    
}
