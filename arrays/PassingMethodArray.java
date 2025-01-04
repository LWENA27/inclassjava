public class PassingMethodArray {
        void first(int arr[]){
        System.out.println("The first array is:" +arr[0]);
        }
        void second(int arr[][]){
        System.out.println("The second array is:" +arr[0][0]);
        }
        public static void main(String[] args){
            PassingMethodArray b= new PassingMethodArray();
            int one[]={2,4,6,8};
            int two[][] ={{10,20,30},{20,40,60},{80,100,120}};
            b.first(one);
            b.second(two);
 }
 }