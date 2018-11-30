public class Hello {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(3079);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int value = kiloBytes / 1024;
            int remaining = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " +    value + " MB and " + remaining + " KB" );
        }
    }
}
