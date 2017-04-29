package level_2.lab2_1_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by olegpoberezhets on 4/23/17.
 */
public class SerializeDemo {
    public static void main(String[] args) throws IOException {

        Employee employee = new Employee();
        employee.setSSN(1234567);
        employee.setNumber(3232);
        employee.setName("Vasya");
        employee.setAddress("Kiev");

        FileOutputStream fos = new FileOutputStream("/Users/olegpoberezhets/IdeaProjects/BrainAcademyLAB/src/lab2_1_2/DemoSerialize/employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        try{
            oos.writeObject(employee);
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            oos.close();
        }
    }
}
