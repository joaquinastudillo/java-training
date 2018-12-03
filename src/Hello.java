public class Hello {
    public static void main(String[] args){
        //printMegaBytesAndKiloBytes(3079);;
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

    public static boolean bark(boolean barking, int hourOfDay){
        if(barking){
            if(hourOfDay < 0 || hourOfDay > 23){
                return false;
            }else{
                if(hourOfDay < 8 || hourOfDay > 22){
                    return true;
                }else{
                    return false;
                }
            }
        }else {
            return false;
        }
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static boolean hasEqualSum(int one, int two, int three){
        if(one + two == three){
            return true;
        }else{
            return false;
        }
    }

    public static boolean hasTeen(int one, int two, int three){
        if((one >= 13 && one <= 19) || (two >= 13 && two <= 19) || (three >= 13 && three <= 19)){
            return true;
        }else{
            return false;
        }
    }

}
