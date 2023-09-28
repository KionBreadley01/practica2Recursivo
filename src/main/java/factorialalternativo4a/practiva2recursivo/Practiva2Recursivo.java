/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package factorialalternativo4a.practiva2recursivo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ROBERTO
 */
public class Practiva2Recursivo {

    public static void main(String[] args) throws IOException {
        int a =0,b= 0;
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
          System.out.println("ingrese el primer numero: ");
        a = Integer.parseInt(reader.readLine());
        System.out.println("ingrese el segundo numero:");
        b = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
        }
            
        System.out.println("El MCD es: " + MCD(a, b));
    }

    public static int MCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return MCD(b, a % b);
        }
    }
    }

