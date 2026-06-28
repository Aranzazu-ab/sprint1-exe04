package L1Exe2;

public class CalculateDni {
    private int numDni;

    public CalculateDni (int numDni){
        if (numDni<0 || numDni > 99999999){
            throw new IllegalArgumentException( "Invalid number");
        }
        this.numDni = numDni;
    }

    public char calculateLetter(int numDni ){
        int remainder = numDni%23;
        String letterDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letterDni.charAt(remainder);
    }
}
