import java.io.*;

public class Staff {

    void controlUnit() throws IOException {
        System.out.println("==============================================================");
        System.out.println("                   Please Enter Your Choice!                  ");
        System.out.println("==============================================================");
        System.out.println("        Press 1 : Patient Detail");
        System.out.println("--------------------------------------------------------------");
        System.out.println("        Press 2 : Patient Registration");
        System.out.println("--------------------------------------------------------------");
        System.out.println("        Press 3 : Patient Discharge");
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
                patientDetail();
                break;
            }
            case 2: {
                patientRegistration();
                break;
            }
            case 3: {
                patientDischarge();
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


    void patientDetail() throws IOException {
        FileReader read = new FileReader("id.txt");
        BufferedReader bufferedReader = new BufferedReader(read);
        StringBuffer stringBuffer = new StringBuffer();

        System.out.println("Patient Detail");
        String line;
        while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
        }
    }
    void patientRegistration() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(in);

        System.out.println("Enter Patient ID");
        String id = buff.readLine();
        id = id+".txt";
        FileWriter wr = new FileWriter(id);

        System.out.println("Enter Patient Detail");
        String str = buff.readLine();
        wr.write(str);
        wr.close();
    }
    void patientDischarge() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(in);

        System.out.println("Enter Patient ID");
        String id = buff.readLine();
        id = id+".txt";
        FileWriter wr = new FileWriter(id);


        wr.write("Patient Discharged");
        wr.close();
    }
}
