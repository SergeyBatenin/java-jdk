package homework3.task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animal1 = {new Cat(), new Cat(), new Cat(), new Cat()};
        Animal[] animal2 = {new Cat(), new Dog(), new Cat()};
        Animal[] animal3 = {new Cat(), new Cat(), new Cat()};

        Cat[] cats = {new Cat(), new Cat(), new Cat()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};

        System.out.println(compareArrays(animal1, cats)); // false длины неравны
        System.out.println(compareArrays(animal2, cats)); // false есть различные типы у элементов Dog/Cat
        System.out.println(compareArrays(animal3, cats)); // true хоть тип массивов разный элементы внутри одного типа
        System.out.println(compareArrays(dogs, cats)); // false разные типы элементов
    }

    private static <T, V> boolean compareArrays(T[] first, V[] second) {
        if (first.length != second.length) {
            return false;
        }

        int length = first.length;
        for (int i = 0; i < length; i++) {
            if (first[i].getClass() != second[i].getClass()) return false;
        }
        return true;
    }
}
