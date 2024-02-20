import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class MainClass {

    public static void main(String []  args){
        try {
            int cnt=0;
            FileReader f= new FileReader( "Lincoln.txt");
            BufferedReader br = new BufferedReader(f);
            while (br.readLine()!=null){
                String arr [] = br.readLine().split(" ");
                cnt+=arr.length;
            }
            System.out.println(cnt);

        }catch(Exception e){
            System.out.println(e);
        }


    }

}
