
package datos_estudiantes;

/**
 *
 * @author Hilar
 */
public class Usuario {
    
    String nombre;
    String Apellido;
    int carne;
    int edad;
    String sexo;
    String carrera;
    int totalcreditos;
    
    
     public void setnombre(String nombre){
    this.nombre = nombre; 
}
public String getnombre(){
    return nombre;
}
public void setApellido (String Apellido){
    this.Apellido = Apellido;
}
public String getApellido(){
    return Apellido;
}
public void setcarne( int carne){
    this.carne = carne; 
}
public int getcarne(){
    return carne; 
}
public void setedad( int edad){
    this.edad = edad; 
}
public int getedad(){
    return edad; 
}
public void setsexo( String sexo){
    this.sexo = sexo; 
}
public String getsexo(){
    return sexo; 
}
public void setcarrera( String carrera){
    this.carrera = carrera; 
}
public String getcarrera(){
    return carrera; 
}
 public void settotalcreditos( int totalcreditos){
    this.totalcreditos = totalcreditos; 
}
public int gettotalcreditos(){
    return totalcreditos; 
}
    
}
