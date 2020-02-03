package com.example.tablapokemon;

public class cPokemon {

    //<< -- LISTA POKEMON -- >>
    private int id;
    private String nombre;
    private String numero;
    private String tipo1;
    private String tipo2;
    private String foto;
    private String fotoSombra;

    //<< -- INFO -- >>

    private String tipoPokemon;
    private String descripcion;
    private String altura;
    private String peso;
    private String habilidad;
    private String habilidadOculta;
    private String url;

    public cPokemon(int sid, String sFoto, String sfotoSombra, String sNombre, String snumero, String stipo1, String stipo2, String stipoPokemon, String sdescripcion, String saltura, String speso, String shabilidad, String shabilidadOculta, String surl) {
        id = sid;
        foto = sFoto;
        fotoSombra = sfotoSombra;
        nombre = sNombre;
        numero = snumero;
        tipo1 = stipo1;
        tipo2 = stipo2;

        tipoPokemon = stipoPokemon;
        descripcion = sdescripcion;
        altura = saltura;
        peso = speso;
        habilidad = shabilidad;
        habilidadOculta = shabilidadOculta;
        url = surl;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNumero() {return numero; }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getTipo1() {
        return tipo1;
    }

    public String getTipo2() {return tipo2; }

    public String getFoto() {return foto; }


    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getHabilidadOculta() {
        return habilidadOculta;
    }

    public void setHabilidadOculta(String habilidadOculta) {
        this.habilidadOculta = habilidadOculta;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFotoSombra() {
        return fotoSombra;
    }

    public void setFotoSombra(String fotoSombra) {
        this.fotoSombra = fotoSombra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
