package Module2.GenericLearning;

public class GenericUtility <T>{
    private T compare1;
    private T compare2;

    public GenericUtility(T compare1,T compare2){
        this.compare1 = compare1;
        this.compare2 = compare2;
    }

    public boolean equal(T comparable1, T comparable2){
        if (comparable1.equals(comparable2)){
            return true;
        }else{
            return true;
        }
    }

}
