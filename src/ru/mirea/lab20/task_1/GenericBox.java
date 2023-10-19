package ru.mirea.lab20.task_1;

public class GenericBox<T, V, K> {
    private V content_V;
    private T content_T;
    private K content_K;

    public GenericBox(V content_V, T content_T, K content_K) {
        this.content_V = content_V;
        this.content_T = content_T;
        this.content_K = content_K;
    }

    public V getContent_V() {
        return content_V;
    }

    public void setContent_V(V content_V) {
        this.content_V = content_V;
    }

    public T getContent_T() {
        return content_T;
    }

    public void setContent_T(T content_T) {
        this.content_T = content_T;
    }

    public K getContent_K() {
        return content_K;
    }

    public void setContent_K(K content_K) {
        this.content_K = content_K;
    }

    public String toString() {
        return content_V + " (" + content_V.getClass() + ")\n" + content_T + " (" + content_T.getClass() + ")\n" + content_K + " (" + content_K.getClass() + ")";
    }
}