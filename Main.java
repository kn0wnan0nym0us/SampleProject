import javax.sound.sampled.SourceDataLine;

// Practices on primitive data types, variables and passing objects and cast 
//operators
public class Main {
    public static void main (String[] args) {
     
    //int data types width of 32 (4 bytes)
        int myIntValue = 12_305_765;
        int myNewIntValue = myIntValue / 5;
        System.out.println("My New Int Value =" + myNewIntValue);
        
    // Byte data types width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue / 2);
        System.out.println("My New Byte Value =" + myNewByteValue);

    //Short data types width of 16
        short myShortValue = (short) 5_576_342;
        short myNewShortValue = (short) (myShortValue / 2);
        System.out.println("My New Short Value =" + myNewShortValue);
    
    //Long data types width of 64
        long myLongValue = 3_565_576_342_654_678_900L;
        long myNewLongValue = myLongValue/1000 * 10 + myNewByteValue;
        System.out.println("My New Long Value =" + myNewLongValue);

    //Float data types width of 32 (4 bytes)
        float myFloatValue = 6f;
        float myNewFloatValue = myFloatValue/4;
        System.out.println("My New Float Value =" + myNewFloatValue);

    //Double data types width of 64 (8 bytes)
         double myDoubleValue = 6.25;
         double myNewDoubleValue = myDoubleValue * 4;
         System.out.println("My New Double Value =" + myNewDoubleValue);

    //conversion of a given number of pounds to kilogram 
    // 1 kilogram is 0.45359237
        double numberOfPounds = 500d;
        double convertedNumberOfPounds = numberOfPounds * 0.45359237;
        System.out.println("Converted Number Of Pounds =" + convertedNumberOfPounds);
        
    //char data types width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("King" + myChar);

    //Boolean data type
        boolean weAreLegit = true;
        System.out.println(weAreLegit + "! We are Legit");

        boolean iAmaTechie = true;
        if (iAmaTechie == true);
        System.out.println("Yes, I am a Techie");

            
        
    }
}