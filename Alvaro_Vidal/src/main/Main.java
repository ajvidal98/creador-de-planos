package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        /**
         * int lista[]=new int[20]; int i,limite;
         *
         * System.out.println("indique el limite de la pieza");
         * limite=lector.nextInt();
         *
         * for (i = 0; i <limite;i ++) { System.out.println("g["+(i+1)+"]");
         * lista[i]=lector.nextInt();
         *
         * }
         * for (i = 0; i < limite;i ++) { System.out.println(lista[i]+",");
         *
         * }*
         */
        int gato;
        int fila_columna_gato;
        int fila_columna_raton;
        int raton;
        int maximo = 0;
        int a =0;
        

        System.out.println("-------------------------------------");
        System.out.println("Bienvenido al creador de planos");
        System.out.println("------------------------------------ ");
        System.out.println("Regla: Todo lo que sea coordenada");
        System.out.println("Se debe ingresar separado por una");
        System.out.println("coma. EJ: 1,4");
        System.out.println("-------------------------------------");
        System.out.print("Ingrese ancho y alto de la pieza:");
        
            
            
        
        String opcion = lector.nextLine();
        String[] vector = opcion.split(",");
        int x = Integer.parseInt(vector[0]);
        int y = Integer.parseInt(vector[1]);

        String[][] matriz = new String[x][y];
        
        
        System.out.print("f/c");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(maximo > 20){
                    System.out.println("El máximo valor de ancho y alto debe ser de 20.");
                    System.out.println("-------------------------------------------------");
                    continue;
                }
                
                matriz[i][j] = "  -";
                

            }
            System.out.print("  " );
            System.out.print("0"+i);
        }
        

        for (int i = 0; i < matriz.length; i++) {
            if (i == 0) {
                
                
            }
            System.out.println();
            System.out.print("0" + i);
            
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("--------------------------------------------");
        System.out.println("solo puede ingresar [5] gatos como máximo");
        while (true) {
            
            System.out.print("N°de gatos:");
            gato = Integer.parseInt(lector.nextLine());
            
            if(gato > 5){
                System.out.println("ingrese como maximo 5 gatos. xD");
                System.out.println("---------------------------------");
                continue;
                
            }
            
                
                
                
                
                
            break;
        }
        System.out.println("--------------------------------------------");
        
        System.out.print("f/c");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "  -";
            }
            System.out.print("  " );
            System.out.print("0"+i);
            
            
        }
        for (int i = 0; i < matriz.length; i++) {
            if (i == 0) {
                System.out.println();
            }
            System.out.print("0" + i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
            
        }
        System.out.println("----------------------------");
        while(true){
            int contador =0;
            while(contador < gato){
                contador = contador+1;
                
                System.out.println("gato N°" +contador );
                
                
                
                if(contador > 5){
                    System.out.println("ingrese como maximo 5 gatos. xD");
                    continue;
                    
                    
                }
                int fila_gato;
                int columna_gato;
                while(true){
                    System.out.println("---------------------------");
                    System.out.println("ingrese fila y columna:");
                    System.out.println("---------------------------");
                    
                    String gatos = lector.nextLine();
                    String[] vector1 = gatos.split(",");
                    
                    fila_gato = Integer.parseInt(vector1[0] );
                    
                    columna_gato = Integer.parseInt(vector1[1] );
                    System.out.println("-------------------------------");
                    
                    System.out.println(matriz[fila_gato][columna_gato]);
                    System.out.println("f/c");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            matriz[fila_gato][columna_gato] = "  G";
                            
                           
                            
                            
                                
                            
                                

                            
                        }
                        System.out.print("  " );
                        System.out.print("0"+i);    
                    }
                    for (int i = 0; i < matriz.length; i++) {
                        if (i == 0) {
                            System.out.println();
                        }
                        System.out.print("0" + i);
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print(" " + matriz[i][j]);
                        }
                        System.out.println();
                  
                        
                    }
                    
                    
                    break;
                }
                
                
                
                
            }
            break;
        }
        System.out.println("--------------------------------");
        System.out.println( "Solo puede ingresar[12] ratones como maximo");
        
        while (true) {
            System.out.print("N°de ratones:");
            raton = Integer.parseInt(lector.nextLine());
            if(raton > 12){
                System.out.println("ingrese como maximo 12 ratones. xD");
                System.out.println("---------------------------------");
                continue;
            }
            break;
        }
        System.out.println("------------------------------------------");
        
        System.out.print("f/c");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "  -";
            }
            System.out.print("  " );
            System.out.print("0"+i);
        }
        for (int i = 0; i < matriz.length; i++) {
            if (i == 0) {
                System.out.println();
            }
            System.out.print("0" + i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
            
        }
        System.out.println("---------------------------------------");
        while(true){
            int contador =0;
            while(contador < raton){
                contador = contador+1;
                
                System.out.println("raton N°" +contador );
                
                if(contador > 12){
                    System.out.println("ingrese como maximo 12 ratones. xd");
                    continue;
                }
                int fila_raton;
                int columna_raton;
                while(true){
                    System.out.println("--------------------------------------------------");
                    System.out.println("ingrese fila y columna separada por un espacio:");
                    System.out.println("--------------------------------------------------");
                    String ratones = lector.nextLine();
                    String[] vector2 = ratones.split(",");
                    
                    fila_raton = Integer.parseInt(vector2[0]);
                    columna_raton = Integer.parseInt(vector2[1]);
                    System.out.println("----------------------------------------------------");
                    
                    System.out.println(matriz[fila_raton][columna_raton]);
                    System.out.print("f/c");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            matriz[fila_raton][columna_raton] = "  R";
                            
                                
                            
                        }
                        System.out.print("  " );
                        System.out.print("0"+i);
                    }
                    for (int i = 0; i < matriz.length; i++) {
                        if (i == 0) {
                            System.out.println();
                        }
                        System.out.print("0" + i);
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print(" " + matriz[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                }
                       
                
            }
            break;
            
        }
        int fila_mueble;
        int columna_mueble;
        while(true){
            System.out.println("--------------------------------");
            System.out.println("Proceder?");
            System.out.println("1.- si");
            System.out.println("2.- no");
            System.out.print(">");
            
            String proceder = lector.nextLine();
            
            String mueble = lector.nextLine();
            String[] vector3 = mueble.split(",");
            fila_mueble = Integer.parseInt(vector3[0]);
            columna_mueble = Integer.parseInt(vector3[1]);
            
            break;
        }
        System.out.println("--------------------------------");
        System.out.println( "no se puede colocar un mueble encima de [G( , ) - R( , )");
        
        System.out.println("ingrese muebles separados por un espacio:");
        int mueble;
        while(true){
            System.out.print("N°de muebles:");
            mueble = Integer.parseInt(lector.nextLine());
            break;
        }
        
        
        
    }
}
/**
 * for (int i = 0; i < matris.length; i++) { for(int j=0;j <
 * matris[0].length;j++){ System.out.print(matris[i][j]);
 *
 * }
 * System.out.println();20
 *
 * }*
 */

