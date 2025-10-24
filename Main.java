public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("This Is Hardcore", 100.00);

        p1.pagar();
        p1.enviar();
        p1.entregar();
        p1.cancelar();

        Pedido p2 = new Pedido("Different Class", 200.00);

        System.out.println("=== PEDIDO 2 ===");

        p2.pagar();
        p2.enviar();
        p2.cancelar();
        p2.entregar();
    }
}
