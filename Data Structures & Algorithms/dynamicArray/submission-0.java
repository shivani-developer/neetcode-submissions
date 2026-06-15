class DynamicArray {

    int[] array;
    int numElements = 0;

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if(numElements == array.length) {
            resize();
        }
        array[numElements] = n;
        numElements++;
    }

    public int popback() {
        numElements--;
        return array[numElements];
    }

    //1, 0, 1, 
    //[1, 3]

    private void resize() {
        int newCapacity = array.length * 2;
        int[] newArray = new int[newCapacity];
        for(int i = 0; i < numElements; i++){
            newArray[i] = array[i];
        }
        this.array = newArray;
    }

    public int getSize() {
        return numElements;
    }

    public int getCapacity() {
        return array.length;
    }
}
