//======PILHA ESTÁTICA======
// Classe da Pilha
public class Stack {

    private int[] data;     // vetor onde guardamos os números
    private int top;        // posição do topo da pilha
    private int capacity;   // capacidade máxima da pilha

    // ------------------------------
    // Exercício 4 - Construtor: define tamanho máximo
    public Stack(int size) {
        capacity = size;           // define capacidade
        data = new int[capacity];  // cria vetor com esse tamanho
        top = -1;                  // pilha começa vazia
    }

    // ------------------------------
    // Exercício 1 - push: adiciona no topo
    public void push(int x) {
        if (isFull()) {                       // Exercício 2 - protege contra overflow
            System.out.println("Erro: pilha cheia!");
        } else {
            data[++top] = x;                   // move topo pra cima e adiciona valor
            System.out.println(x + " adicionado à pilha");
        }
    }

    // ------------------------------
    // Exercício 1 - pop: remove do topo
    public int pop() {
        if (isEmpty()) {                       // Exercício 2 - protege contra pilha vazia
            System.out.println("Erro: pilha vazia!");
            return -1;                         // retorna -1 se não houver nada
        } else {
            int value = data[top--];           // pega valor do topo e diminui topo
            System.out.println(value + " removido da pilha");
            return value;
        }
    }

    // ------------------------------
    // Exercício 1 - peek: olha topo
    public int peek() {
        if (isEmpty()) {                       // Exercício 2 - protege contra pilha vazia
            System.out.println("Erro: pilha vazia!");
            return -1;
        } else {
            return data[top];
        }
    }

    // ------------------------------
    // Exercício 1 - isEmpty: pilha está vazia?
    public boolean isEmpty() {
        return top == -1;
    }

    // ------------------------------
    // Exercício 1 - isFull: pilha está cheia?
    public boolean isFull() {
        return top == capacity - 1;
    }

    // ------------------------------
    // Exercício 3 - length: quantidade de elementos
    public int length() {
        return top + 1;
    }
}
