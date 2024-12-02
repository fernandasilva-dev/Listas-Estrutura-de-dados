package ifma.ifma.lista03;

public class SimpleList {
    Node head;
    Node tail;
    int size;

    public SimpleList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void adicionarInicio(int element) {
        Node no = new Node(element);
        no.next = head;
        head = no;

        if (size == 0) {
            tail = no;
        }
        size++;
    }

    public void adicionarFim(int element) {
        if (isEmpty()) {
            adicionarInicio(element);
        } else {
            Node no = new Node(element);
            tail.next = no;
            tail = no;
            size++;
        }
    }

    public int removeComeco() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        int temp = head.element;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return temp;
    }

    public int removerFinal() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        if (size == 1) {
            return removeComeco();
        }
        Node v = head;
        while (v.next != tail) {
            v = v.next;
        }
        int temp = tail.element;
        tail = v;
        tail.next = null;
        size--;
        return temp;
    }

    public int maiorValor() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        Node current = head;
        int max = current.element;
        while (current != null) {
            if (current.element > max) {
                max = current.element;
            }
            current = current.next;
        }
        return max;
    }

    public int menorValor() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        Node current = head;
        int min = current.element;
        while (current != null) {
            if (current.element < min) {
                min = current.element;
            }
            current = current.next;
        }
        return min;
    }

    public double mediaValores() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.element;
            current = current.next;
        }
        return (double) sum / size;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.element);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
