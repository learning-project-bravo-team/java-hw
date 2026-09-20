package skrupskaya.Hw8;

public class Block {
    private int width;
    private  int length;
    private int height;


    public Block(int[] array) {
        this.width = array[0];
        this.length = array[1];
        this.height = array[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
    public int getVolume() {
        int result = width * length * height;
        return result;
    }
    public int getSurfaceArea() {
        int result = 2 * width * length + 2 * width * height + 2 * height * length;
        return result;
    }
}
