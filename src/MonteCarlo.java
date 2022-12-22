/**
 * Program to simulate the Monte-Carlo Method of the PI calculation
 * This is a java-doc
 *  -   Concept of the simulation is the creation of random points P[x/y] x,y E [0,1] x [0,1]
 *  -   check if the points inside the unit arc with center [0,0], which has the area pi A[r] = pi * r * r A[1] = pi
 *  -   ratio between the points in the arc and the total points is determined and multiplied by 4 A[arc] = 1/4 pi
 *  -   finally, the deviation from the constant Math.Pi is determined and written to a file.
 * @author Moritz Pries
 * @version 1.0
 */

import java.io.IOException;
import java.lang.Math;
import java.nio.file.Files;
import java.nio.file.FileSystems;

public class MonteCarlo {
    /**
     * The Main Method.
     * defines the number of points the program will generate
     * starts the simulation method using the total number of points
     * @param args  The command line arguments.
     * @throws IOException  IOException
     */
    public static void main(String[] args) throws IOException {

    int _numberOfPoints = 100000000;
    _startSimulation(_numberOfPoints);

    }

    /**
     * Generate Point Method.
     * Method that generates an x and a y value for a point x,y E [0,1]x[0,1] and writes both values inside an array
     * @return the array with the two values of the x,y values for the point
     */
    public static double[] _generatePoint ()
    {
        double x = (Math.random());
        double y = (Math.random());
        double[] point = new double[2];
        point[0] = x;
        point[1] = y;

        return point;
    }

    /**
     * The Point Check Method.
     * Method checks if the point lies inside the arc with A = 1/4 * pi
     * @param _pointToCheck the point the method checks
     * @return  boolean, true if inside arc, false if not
     */
    public static boolean _checkPoint (double[] _pointToCheck)
    {

        boolean _inside;

        _inside = Math.pow(_pointToCheck[0], 2) + Math.pow(_pointToCheck[1], 2) <= 1;

        return _inside;

    }

    /**
     * The Simulation Method.
     * Method that starts the simulation:
     *  - calls the _generatePoint Method and the _checkPoint Method based on the number of points in total
     *  - increases the value of _tempBool for every point which lies inside the arc
     *  - prints the results and also calculates pi
     *  - calls _checkdivergenceToPi method to determine the deviation between Math.PI and the calculated pi
     *  - writes the result from the _checkdivergenceToPi method inside a textfile, using the _writeInData method
     * @param _points total number of points
     * @throws IOException  IOException
     */
    public static void _startSimulation(int _points) throws IOException {
        double pi;
        int _insidePoints = 0;
        for (int i = 0; i < _points; i++)
        {
            boolean _tempBool;
            _tempBool =  _checkPoint(_generatePoint());
            if (_tempBool) {_insidePoints++;}

        }

        System.out.println("Points inside:");
        System.out.println(_insidePoints);
        System.out.println("Points total:");
        System.out.println(_points);
        System.out.println("Pi approximately:");
        pi=((double)_insidePoints/_points)*4;
        System.out.println(pi);
        System.out.println();

        _writeInData(_checkDivergenceToPi(pi));
    }

    /**
     * DivergenceToPi Method.
     * Method that calculates the difference between a double value and the Math.PI constant
     * @param _piApprox the value which will be compared with Math.PI
     * @return  returns the deviation as a double value
     */
    public static double _checkDivergenceToPi(double _piApprox)
    {
    double _totalDivergence;

    _totalDivergence = Math.PI - _piApprox;
    System.out.println("gap: "+ _totalDivergence);
    return _totalDivergence;
    }

    /**
     * Write Data Method.
     * Method to write result into a .txt
     * @param _divergence   divergence that will be written inside the file
     * @throws IOException  IOException
     */
    public static void _writeInData(double _divergence) throws IOException {
        String _fileName = "MonteCarlo.txt";
        String text = ""+_divergence+"";
        Files.writeString(FileSystems.getDefault().getPath(_fileName), text);
    }
}