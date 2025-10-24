public class NovoEstado implements IEstado {
    private Pedido _pedido;

    public NovoEstado(Pedido _pedido) {
        this._pedido = _pedido;
    }

    @Override
    public void pagar() {
        System.out.println("NovoEstado: Agora, com o pedido criado, que tal pagar? Você tem 10 minutos.");
        _pedido.setEstado(new PagoEstado(_pedido));
    }

    @Override
    public void enviar() {
        System.out.println("NovoEstado: Pague primeiro. Depois vamos enviar. Prometo.");
    }

    @Override
    public void entregar() {
        System.out.println("NovoEstado: Você nem pagou ainda e a gente nem enviou! Que pressa é essa?");
    }

    @Override
    public void cancelar() {
        System.out.println("NovoEstado: E cancelar já? Malmente criou e já vais? Ok...");
        _pedido.setEstado(new CanceladoEstado(_pedido));
    }
    
}
