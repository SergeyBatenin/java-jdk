package homework3.task3;

public class Pair<T, V> {
    T firstElement;
    V secondElement;

    public Pair(T firstElement, V secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public V getSecondElement() {
        return secondElement;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstElement=" + firstElement + " с классом=" + firstElement.getClass().getName() +
                ", secondElement=" + secondElement + " с классом=" + secondElement.getClass().getName() +
                '}';
    }
}
