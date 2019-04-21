package entidade;

import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		boolean dcs = true;

		Aluno aluno = new Aluno();
		Alunofaculdade faculdade = new Alunofaculdade();

		while (dcs == true) {

			String mm = JOptionPane.showInputDialog(" Digite 1 para ensino medio \n Digite 2 para ensino superior ");
			if (mm.equals("1")) {
				aluno.setNome(JOptionPane.showInputDialog(null, "Nome do aluno "));
				aluno.setEmail(JOptionPane.showInputDialog(null, "Email do aluno "));
				aluno.setSerie(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a serie? ")));
				aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog(null, "Primeira nota ")));
				aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog(null, "Segunda nota ")));
				aluno.setNota3(Double.parseDouble(JOptionPane.showInputDialog(null, "Terceira nota ")));
				aluno.setNota4(Double.parseDouble(JOptionPane.showInputDialog(null, "Quarta nota ")));
				aluno.calculoMedia();
				if (aluno.isAprovado() == true) {

					JOptionPane.showMessageDialog(null,
							" Aluno " + aluno.getNome() 
							+ "\n Serie do aluno "+ aluno.getSerie()  
							+ "\n Primeira nota  "+ aluno.getNota1() 
							+ "\n Segunda nota " + aluno.getNota2()
							+ "\n Terceira nota "+ aluno.getNota3()
						+ "\n Quarta nota " + aluno.getNota4()
						+ "\n Media da nota " + aluno.getMedia()
						+ "\n Email " + aluno.getEmail() 
							+ "\n Parabens vc passo :)");

				} else if (aluno.isAprovado() == false) {
					JOptionPane.showMessageDialog(null,
							" Aluno " + aluno.getNome()			 
							+ "\n Serie do aluno "+ aluno.getSerie()					 
									 + "\n Primeira nota  "+ aluno.getNota1()
									 + "\n Segunda nota " + aluno.getNota2() 
									 + "\n Terceira nota "+ aluno.getNota3()
									 + "\n Quarta nota " + aluno.getNota4() 
									 + "\n Media da nota " + aluno.getMedia() 
									 + "\n Email " + aluno.getEmail()									 + "\n Vc repetiu :(");
				}
			}
			if (mm.equals("2")) {
				faculdade.setNome(JOptionPane.showInputDialog(null, "Nome do aluno "));
				faculdade.setEmail(JOptionPane.showInputDialog(null, "Email do aluno "));
				faculdade.setSerie(Integer.parseInt(JOptionPane.showInputDialog(null, "Qual periodo? ")));
				faculdade.setNota1(Double.parseDouble(JOptionPane.showInputDialog(null, "Primeira nota ")));
				faculdade.setNota2(Double.parseDouble(JOptionPane.showInputDialog(null, "Segunda nota ")));
				faculdade.setNota3(Double.parseDouble(JOptionPane.showInputDialog(null, "Terceira nota ")));
				faculdade.setNota4(Double.parseDouble(JOptionPane.showInputDialog(null, "Quarta nota ")));
				faculdade.calculoMedia();
				if (faculdade.isAprovado() == true) {
					JOptionPane.showMessageDialog(null,
							" Aluno " + faculdade.getNome() 
							+ "\n Serie do aluno " + faculdade.getSerie()
									+ "\n Primeira nota " + faculdade.getNota1() 
									+ "\n Segunda nota "+ faculdade.getNota2() 
									+ "\n Terceira nota " + faculdade.getNota3()
									+ "\n Quarta nota " + faculdade.getNota4()
									+ "\n Media " + faculdade.getMedia() 
									+ "\n Email " + faculdade.getEmail() 
									+ "\n Aprovado :)");
				} else if (faculdade.isAprovado() == false) {
					JOptionPane.showMessageDialog(null,
							" Aluno " + faculdade.getNome()
							+ "\n Serie "+ faculdade.getSerie() 
									+ "\n Primeira nota "+ faculdade.getNota1()
									+ "\n Segunda prova " + faculdade.getNota2()
									+ "\n Terceira nota " + faculdade.getNota3()
									+ "\n Quarta nota "+ faculdade.getNota4()
									+ "\n Media "+ faculdade.getMedia() 
									+ "\n Email " + faculdade.getEmail() 
									+ "\n Nao passou :(");
				}
			}
			int aux = JOptionPane.showConfirmDialog(null, "Quer repetir?", "REPETIR?", JOptionPane.YES_NO_OPTION);
			if (aux == JOptionPane.YES_OPTION) {
				dcs = true;
			} else if (aux == JOptionPane.NO_OPTION) {
				dcs = false;
			}
		}
		sc.close();
	}
}
