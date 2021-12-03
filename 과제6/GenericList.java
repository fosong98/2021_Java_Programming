package edu.pnu.collection;
import edu.pnu.admin.*;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericList() {
        data = new Object[10];
    }

    public void add(T elem) {
        if (size < DEFAULT_SIZE)
            data[size++] = elem;
    }

    public T find(T elem) {
        T r_val = null;
        for (int i = 0; i < size; ++i)
            if (data[i].equals(elem))
                r_val = (T)data[i];
        return r_val;
    }

    public void clear() {
        size = 0;
    }

    @Override
    public int hashCode() {
        return data.hashCode() + Integer.hashCode(size);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof GenericList)
        {
            GenericList g = (GenericList)o;
            if (g.size == this.size) {
                int i;
                for (i = 0; i < size; ++i)
                    if (!g.data[i].equals(this.data[i]))
                        break;
                if (i != size)
                    return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String msg = "";
        for (int i = 0; i < size; ++i)
            msg += "\t" + data[i] + "\n";
        return msg;
    }

    public int size() {
        return size;
    }
}
