import java.io.*;

public class InputTest {

    public static void main(String... args){

        int c;

        try{

            InputStream in = new LowerCase(new BufferedInputStream(new FileInputStream("test.txt")));

            while((c = in.read()) >= 0){
                System.out.print((char) c);
            }

            in.close();

        }catch(IOException ex){
            ex.printStackTrace();
        }

    }

}