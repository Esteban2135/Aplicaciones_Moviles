public class Cliente extends PersonaUniversidad {
    private String tipo;

    public Cliente(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

