package academy.learnprogramming;
public class BytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes >= 0) {
            int toMegaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + toMegaBytes + " MB and " + remainingKiloBytes + " KB");
        }else{
            System.out.println("Invalid Value");
        }


    }
}

    public class Main {
    public static void main(String[] args) {
        BytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}

