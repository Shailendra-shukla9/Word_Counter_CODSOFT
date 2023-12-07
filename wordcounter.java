import java.util.*;

public class wordcounter {
    public static void main(String args[]){
        System.out.println("************");

        System.out.println("enter your text as you want to enter :");
        Scanner sc = new Scanner(System.in);
        

        String str = sc.nextLine();
        str = str.trim();
        int count =0;

        if(str.length()==0){
          count =0;
        }
        else{
          // count the first word
          // it must exist because the first character
          // must not be space
          count++;
          for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt( i+1)!=' '){ 
              //  '?'
              count++;

            }
          }

        }
        System.out.println("************");

        System.out.println("word count :"+count);

         System.out.println("************");
      

  }
  }