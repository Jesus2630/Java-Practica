public class FlujosControl {
    public static void main(String[] args){
        System.out.println("Soy la sección de flujo de control");

        //Bucle if else-if else
        String nombre = "Jesus";
        int edad = 23;

        if(edad > 18){
            System.out.println("Hola " + nombre + " " + "Sos mayor de edad");
        }else if (edad < 0){
            System.out.println("Debes ingresar una edad válida");
        }else{
            System.out.println("Hola" + nombre + " Sos menor de edad");
        }

        //Switch

        String miExpresion = "3";
        switch(miExpresion){
            case "texto":
            case "Texto":
            case "TEXTO":
                System.out.println("Soy una variable con un valor de texto");
                break;
            case "2":
                System.out.println("Soy una variable con un numero en String");
                break;
            default:
                System.out.println("No existen coincidencias.");
        }

    }
}
