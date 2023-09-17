import java.util.Scanner;

public class ZooManagement {


    public static void main(String[] args) {

        // instruction 1
         int nbrCages = 20;
         String zooName = "my zoo";
        System.out.println(zooName+ " comporte "+ nbrCages+ " cages");


        // instruction 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le nom du zoo : ");
        zooName = scanner.nextLine();

        System.out.println("Entrez le nombre du cages");
        if (scanner.hasNextInt()){
            nbrCages = scanner.nextInt();
        }
        else {
            System.out.println("Incorrect input");
        }

        System.out.println(zooName+ " comporte "+ nbrCages+ " cages");
    }
}
