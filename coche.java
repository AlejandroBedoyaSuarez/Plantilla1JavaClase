//Ejemplo de una clase
public class coche{
    //Atributos de la clase coche(propiedades)
    String marca;
    String modelo;
    int año;

    //Metodos de la clase padre fruteria
    void arrancar(){
        System.out.println("El coche está arrancando.");
    }
    void frenar(){
        System.out.println("El coche está frenando.");
    }
    void acelerar(){
        System.out.println("El coche está acelerando.");
    }
}

//Ejemplo objeto
public class main{
public static void main(String[]args){ 
    //Clase hija uno con sus atributos que estan definidos en laclase padre (marca,modelo,año)
    //arrancar es nuevo atributo
    coche miCoche=new coche();
    miCoche.marca="Toyota";
    miCoche.modelo="Corolla";
    miCoche.año=2023;
    miCoche.arrancar();
    //Clase hija dos
    coche tuCoche=new coche();
    tuCoche.marca="Honda";
    tuCoche.modelo="Civic";
    tuCoche.año=2022;
    }
}

//Ejemplo de herencia
public class CocheDeportivo extends coche{
    int velocidadMaxima;
    void hacerDrift(){
        System.out.println("!Derrapando!");
    }
}