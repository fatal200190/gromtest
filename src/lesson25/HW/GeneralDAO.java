package lesson25.HW;

public class GeneralDAO<T> {
    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Object[10];

    public T save(T t) throws Exception {
        validate(t);
        int index = 0;
        for (T el : array) {
            if (el == null) {
                array[index] = t;
                return array[index];
            }
            index++;
        }
        return null;
    }

    public T[] getAll() {
        return array;
    }

    private void validate(T t) throws Exception {
        for (T t1 : array) {
            if (t1 != null && t1.equals(t)) {
                throw new Exception("Object " + t + " is already in the base");
            }
        }

        int count = 0;
        for (T t1 : array) {
            if (t1 == null) {
                count++;
            }
        }

        if (count == 0) {
            throw new Exception("There is no place in the base for " + t + " Object");
        }

        if (t == null) {
            throw new Exception("Object can't be null");
        }

    }
}
