import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Doctor {
    void controlUnit() throws IOException {
        System.out.println("==============================================================");
        System.out.println("                   Please Enter Your Choice!                  ");
        System.out.println("==============================================================");
        System.out.println("               Press 1 : Enter Treatment detail");
        System.out.println("==============================================================");
        System.out.print("Choice :- ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(in);

        System.out.print("Choice :-  ");
        String str = buff.readLine();
        Integer input = Integer.parseInt(str);

        Login obj = new Login();

        switch (input) {
            case 1: {
                treatment();
                break;
            }
            case 0:{
                System.exit(0);
            }
            default: {
                System.out.println("Enter Right Choice Number or Press 0 to Exit");
                controlUnit();
            }
        }
    }
    void treatment() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(in);

        System.out.println("Enter Patient ID");
        String id = buff.readLine();
        id = id+"trt.txt";
        FileWriter wr = new FileWriter(id);

        System.out.println("Enter Treatment Detail");
        String str = buff.readLine();
        wr.write(str);
        wr.close();
    }
}
