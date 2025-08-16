//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExibirFila {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular();
        fila.adicionar(1);
        fila.adicionar(2);
        fila.adicionar(3);
        fila.adicionar(4);
        fila.exibir();
    }
}
