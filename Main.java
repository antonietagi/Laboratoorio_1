//======PILHA ESTÁTICA======

public class Main {
    public static void main(String[] args) {

        // cria pilha com tamanho máximo 5
        Stack s = new Stack(5);

        // Testando push
        s.push(10);
        s.push(20);
        s.push(30);

        // Ver topo
        System.out.println("Topo atual: " + s.peek());

        // Remover elementos
        s.pop();
        s.pop();

        // Quantidade de elementos
        System.out.println("A pilha tem " + s.length() + " elementos");

        // Testando limites
        s.pop();        // remove último
        s.pop();        // tentativa de remover com pilha vazia
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);     // tentativa de adicionar além do limite
    }
}
