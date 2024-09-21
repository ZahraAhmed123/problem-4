
public class Main {
    public static void main(String[] args) {
        program PG = new program("project", "videos games");
        program PG1 = new program("graphic", "photoshopping");
        program PG2 = new program("applications", "installing");

        programManager pM = new programManager("News");

        pM.addProgram(PG);
        pM.addProgram(PG1);

        System.out.println("This is the first record of TV show program:");
        pM.listPrograms();

        System.out.println("\nProgram doesn't involve in programManager:");
        pM.addProgram(PG2);

        System.out.println("\nThis is after adding a new program:");
        pM.listPrograms();

        pM.removeProgram(PG2);

        System.out.println("\nThis is after removing a program:");
        pM.listPrograms();

        System.out.println("\nRemoved program still exists in memory:");
        System.out.println(PG2);
    }

}