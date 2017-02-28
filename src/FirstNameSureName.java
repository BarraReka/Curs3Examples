/**
 * Created by Reka on 28.02.2017.
 */
public class FirstNameSureName {
    public static void main(String[] args) {

        int lung;

        lung = SkeletonJava.readIntConsole("Introduceti lungimea sirului de nume");

        String[] firstName = new String[lung];
        String[] surName = new String[lung];
        int [] birthDay= new int[lung];


     for(int i=0; i<lung; i++ ){
         firstName[i] = SkeletonJava.readStringConsole("Firstnameis:");
         surName[i] = SkeletonJava.readStringConsole("Surenameis:");
         birthDay[i] = SkeletonJava.readIntConsole("Birthday is:");
           }

           for (int i=0; i<lung;i++){
               SkeletonJava.printConsole(surName[i]+"+"+firstName[i]+" "+surName[i].length()+birthDay);
           }
    }
}
