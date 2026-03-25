package Module3.Exceptions;

public class TrajectoryCalculationException extends Exception{
    public TrajectoryCalculationException(){
        super();
    }
    public TrajectoryCalculationException(String message){
        super(message);
    }
    public TrajectoryCalculationException(String message, Throwable cause){
        super(message,cause);
    }
}
