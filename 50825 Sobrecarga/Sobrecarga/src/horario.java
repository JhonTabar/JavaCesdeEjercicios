public class horario {
    private String aula;
    private String sede;
    private String materia;

    public horario(){

    }

    public horario(String aula, String sede, String materia) {
        this.aula = aula;
        this.sede = sede;
        this.materia = materia;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getSede() {
        return this.sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

  
}
