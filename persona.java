package newpackage;

import java.util.Random;

public class persona {
    
    private String nombre;
    private byte edad;
    private int cedula;
    private char sexo;
    private byte peso;
    private float altura;

    public persona(String nombre, byte edad, char sexo) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = 0;
        this.sexo = sexo;
        this.peso = 0; 
        this.altura = 0;
                
    }   
    
    public float calcularIMC(byte peso, float altura){
        
        peso = this.peso;
        altura = this.altura;
        
        float pesoIdeal = (float)(peso / (Math.pow(altura, 2)));
        
        if(pesoIdeal < 20){
            return -1;
        }else if(pesoIdeal >= 20 && pesoIdeal <= 25){
            return 0;
        }else
            return 1;
        
    }
    
    public boolean esMayorDeEdad(byte edad){
       
        edad = this.edad;
        
        if(edad >= 18){
         return true;
        }else{
           return false;
        }
    }
    
    public boolean comprobarSexo(char sexo){
        
        sexo = this.sexo;
        
        if(sexo != 'H' && sexo != 'M'){
            sexo = 'H';
    }
        System.out.print("El sexo es " + sexo);
        return false;
    }

    
    public String generacionCedula (){
        Random aleatorio = new Random(
        System.currentTimeMillis());
        int numero = aleatorio.nextInt(
        1000000000)+ 1000000000;
        return numero+"";
    }
    
    public String toString(){
        return "persona [nombre=" + nombre + ", edad=" + edad + ", cedula=" 
                + cedula + ",sexo=" + sexo + ",peso=" + peso + ",altura=" + altura + "]";
    }
       
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(byte peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
