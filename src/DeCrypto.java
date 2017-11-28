public class DeCrypto {
    private String privateCode;
    private String publicCode;

    public DeCrypto(String privateCode, String publicCode) {
        this.privateCode = privateCode;
        this.publicCode = publicCode;
    }

    public String decrypto(){
        int stopCounter = 0;
        StringBuilder builder = new StringBuilder();


        String[] privateCodeArray = privateCode.split("x");

        for (int i = 0; i < privateCodeArray.length; i++) {
             int toDelete = Integer.valueOf(privateCodeArray[i]);
             int howManyNumber = Integer.valueOf(privateCodeArray[i+1]);

             int sum = Integer.valueOf(publicCode.substring(stopCounter, stopCounter + howManyNumber));
             builder.append((char)(sum - toDelete));
            stopCounter += howManyNumber;
        }
        return builder.toString();
    }
}
