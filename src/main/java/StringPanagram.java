import java.util.Scanner;

public class StringPanagram {
    public static void main(String args[]){
        //String str = "The quick brown fox jumps over the lazy dog";
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String str=scan.nextLine() ;
        boolean[] alpha=new boolean[26];
        int index=0;
        int flag=1;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z') {

                index = str.charAt(i) - 'A';
            }
                else
                    if (str.charAt(i)>='a' && str.charAt(i)<='z'){
                        index=str.charAt(i)-'a';
            }
                    alpha[index]=true;
        }

        for(int i=0;i<=25;i++) {

            if (alpha[i] == false)
                flag = 0;

        }
            System.out.println(str );

            if(flag == 1)
                System.out.println("the string is panagram");
                else
                    System.out.println("String is not panagram");

        }
    }


