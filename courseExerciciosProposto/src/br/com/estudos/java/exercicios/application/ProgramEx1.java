package br.com.estudos.java.exercicios.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.com.estudos.java.exercicios.entities.CommentEx1;
import br.com.estudos.java.exercicios.entities.PostEx1;

public class ProgramEx1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//usa no Date format
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		
	
		CommentEx1 c1 = new CommentEx1("Parabéns");
		CommentEx1 c2 = new CommentEx1("Não foi o que eu esperava de vc");
		PostEx1 p1 = new PostEx1(
				sdf.parse("21/06/2018 13:50:10"), 
				"Traveling to new Zealand", 
				"I'm going to visit this wonderful country!", 
				 12);
		//chama o metodo adicionar comentario
		p1.addCommentEx1(c1);
		p1.addCommentEx1(c2);
		
		System.out.println(p1); 
		
		CommentEx1 c3 = new CommentEx1("Good night");
		CommentEx1 c4 = new CommentEx1("May the Force be with you");
		PostEx1 p2 = new PostEx1(
				sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		p2.addCommentEx1(c3);
		p2.addCommentEx1(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
