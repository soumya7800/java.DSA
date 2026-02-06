 package String_Methods;

class string_compress {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        int i = 0 ,j = 0;

        while(j<args[0].length()) {
            if(args[0].charAt(i) == args[0].charAt(j)) {
                j++;
            }
            else {
                sb.append(args[0].charAt(i));
                sb.append(j-i);
                i = j;
            }
        }
        sb.append(args[0].charAt(i));
        sb.append(args[0].length()-i);
        System.out.println(sb.toString());
    }
}