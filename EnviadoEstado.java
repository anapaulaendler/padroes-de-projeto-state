public class EnviadoEstado implements IEstado {
    private Pedido _pedido;

    public EnviadoEstado(Pedido _pedido) {
        this._pedido = _pedido;
    }

    @Override
    public void pagar() {
        System.out.println("EnviadoEstado: Pedido sendo pago!");
    }

    @Override
    public void enviar() {
        System.out.println("EnviadoEstado: Pedido foi pago agora, vamos aguardar um pouquinho!");
    }

    @Override
    public void entregar() {
        System.out.println("EnviadoEstado: Ah, safado, querendo receber produto cancelado E pedir reembolso? É isso aí?");
        _pedido.setEstado(new EntregueEstado(_pedido));
    }

    @Override
    public void cancelar() {
        System.out.println("EnviadoEstado: Pedido cancelado com sucesso... ^__^");
        _pedido.setEstado(new EnviadoEstado(_pedido));
    }
    
}
