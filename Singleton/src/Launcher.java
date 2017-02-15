
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instituto inst = Instituto.getInstituto();
        inst.setNombreInstituto("Instituto triangulo");
        System.out.println(inst.getNombreInstituto());
        
        Instituto inst2 = Instituto.getInstituto();
        System.out.println(inst2.getNombreInstituto());
        
        Instituto inst3 = Instituto.getInstituto();
        inst3.setNombreInstituto("Instituto INGABO");
        
        System.out.println(inst2.getNombreInstituto());
    }
}
