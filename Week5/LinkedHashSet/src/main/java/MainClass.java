import java.util.*;

public class MainClass {

    public static void main( String [] args){

        LinkedHashSet<Integer> st=new LinkedHashSet();
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt(); int x;
        for (int j = 0; j <t ; j++) {
            int queries= sc.nextInt();

            for (int i = 0; i <queries; i++) {

                String s = sc.next();
                switch (s) {
                    case "a":
                        x = sc.nextInt();
                        st.add(x);
                        break;
                    case "b": {
                        ArrayList<Integer> array = new ArrayList<>(st);
                        Collections.sort(array);
                        Iterator<Integer> itr = array.iterator();
                        while (itr.hasNext()) {
                            System.out.print(itr.next()+" ");
                        }
                        System.out.println(" ");
                        break;
                    }
                    case "c":
                        x = sc.nextInt();
                        st.remove(x);
                        break;
                    case "d":

                        x = sc.nextInt();
                        System.out.println(st.contains(x));
                        break;
                    case "e":
                        System.out.println(st.size());

                        break;
                    default: {

                        Iterator<Integer> itr = st.iterator();
                        while (itr.hasNext()) {
                            System.out.print(itr.next() + " ");
                        }
                        System.out.println(" ");
                        break;
                    }
                }
            }

        }

    }

}
