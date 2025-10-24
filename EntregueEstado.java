public class EntregueEstado implements IEstado {
    private Pedido _pedido;

    public EntregueEstado(Pedido _pedido) {
        this._pedido = _pedido;
    }

    @Override
    public void pagar() {
        System.out.println("EntregueEstado: Pedido já foi pago lá trás...");
    }

    @Override
    public void enviar() {
        System.out.println("EntregueEstado: Pedido já foi enviado lá trás...");
    }

    @Override
    public void entregar() {
        System.out.println("EntregueEstado: Pedido está sendo entregue agora!");
    }

    @Override
    public void cancelar() {
        System.out.println("EntregueEstado: Cancelar AGORA?! Não pode, já foi entregue!");
    }
    
}
