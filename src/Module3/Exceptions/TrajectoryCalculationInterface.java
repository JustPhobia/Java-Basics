package Module3.Exceptions;

public interface TrajectoryCalculationInterface {
    double calculateVelocity(double initialVelocity, double acceleration, double time)throws TrajectoryCalculationException ;
    double calculatePosition(double initialPosition, double initialVelocity, double acceleration, double time) throws TrajectoryCalculationException;
}
