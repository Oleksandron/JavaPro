package ua.hillel.hw7;

public class ArrayValueCalculator {
    public static int doCalc(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    if (arr.length != 4 & arr[i].length != 4) {
                        throw new ArraySizeException();
                    }
                } catch (Exception e) {
                    break;
                }

                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Bad data in " + i + " " + j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] test1 = new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "0", "5", "7"}};
        System.out.println(doCalc(test1));
        String[][] test2 = new String[][]{{"1", "2", "o", "4"}, {"5", "6", "7", "8"}, {"9", "0", "5", "7"}};
        try{
            System.out.println(doCalc(test2));
        }catch (ArrayDataException err){
            err.getMessage();
        }
        String[][] test3 = new String[][]{{"1", "2", "3", "4"}, {"5", "7", "8"}, {"9", "0", "5", "7"}};
        try{
            System.out.println(doCalc(test3));
        }catch (ArraySizeException err){
            err.getMessage();
        }
    }
}
