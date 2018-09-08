/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingandconversion;

/**
 *
 * @author mb930
 */
public class CastingandConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int anInt = 12;
    double aDoubleWithDecimal = -3.95;
    double aDoubleWithoutDecimal = 4;
    char aChar = 'a';
    
    System.out.println("Printing the vars out regularly:");
    System.out.println(anInt);
    System.out.println(aDoubleWithDecimal);
    System.out.println(aDoubleWithoutDecimal);
    System.out.println(aChar);
    System.out.println();
    
    /*
    a. int values that are stored in a double get converted to a double by the 
        addition of a .0
    b. the conversion is automatic
    */
    
    System.out.println("Printing the vars casted as ints:");
    System.out.println( (int)anInt );
    System.out.println( (int)aDoubleWithDecimal );
    System.out.println( (int)aDoubleWithoutDecimal );
    System.out.println( (int)aChar );
    System.out.println();
    
    /*
    a. when you cast a double to an int the decimal is removed and the number
        is truncated
    b. when you cast a char to an int it is converted to a number
    c. it is converted to its numerical representation in ASCII
    */
    
    System.out.println("Printing the vars casted as doubles:");
    System.out.println( (double)anInt );
    System.out.println( (double)aDoubleWithDecimal );
    System.out.println( (double)aDoubleWithoutDecimal );
    System.out.println( (double)aChar );
    System.out.println();
    
    /*
    a. nothing is different than I expected
    b. I had already observed what happens with ints are converted to a double
        a .0 is added to it and I had also already observed what happens to a 
        char converted to an int, that it is converted to its numerical 
        representation.
    */
    
    System.out.println("Printing the vars casted as chars:");
    System.out.println( (char)anInt );
    System.out.println( (char)aDoubleWithDecimal );
    System.out.println( (char)aDoubleWithoutDecimal );
    System.out.println( (char)aChar );
    System.out.println();
    
    /*
    a. yes it is different
    b. I would have expected the int to convert to c as 12 in ASCII is the 
        numerical representation of c but instead it was converted to an up 
        arrow. I expected that the doubles would not convert to a blank as 
        ASCII does not have any decimals. 
    */
    
    System.out.println( (int)true );
    System.out.println( (boolean)0 );
    System.out.println( (String)12.2 );
    
    char c = 12.2;
    int i = -97.31;

    System.out.println("a: Booleans cannot be casted into anouter data type");
    System.out.println("b: other data types cannot be casted into a boolean");
    System.out.println("c. Reference data types are not compatible with primitive data types");
        
    }
    
}
