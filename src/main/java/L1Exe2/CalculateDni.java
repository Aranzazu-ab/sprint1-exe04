package L1Exe2;

public class CalculateDni {
    public static char calculateLetter(int numDni){
        if (numDni<0 || numDni > 99999999){
            throw new IllegalArgumentException( "Invalid number");
        }
        int remainder = numDni%23;
        String letterDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letterDni.charAt(remainder);
    }
}
