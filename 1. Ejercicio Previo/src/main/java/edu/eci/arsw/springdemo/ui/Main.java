/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.springdemo.ui;

import edu.eci.arsw.springdemo.GrammarChecker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Clase principal para ejecutar la aplicación de verificación gramatical.
 * Utiliza Spring para inyectar la dependencia del SpellChecker y realizar la verificación.
 * 
 * @author hcadavid
 */
public class Main {

    /**
     * Método principal que inicializa el contexto de Spring y realiza la verificación gramatical.
     * 
     * @param a argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String a[]) {
        // Se carga el contexto de Spring desde el archivo XML
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Se obtiene un bean de tipo GrammarChecker
        GrammarChecker gc = ac.getBean(GrammarChecker.class);

        System.out.println("\n\n\n\n");
        // Se realiza la verificación de un texto de ejemplo
        System.out.println(gc.check("la la la "));
        System.out.println("\n\n\n\n");
    }

}
