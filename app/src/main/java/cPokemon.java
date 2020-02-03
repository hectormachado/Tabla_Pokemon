public class cPokemon {

        private String nombre;
        private String apellidos;
        private String tipo1;
        private String tipo2;

    public cPokemon(String sNombre, String sApellidos, String stipo1, String stipo2) {
        nombre = sNombre;
        apellidos = sApellidos;
        tipo1 = stipo1;
        tipo2 = stipo2;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {return apellidos; }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }


    public String getTipo2() {return tipo2; }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo1;
    }
    }
