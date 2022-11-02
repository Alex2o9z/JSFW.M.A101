import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Test {
    //c.	Attribute IOService iOService;
    public static void main(String[] args) {
        //d.	A main method, you should:
        //a.	Create a list of pets and call method savePet() from IOService  to save this list to file pets.txt
        //b.	Call method getPets to get list saved pet, loop in this list and call makeNoise() method.
        Pet p = new Pet("Mozart", "cat", 5);
        Pet p1 = new Pet("Mozart1", "cat1", 51);
        Pet p2 = new Pet("Mozart", "cat2", 52);
        List<Pet> list = new ArrayList<>();
        list.add(p);
        list.add(p1);
        list.add(p2);
        try {
            FileWriter fileWriter = new FileWriter("src/Pet.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Pet o : list) {
                bufferedWriter.write(o.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {}
    }
}
