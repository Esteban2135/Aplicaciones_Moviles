public class PersonaUniversidad implements Persona {
    protected String nombre;

    public PersonaUniversidad(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

