public class PagoEstado implements IEstado {
    private Pedido _pedido;

    public PagoEstado(Pedido _pedido) {
        this._pedido = _pedido;
    }

    @Override
    public void pagar() {
        System.out.println("PagoEstado: Pedido sendo pago!");
    }

    @Override
    public void enviar() {
        System.out.println("PagoEstado: ... Logo, logo vai ser enviado.");
        _pedido.setEstado(new EnviadoEstado(_pedido));
    }

    @Override
    public void entregar() {
        System.out.println("PagoEstado: ... Não custa sonhar com a entregua... Mas ainda não...");
    }

    @Override
    public void cancelar() {
        System.out.println("PagoEstado: Cancelar já? ... Ok.");
        _pedido.setEstado(new CanceladoEstado(_pedido));
    }
    
}
