package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
//		//Fluxo de entrada com arquivo
//		
//		FileInputStream fis = new FileInputStream("lorem.txt"); // Criando um floxo concreto com um arquivo, mas binário
//		InputStreamReader isr = new InputStreamReader(fis); // Trasnforma os bites e bytes(os dados binários so arquivo) em caracteres 
//		BufferedReader br = new BufferedReader(isr); // Guarda todos os caracteres de um linha em um buffer
//		
//		String linha = br.readLine(); // Faz a leitura de uma linha do arquivo
//		
//		System.out.println("=========================");
//		
//		while(linha != null) { // Faz a leitura de todas as linhas do arquivo
//			
//			System.out.println(linha);
//			linha = br.readLine();
//		}
//		
//		System.out.println(linha);
//		
//		br.close(); // Fecha o BufferedReader
		
		//Fluxo de entrada com arquivo de um jeito mais genérico (Utilizando as superclass)
		
		InputStream fis = new FileInputStream("lorem.txt"); // Criando um floxo concreto com um arquivo, mas binário
		Reader isr = new InputStreamReader(fis); // Trasnforma os bites e bytes(os dados binários so arquivo) em caracteres 
		BufferedReader br = new BufferedReader(isr); // Guarda todos os caracteres de um linha em um buffer
		
		String linha = br.readLine(); // Faz a leitura de uma linha do arquivo
		
		System.out.println("=========================");
		
		while(linha != null) { // Faz a leitura de todas as linhas do arquivo
			
			System.out.println(linha);
			linha = br.readLine();
		}
		
		System.out.println(linha);
		
		br.close(); // Fecha o BufferedReader
	}
}
