import java.util.*;

public class test {


    public static void main(String[] args) {


       String str =new String ("Farzona");
        System.out.println("str = " + str);

        StringBuilder strb = new StringBuilder("Farzona");

        System.out.println("strb.reverse() = " + strb.reverse());
        strb.replace(0,1,"T");
        System.out.println("strb = " + strb);

        String result ="";
        for( int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i)+"";
        }
        System.out.println("str = " + result);

        String trim ="  Firuz   H";
        System.out.println("trim = " + trim);
        System.out.println("trim.trim() = " + trim.trim());

        ArrayList<String> names = new ArrayList<>();
        names.add("Firuz");
        names.add("Farzona");
        names.add("Hasanjon");
        names.add("Zuhrobonu");
        names.add("Shuhratjon");

        System.out.println("names = " + names);

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
           String name =it.next();
           if(name=="Firuz" || name.equals("Farzona") || name.endsWith("jon")){
               it.remove();
           }
        }
        System.out.println("names = " + names);


    }



    }

