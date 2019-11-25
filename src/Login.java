import java.io.*;

public class Login{

    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader buff = new BufferedReader(in);



    void loginDoctor() throws IOException {
        System.out.println("=================================================================");
        System.out.println("                        Welcome Doctor");
        System.out.println("=================================================================");
        System.out.println("Enter User ID");
        String id = buff.readLine();
        System.out.println("Enter Password");
        String pw = buff.readLine();

        FileReader read = new FileReader("doc_credential.txt");
        BufferedReader bufferedReader = new BufferedReader(read);
        StringBuffer stringBuffer = new StringBuffer();

        String line;
        while((line = bufferedReader.readLine()) != null){
            if((line.substring(0)).contentEquals(id)){
                if((line.substring(0)).contentEquals(pw)){
                    System.out.println("=================== Login Successful ===================");
                    System.out.println("======================= Loging In ======================");
                    Doctor doc = new Doctor();
                    doc.controlUnit();
                }
            }
        }
    }
    void loginStaff() throws IOException {
        System.out.println("=================================================================");
        System.out.println("                        Welcome Staff");
        System.out.println("=================================================================");
        System.out.println("Enter User ID");
        String id = buff.readLine();
        System.out.println("Enter Password");
        String pw = buff.readLine();

        FileReader read = new FileReader("staff_credential.txt");
        BufferedReader bufferedReader = new BufferedReader(read);
        StringBuffer stringBuffer = new StringBuffer();

        String line;
        while((line = bufferedReader.readLine()) != null){
            if((line.substring(0)).contentEquals(id)){
                if((line.substring(0)).contentEquals(pw)){
                    System.out.println("================ Login Successful ================");
                    System.out.println("==================== Loging In ===================");
                    Staff stf = new Staff();
                    stf.controlUnit();
                }
            }
        }
    }
    void loginAdmin() throws IOException {
        System.out.println("=================================================================");
        System.out.println("                        Welcome Adimin");
        System.out.println("=================================================================");
        System.out.println("Enter User ID");
        String id = buff.readLine();
        System.out.println("Enter Password");
        String pw = buff.readLine();

        FileReader read = new FileReader("admin_credential.txt");
        BufferedReader bufferedReader = new BufferedReader(read);
        StringBuffer stringBuffer = new StringBuffer();

        String line;
        while((line = bufferedReader.readLine()) != null){
            if((line.substring(0)).contentEquals(id)){
                if((line.substring(0)).contentEquals(pw)){
                    System.out.println("================= Login Successful =================");
                    System.out.println("===================== Loging In ====================");
                    Admin adm = new Admin();
                    adm.controlUnit();
                }
            }
        }
    }
}
