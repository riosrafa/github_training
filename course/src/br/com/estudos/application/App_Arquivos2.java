package br.com.estudos.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App_Arquivos2 {

	public static void main(String[] args) {

		String path = "C:\\Users\\Rafae\\Desktop\\WS_estudoBase\\passo_passo.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			// aqui criamos um objeto para leitura do arquivo
			fr = new FileReader(path);

			br = new BufferedReader(fr);

			// outra forma de fazer o processo acima
			// br = new BufferedReader(new FileReader(path));

			// Variavel para leitura da linha
			String line = br.readLine();
			// loop para ler todas as linhas no arquivo
			while (line != null) {
				System.out.println(line);
				// vai ficar lendo a proxima linha
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error:  " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();

				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