/**
 * String opcion = input.nextline(); String[]parte= opcion.split(","); int x =
 * Integer.parseInt(parte[0]); int y = Integer.parseInt(parte[1]); mpiesa= new
 * String[x][y];*
 */
/**
 * limite = lector.nextInt(); for (i = 0; i < limite; i++) { for (j = 0; j <
 * limite; j++) { String[][] m = new String[20][20]; for (i = 0; i < m.length;
 * i++) { for (j = 0; j < m[i].length; j++) {
 * if (i == 0 && j == 0) {
 * m[i][j] = "f/c";
 *
 * } else {
 * m[i][j] = "-";
 *
 * }
 * }
 * }
 *
 * }
 * System.out.print("");
 * if (limite > 20) { System.out.println("lo lamento, es solo limite 20,");
 * continue;
 *
 * }
 *
 * }
 * /**
 * int numaleatorio;/*creando una matriz aleatoria
 */
/**
 * String[][] m = new String[20][20]; for ( i = 0; i < m.length; i++) { for ( j
 * = 0; j < m[i].length; j++) { if(i == 0 && j == 0){ m[i][j] = "f/c"; }else{
 * m[i][j] = null;s if(i == 0 && j == 1){ m[i][j] = "01"; }else{ m[i][j] = null;
 * } } } }
 *
 * /**for (i=0;i<limite;i++) { for (j=0; j< limite;j++) {
 * matriz[i][j]=numaleatorio=(int)Math.floor(Math.random()*(9-1)+1);
 *
 * }
 *
 * }*
 */
/**
 * System.out.println("la pieza ingresada es de:" + limite + "x" + limite); for
 * (i = 0; i < limite; i++) { for (j = 0; j < limite; j++) {
 * System.out.print("[" + matriz[i][j] + "]");
 *
 * }
 * System.out.println();
 *
 * }
 *
 * /**
 * System.out.print("que fila desea sumar:"); fila=lector.nextInt(); for
 * (i=0;i<20;i++) { sumfila=sumfila+matriz[fila-1][i];
 *
 * }
 * System.out.println("la suma de la fila " +fila + "es: "+sumfila);
 *
 * System.out.print("que columna desea sumar:"); columna=lector.nextInt(); for
 * (i=0;i<20;i++) { sumcolumna=sumcolumna+matriz[i][columna-1];
 *
 *
 * }
 * System.out.println("la suma de la columna " +columna+"es: "+sumcolumna);*
 */
/**
 * int lista[] = new int[20]; int cant_de_gatos; int cant_de_ratones;
 */

/*System.out.println("desea gato o raton?");
        cant_de_gatos = lector.nextInt();

        for (i = 0; i < cant_de_gatos; i++) {
            System.out.println("numero de gatos:");

        }

    }

}*/
