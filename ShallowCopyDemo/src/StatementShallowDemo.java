import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.List;

public class StatementShallowDemo {

    public static void main(String a[]){
        String sql = "Select * From Movies";


        List<String> parmeters = new ArrayList<>();
        parmeters.add("Starwars");


        Record record = new Record();

        Statement firstStatement = new Statement(sql, parmeters, record);

        System.out.println(firstStatement);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();


        System.out.println("---------------------------------------");
        System.out.println(secondStatement);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());


    }
}
