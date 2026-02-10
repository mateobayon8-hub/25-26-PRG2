public class primeraVersionEdlin {
    public static void main(String[] args) {
        String elementosMenu[] = {"--------------------------------------------------", 
                                "0: | Bienvenidos al editor EDLIN", 
                                "1:*| Utilice el menu inferior para editar el texto", 
                                "3: | [L] permite definir la linea activa, ",
                                "4: | [E] permite editar la linea activa",
                                "5: | [I] permite intercambiar dos lineas",
                                "6: | [B] borra el contenido de la linea activa",
                                "7: | [D] deshace la última acción realizada",
                                "8: | [S] sale del programa",
                                "9: |" ,
                                "--------------------------------------------------"};
        
        imprimirMenu(elementosMenu);
        seleccionMenu(elementosMenu);


    }
    
    public static void imprimirMenu(String[] elementosMenu) {
        for (String element : elementosMenu) {
            System.out.println(element);
        }
    }

    public static void seleccionMenu(String[] elementosMenu) {
        switch(elementosMenu.length) {
            case 0:
                break;
            default:
                break;
        }
    }
}
