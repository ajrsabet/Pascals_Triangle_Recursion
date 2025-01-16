public class BinaryRecursion {

    public static void main(String[] args) {

        int num = 85;
        int bin = 128;

        String answer = expRec(num, bin);
        System.out.print(answer);
    }

    public static String expRec(int num, int bin) {
        if (num == 0) {
            return "0";
        } else if (bin < 1) {
            return "";
        } else if (num >= bin) {
            num = num - bin;
            bin = bin / 2;
            return "1" + expRec(num, bin);
        } else {
            bin = bin / 2;
            return "0" + expRec(num, bin);
        }
    }
}