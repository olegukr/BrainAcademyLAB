package level_2.lab2_1_2;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by olegpoberezhets on 4/23/17.
 */
public class DeserializeDemo {
    public static void main(String[] args) throws IOException {

        Employee employee2;
        FileInputStream fis = new FileInputStream("/Users/olegpoberezhets/IdeaProjects/BrainAcademyLAB/src/lab2_1_2/DemoSerialize/employee.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        {
            try {
                employee2 = (Employee) ois.readObject();
                System.out.println(employee2.toString());
            } catch (ClassNotFoundException e1) {
                e1.printStackTrace();
            } finally {
                ois.close();
            }
        }
    }
}











