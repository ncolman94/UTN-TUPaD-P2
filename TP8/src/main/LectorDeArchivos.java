/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LectorDeArchivos {

    public static void leerArchivoConRecursos(String rutaArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error de lectura: Archivo no encontrado en la ruta " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error de I/O al leer el archivo: " + e.getMessage());
        }
    }
}
