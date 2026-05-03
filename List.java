  public class List {
    private String[] data;
    private int size;

    public List() {
        data = new String[10];
        size = 0;
    }

    public void add(String value) {
        if (size == data.length) {
            grow();
        }
        data[size] = value;
        size++;
    }

    public void add(int index, String value) {
        if (index < 0 || index > size) {
            System.out.println("невірний індекс");
            return;
        }

        if (size == data.length) {
            grow();
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("невірний індекс");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        data[size] = null;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            return "невірний індекс";
        }
        return data[index];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return data.length;
    }

    private void grow() {
        String[] newData = new String[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }
}