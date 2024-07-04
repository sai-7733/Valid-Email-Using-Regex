import java.util.regex.*;
import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m=p.matcher(sc.next());
        if(m.matches()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}