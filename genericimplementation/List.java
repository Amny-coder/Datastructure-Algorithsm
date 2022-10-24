package genericimplementation;

public interface List<T> {
    public void add(T data);

    public void addAt(int index, T data);

    public void remove();

    public void removeAt(int index);

    public int size();

    public boolean isEmpty();

    public void show();
}
