import java.util.Scanner;
/**
 * Write a description of class Converter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Converter
{
    // instance variables - replace the example below with your own
    private double x;
    private double conversionfactor;
    /**
     * Constructor for objects of class Converter
     */
    public Converter(double aConversionFactor)
    {
        conversionfactor = aConversionFactor;
    }
    
    public double converTo(double fromMeasurements)
    {   
        x = fromMeasurements * conversionfactor;
        return x;
    }    
    
    public double converFrom(double toMeasurements)
    {
        x = toMeasurements/conversionfactor;
        return x;
    }
    
    
}
