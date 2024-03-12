public class Main {
    public static void main(String[] args) {

        String input ="wdj3oks9485";
        int ans=calculate(input);
        System.out.println("sum of the string number:"+ans);
    }
    public static int calculate(String input){
        int sum=0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                sum += num;
            }
        }
        return sum;
    }
}