import java.util.Arrays;

public class ArrayOccurence {

    public static void main(String[] args) {
        System.out.println(getCalzoneSales(new int[]{12, 6, 40, 3, 8, 40}));
    }

    public static int getCalzoneSales(int[] pizza) {

        Arrays.sort(pizza);

        final int CALZONE = 40;

        for (int counter = 0; counter < pizza.length; counter++) {
            if(counter > 0) {
                counter++;
                return counter;
            }

        }
        return 0;
    }
}

//        boolean[] answers = { true, true, false, false };
//
//        answers[0] = false;
//        answers[2] = true;
//
//        for(int i = 0; i < answers.length; i++) {
//            boolean b = answers[i];
//            System.out.print(b + " ");
//        }
//
//        int answer = 0;
//        for(int i = 0; i < 10; i++) {
//            if(i % 2 == 0) {
//                answer = answer + i;
//            }
//        }
//        System.out.println(answer);
//
//        for(int i = 0; i < 5; i++) {
//            int sum = 0;
//            sum += i;
//            System.out.print(sum + " ");
//        }
//

//        int[] numbers = new int[10];
//        for(int ix = 0; ix < numbers.length; ix++) {
//            numbers[ix] = ix * 2;
//        }
//
//        int result = numbers[3];
//        System.out.println("result: " + result);
//
//        int sum = 0;
//        for(int i = 10; i > 0; i -= 3) {
//            sum += i;
//        }
//        System.out.println(sum);

//        int[] orders = {1,2,2,3,4,1,1,5,5,1};
//        // Arrays.sort(arr);
//        int count = 0;
//        for(int i=0;i<orders.length;i++){
//            for(int j=0;j<orders.length;j++){
//                if(orders[i] == orders[j]){
//                    if(j<i){
//                        break;
//                    }
//                    count++;
//                }
//            }
//            if(count > 0){
//                System.out.println("occurence of "+orders[i]+"  "+(count));
//                count = 0;
//            }
//        }