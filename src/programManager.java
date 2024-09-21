import java.util.ArrayList;
import java.util.List;

public class programManager {
    String programMangerName;
    List<program> program;
    public programManager(String programMangerName) {
        this.programMangerName = programMangerName;

        this.program = new ArrayList<program>();

    }
    public void addProgram(program program) {
        program.add(program);
    }
    public void removeProgram(program program) {
        program.remove(program);
    }

    public List<program> getProgram() {
        return program;
    }
    public String getProgramMangerName() {
        return programMangerName;
    }
    public void listPrograms() {
        System.out.println("program in"+programMangerName+"programManger");
        for (program program : program) {
            System.out.println(program.toString());
        }
    }

}