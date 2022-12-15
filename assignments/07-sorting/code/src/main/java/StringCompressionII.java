public class StringCompressionII {
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compressString(str));
    }

    static public String compressString(String str){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i< str.length()){
            int count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i)+""+count);
            i++;
        }
        return sb.toString();
    }
}
