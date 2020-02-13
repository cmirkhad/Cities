package Cities;
import java.io.*;
import java.util.ArrayList;

public class List {

    private static void copy() {
        ArrayList<String> arr = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader("cities.txt"))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<String> copyList = new ArrayList<String>(arr);

    }
//
//    private static void userInput(){
//        ArrayList<String> arrU=new ArrayList<String>();
//        arrU.add();

//    }
}

