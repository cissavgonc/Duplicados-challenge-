import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        List<String> duplicateList = new ArrayList<>();

        String[] array1 = new String[]{"Ana","Camila","Daniel","Carlos","Roberta"};
        String[] array2 = new String[]{"Adelma","Marcos","Daniel","Cecilia","Pedro","Ana"};

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i].equals(array2[j])){
                    duplicateList.add(array1[i]);
                }
            }
        }
        
        System.out.println("Esses são os duplicados: ");
        for(int i = 0; i < duplicateList.size(); i++){
            System.out.println(duplicateList.get(i));
        }
    }
}