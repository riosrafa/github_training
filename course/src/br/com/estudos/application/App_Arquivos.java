package br.com.estudos.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App_Arquivos {

	public static void main(String[] args) {

		//criamos um objeto para buscar(tratar) o arquivo no caminho
		File file = new File("C:\\Users\\Rafae\\Desktop\\WS_estudoBase\\passo_passo.txt");
		
		Scanner sc = null;
		
		// Todo arquivo que for aberto, precisa de tratamento
		try {
			sc = new Scanner(file);
			//aqui criamos um loop para percorrer todas as linhas do arquivo
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " +  e.getMessage());
		}
		finally {
			if(sc != null)
			sc.close();
		}
		file.getPath();

	}

}
