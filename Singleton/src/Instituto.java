
public class Instituto {
    private static Instituto instance;
    private String nombreInstituto;
    
    private Instituto() {
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }
  
    public static Instituto getInstituto(){
        if(instance==null){
            instance = new Instituto();
        }
        return instance;
    }
    
}
