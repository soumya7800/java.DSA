package String_Methods;

public class updatr_position {
    public static void main(String[] args) {
        String str ;
        String str1 = "Physics-wallah";

        for(int i=0; i<str1.length(); i++)
            {
            if(str1.charAt(i)=='-')
                {
                str = str1.substring(0,i) + " " + str1.substring(i+1);
                
                System.out.println(str);
            }
            else{
                str = str1;
                System.out.println(str);
            }
        }

    }
}
