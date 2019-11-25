import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Host {

    public static void main(String[] args) throws IOException {

    System.out.println("=================================================================");
    System.out.println("              Hospital Management System");
    System.out.println("=================================================================");
    System.out.println("Enter Your Choice!");
    System.out.println("-----------------------------------------------------------------");
    System.out.println("        Press 1 : Doctor");
    System.out.println("        Press 2 : Staff");
    System.out.println("        Press 3 : Administration");
    System.out.println("=================================================================");

    Host ob = new Host();
    ob.controlUnit();
}

    void controlUnit() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(in);

        System.out.print("Choice :-  ");
        String str = buff.readLine();
        Integer input = Integer.parseInt(str);

        Login obj = new Login();

        switch (input) {
            case 1: {
                obj.loginDoctor();
                break;
            }
            case 2: {
                obj.loginStaff();
                break;
            }
            case 3: {
                obj.loginAdmin();
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
}
