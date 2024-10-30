public class Hotel {
    String cliente;
    String habitacion;
    int piso;

    void atencion(){
        System.out.println("El cliente está siendo atendido.");
    }
    
    void limpieza(){
        System.out.println("La habitación se está limpiando.");
    }

    void ascensor(){
        System.out.println("El ascensor va a ser usado.");
    }
}

    public class main {
    public static void main(String[] args) {
        Hotel pasillo= new Hotel();
        pasillo.cliente="Las habitaciones están a lo largo del pasillo";
        pasillo.habitacion= "Las habitaciones están numeradas a lo largo del pasillo";
        pasillo.piso= 1;
    }
        
    }

    


