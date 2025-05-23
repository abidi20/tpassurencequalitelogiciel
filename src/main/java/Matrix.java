public class Matrix {

    private int[][] array;
    private int size;

    public Matrix(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Matrix size must be greater than 0");
        }
        this.size = size;
        array = new int[size][size];
    }

    public void set(int i, int j, int value) {
        checkIndices(i, j);
        array[i][j] = value;
    }

    public int get(int i, int j) {
        checkIndices(i, j);
        return array[i][j];
    }

    private void checkIndices(int i, int j) {
        if (i < 0 || i >= size || j < 0 || j >= size) {
            throw new IndexOutOfBoundsException("Invalid matrix indices");
        }
    }

    public void add(Matrix other) {
        if (other == null) {
            throw new NullPointerException("Other matrix must not be null");
        }
        if (other.size != this.size) {
            throw new IllegalArgumentException("Matrices must have the same size");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.array[i][j] += other.array[i][j];
            }
        }
    }

    public void multiply(Matrix other) {
        if (other == null) {
            throw new NullPointerException("Other matrix must not be null");
        }
        if (other.size != this.size) {
            throw new IllegalArgumentException("Matrices must have the same size");
        }
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    result[i][j] += this.array[i][k] * other.array[k][j];
                }
            }
        }
        this.array = result;
    }

    public void transpose() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append("[");
            for (int j = 0; j < size; j++) {
                sb.append(array[i][j]);
                if (j < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
        }
        return sb.toString();
    }
}
