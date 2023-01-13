package contests.leetcode.biweekly.contest95;

/* https://leetcode.com/problems/categorize-box-according-to-criteria/description/ */

public class CategorizeBox {
    public static void main(String[] args) {
//        int length = 1000, width = 35, height = 700, mass = 300;
//        System.out.println(categorizeBox(length, width, height, mass));

        System.out.println(categorizeBox(2909,
                3968,
                3272,
                727));
    }

    static public String categorizeBox(int length, int width, int height, int mass) {

        long volume = length * width;
        volume *= height;
        long x = (long) Math.pow(10, 4);
        long y = (long) Math.pow(10,9);

        boolean isBulky = ((length >= x) || (width >= x) || (height >= x) || (mass >= x) || ( volume >= y) )? true : false;
        boolean isHeavy = mass >= 100;

        if (isBulky && isHeavy) {
            return "Both";
        }
        if (isBulky) {
            return "Bulky";
        }
        if (isHeavy) {
            return "Heavy";
        }
        return "Neither";
    }
}
