public class program {
    String program;
    String programName;


    public program(String program, String Name) {
        this.program = program;
        this.programName = Name;

    }
    public String getProgram() {
        return program;
    }
    public String getProgramName() {
        return programName;
    }



    public void add(program program) {
    }

    public void remove(program program) {

    }
    @Override
    public String toString() {
        return "Program: " + program + ", Name: " + programName;
    }
}