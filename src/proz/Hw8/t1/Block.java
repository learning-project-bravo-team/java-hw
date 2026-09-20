package proz.Hw8.t1;

public class Block {
    int width;
    int length;
    int height;

    public Block(int[] array){
        this.width =array[0];
        this.length=array[1];
        this.height=array[2];
    }
    public int getWidth(){
        return width;
    }
    public int getLength(){
        return length;
    }
    public int getHeight(){
        return height;
    }
    public int getVolume(){
        return width*length*height;
    }
    public int getSurfaceArea(){
        return 2*(width*length +length*height +height*width);
    }

}
