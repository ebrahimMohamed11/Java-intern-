import java.util.*;

public class mainClass {
    static HashMap<Character, ArrayList<String>> mp = new HashMap();

    public static void print(){

        for(Map.Entry m:mp.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
    public static void find( Character a){

        if (mp.containsKey(a)) System.out.println(mp.get(a));
    }

    public static void main ( String [] args){


        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(); String s;
        for (int i = 0; i < n; i++) {
            s= sc.next();
            Character a= s.charAt(0);

            if ( !mp.containsKey(a)){
                mp.put(a, new ArrayList());
                mp.get(a).add(s);

            }else{
                mp.get(a).add(s);
                Collections.sort(mp.get(a));
            }


        }


    }

}
