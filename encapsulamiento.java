class Persona{
    private String nombre="alberto"; //acceso restringido
    //nota: cuando un atributo sea privado la orma de acceder sera por Getter= obtener o Setter=escribir
    // utilizando el metodo getter
    public String getNombre(){
        return nombre;
    }
    //realizando el metodo Getter
    public void setNombre(String Nuevonombre){
        this.nombre=Nuevonombre;
    }
}
