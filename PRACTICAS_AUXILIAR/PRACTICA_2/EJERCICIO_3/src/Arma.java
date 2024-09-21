class Arma {
    private String nombre;
    private String rareza;
    private int daño;
    private int precision;
    private int absorcion;

    public Arma(String nombre, String rareza, int daño, int precision, int absorcion) {
        this.nombre = nombre;
        this.rareza = rareza;
        this.daño = daño;
        this.precision = precision;
        this.absorcion = absorcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRareza() {
        return rareza;
    }

    public int getDaño() {
        return daño;
    }

    public int getPrecision() {
        return precision;
    }

    public int getAbsorcion() {
        return absorcion;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "nombre='" + nombre + '\'' +
                ", rareza='" + rareza + '\'' +
                ", daño=" + daño +
                ", precision=" + precision +
                ", absorcion=" + absorcion +
                '}';
    }
}

