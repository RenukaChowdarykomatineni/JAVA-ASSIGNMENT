public class QUESTION4 {
    public static void main (String []args){
        for(int i=2;i<=100;i+=2) {
            if(i%5==0){
                System.out.println("Multiple of 5 encountered"+i);
                break;
            }
            System.out.println(i);
        }
    }

    }