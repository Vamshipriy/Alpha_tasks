import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class task1 {

    public static void main(String[] args){
        ArrayList<Integer> grades=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 'end' to stop entering grades");
        while (true) {
            System.out.println("enter the grade");
            String input=scan.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
                
            }
            try{
                int grade=Integer.parseInt(input);
                grades.add(grade);

            }catch(NumberFormatException e){
                System.out.println("Invalid input.please enter number");

            }
            
        }
        System.out.println("grades entered"+grades);
        if (grades.isEmpty()) {
            System.out.println("no grades were entered");
            
        }else{
            int average=(int)grades.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
            int min=Collections.min(grades);
            int max=Collections.max(grades);
            System.out.println("Average"+average);
            System.out.println("Highest"+max);
            System.out.println("Lowest"+min);
        }
    }
}