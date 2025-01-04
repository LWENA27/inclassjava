public class ForLoop {
    public static void main(String[] args){
        for( int FirstYEar=2021;FirstYEar<=2025;FirstYEar++) {
            if( FirstYEar == 2024 ) {
                System.out.println("There is number skipped here");
                continue;
               // break;
            }
            System.out.println("i was at MUST at" + "  " + FirstYEar);
        }
    }
}
