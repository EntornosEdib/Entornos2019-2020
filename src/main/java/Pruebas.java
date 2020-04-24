/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael
 * @version 1.0 -> RC
 */
import java.io.Console;
import java.io.PrintWriter;

public class Pruebas {
    public static void main(String[] args) {
        Console console = System.console();
        if(console != null) {
            PrintWriter pw = console.writer();
            pw.println("Console class writer() method example");
        }else {
            System.out.println("Console is null");
        }
    }
}
