import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Admin {

    void controlUnit() throws IOException {
        System.out.println("==============================================================");
        System.out.println("                   Please Enter Your Choice!                  ");
        System.out.println("==============================================================");
        System.out.println("        Press 1 : Doctors Detail");
        System.out.println("        Press 2 : Staff Detail");
        System.out.println("--------------------------------------------------------------");
        System.out.println("        Press 3 : Add Doctor Detail");
        System.out.println("        Press 4 : Add Staff Detail");
        System.out.println("--------------------------------------------------------------");
        System.out.println("        Press 5 : Remove Doctor Detail");
        System.out.println("        Press 6 : Remove Staff Detail");
        System.out.println("=================================================================");
        System.out.print("Choice :- ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(in);

        System.out.print("Choice :-  ");
        String str = buff.readLine();
        Integer input = Integer.parseInt(str);

        Login obj = new Login();

        switch (input) {
            case 1: {
                doctorDetail();
                break;
            }
            case 2: {
                staffDetail();
                break;
            }
            case 3: {
                onBoardDoctor();
                break;
            }
            case 4: {
                onBoardStaff();
                break;
            }
            case 5: {
                offBoardDoctor();
                break;
            }
            case 6: {
                offBoardStaff();
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
    void doctorDetail(){

    }
    void staffDetail(){

    }
    void onBoardDoctor(){

    }
    void onBoardStaff(){

    }
    void offBoardDoctor(){

    }
    void offBoardStaff(){

    }
}
