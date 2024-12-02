package ifma.ifma.lista04;

import java.util.NoSuchElementException;

public class DequeList {
    private Node head;
    private Node tail;

    public DequeList() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(Aluno data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node getFirst() {
        if (head == null) {
            throw new NoSuchElementException("A lista está vazia.");
        }
        return head;
    }

    public Node getLast() {
        if (tail == null) {
            throw new NoSuchElementException("A lista está vazia.");
        }
        return tail;
    }

    public Aluno removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("A lista está vazia.");
        }
        Node firstNode = getFirst();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return firstNode.data;
    }

    public Aluno removeLast() {
        if (tail == null) {
            throw new NoSuchElementException("A lista está vazia.");
        }

        Node lastNode = getLast();

        if (head == tail) {
            head = tail = null;
            return lastNode.data;
        }

        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }

        tail = current;
        tail.next = null;

        return lastNode.data;
    }

    public Node search(String nome) {
        Node current = head;
        while (current != null) {
            if (current.data.getNome().equals(nome)) {
                return current;
            }
            current = current.next;
        }
        throw new NoSuchElementException("Aluno não encontrado: " + nome);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data.toString());
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}