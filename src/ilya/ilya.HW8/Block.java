package ilya.ilya.HW8;

public class Block {
    int width;
    int height;
    int length;

    public Block(int[] array) {
        this.width = array[0];
        this.height = array[1];
        this.length = array[2];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getVolume() {
        return width * height * length;
    }

    public int getSurfaceArea() {
        return 2 * (width * height + width * length + height * length);
    }

}
