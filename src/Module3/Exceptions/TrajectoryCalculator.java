package Module3.Exceptions;

import java.util.InputMismatchException;

public class TrajectoryCalculator implements TrajectoryCalculationInterface{
    public TrajectoryCalculator(){}
    @Override
    public double calculateVelocity(double initialVelocity, double acceleration, double time) throws  TrajectoryCalculationException {
        try {
            if (time<0){
                throw new TrajectoryCalculationException("Time cannot be negative");
            }
            return initialVelocity + acceleration * time;
        }catch (ArithmeticException e) {
            throw new TrajectoryCalculationException("Error calculating velocity");
        }
    }

    @Override
    public double calculatePosition(double initialPosition, double initialVelocity, double acceleration, double time) throws  TrajectoryCalculationException {
        try {
            if (time<0){
                throw new TrajectoryCalculationException("Time cannot be negative");
            }
            return initialPosition + initialVelocity * time + (0.5) * (acceleration * Math.pow(time, 2))*Math.sqrt(-1);
        }catch (ArithmeticException e){
            throw new TrajectoryCalculationException("Arithmetic Exception");
        } catch (RuntimeException e) {
            throw new TrajectoryCalculationException("Runtime Exception", e);
        }
    }
}
