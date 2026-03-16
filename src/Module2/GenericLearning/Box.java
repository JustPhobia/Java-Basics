package Module2.GenericLearning;

import java.util.TreeSet;

public class Box <T>{
    private T PrintOut;
    public Box(T Something){
        PrintOut =  Something;
    }

    public void PrintOut(){
        System.out.println(PrintOut);
    }

    public T getPrintOut() {
        return PrintOut;
    }

    public void setPrintOut(T somethingCrazy){
        this.PrintOut =somethingCrazy;
    }

    public static void main(String[] args) {
        Box<String> newBox = new Box<>("Hello");
        newBox.PrintOut();
        newBox.setPrintOut("Something");
        newBox.PrintOut();

        TreeSet<Integer> integers = new TreeSet<>();
    }


}
