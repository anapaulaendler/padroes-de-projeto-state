public class Pedido {
    public String item;
    public double preco;
    public EntregaStatus entregaStatus;
    private IEstado _estado;

    public Pedido(String item, double preco) {
        this.item = item;
        this.preco = preco;
        this.entregaStatus = EntregaStatus.AGUARDANDO_PAGAMENTO;
        this._estado = new NovoEstado(this);
    }

    public void setEstado(IEstado _estado) {
        this._estado = _estado;
    }  

    public void pagar() {
        _estado.pagar();
    }

    public void enviar() {
        _estado.enviar();
    }

    public void entregar() {
        _estado.entregar();
    }

    public void cancelar() {
        _estado.cancelar();
    }
}