import java.io.*;

/**
 *<h1>Add Two Numbers!</h1>
 * The AddNum program implements an application that
 * simply adds two given integer numbers and Prints
 *the output on the screen.
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more 
 * user friendly and it is assumed as a high quality code.
 * 
 * @author  Muhammad Daffa
 * @version 1.0
 * @since   2023-01-24
 */
 
public class AddNum {

    /**
     * This ,ethod is used to add two integers. This is
     * a the simplest from of a class method, just to
     * show the usage of various javadoc Tags.
     * @param NumA this is the first parameter to addNum method
     * @param NumB this is the second parameter to addNum method
     * @return int This returns sum of numA and numB
     */
     public int addNum(int numA, int numB){
         return numA + numB;
     }
     
     /**
      * This is the main method which makes use of addNum method.
      * @param args Unsued.
      * @exception IOException On input error.
      * @see IOException
      */
     
    public static void main(String args[]) throws IOException {
     AddNum obj = new AddNum();
     int sum = obj.addNum(10,20);
     
     System.out.println("Sum of 10 and 20 is :" + sum);
    }
    
}