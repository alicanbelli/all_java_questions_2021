package _15_Arrays;

public class Practise_6_UniqueValuesInArray {

    public static void main(String[] args) {
        //             0  1   2  3  4   5   6
//		int [] nums = {21,21,23,54,537,23,2};//the length of array 7
        String [] numbers ={"21","21","23","54","537","23","2"};
        //       0
        String all="";
        int counter =0;
        for (int i = 0; i < numbers.length; i++) {
            //       0
            String dup2 = "";
            int count =0;
            for (int j = 0; j < numbers.length; j++) {
                // true
                if(i != j && numbers[i].equals(numbers[j])) {
                    count++;
                    break;
                }
            }

            if(count > 0) {

                all += numbers[i];

            }

        }

        System.out.println(all);


        String store ="";
        for (int i = 0; i < numbers.length; i++) {
            int c=0;
            if(all.contains(numbers[i])) {
                for (int j = 0; j < all.length(); j++) {
                    if(all.substring(j).equals(numbers[i])) {
                        c++;
                        if(c == 1)
                            store += numbers[i];
                    }
                }
            }
        }


        System.out.println(store);


    }


}
