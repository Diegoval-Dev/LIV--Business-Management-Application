/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author diego
 */
public class Cifrado {
      private int salto;
    private char[] alfabeto = {	'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'n','o', 'p', 'q', 'r', 's','t', 'u', 'v', 'w', 'x','y', 'z', 'A', 'B', 'C','D', 'E', 'F', 'G', 'H','I', 'J', 'K', 'L', 'M','N', 'N', 'O', 'P', 'Q','R', 'S', 'T', 'U', 'V','W', 'W', 'Z', '0', '1','2', '3', '4', '5', '6','7', '8', '9', ' ', '_'};

    public Cifrado(int salto) {
        this.salto = salto;
    }

    public int getSalto() {
        return salto;
    }

    public void setSalto(int salto) {
        this.salto = salto;
    }
    public String encriptar(String texto) {
	int[] arr = textoANumeros(texto); 
	arr = saltar(arr, this.salto); 
	return numeroATexto(arr); 
    }
    public String desencriptar(String texto) {
	int[] arr = textoANumeros(texto);
	arr = saltar(arr, this.salto *(-1));
	return numeroATexto(arr);
    }
    private int[] textoANumeros(String texto) {
	int[] arr = new int[texto.length()];
	for (int i = 0; i < texto.length(); i++) {
		char a = texto.charAt(i);
		for (int j = 0; j < alfabeto.length; j++) {
			if (a == alfabeto[j]) {
				arr[i] = j;
				break;
			}
		}
	}
	return arr;
    }
    private String numeroATexto(int[] arr) {
	String texto = "";
	for (int i = 0; i < arr.length; i++) {
		texto = texto + alfabeto[ arr[i] ];
	}
	return texto;
    }
    private int[] saltar(int[] arr, int s) {
	int[] ar = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		ar[i] = ((arr[i] + s) % alfabeto.length);
		while (ar[i] < 0) {
			ar[i] += alfabeto.length;
		}	
	}
	return ar;
    }
}
