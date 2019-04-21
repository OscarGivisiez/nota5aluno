package entidade;

public class Aluno extends Pessoa {

	
	private int serie;
	
	private boolean aprovado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double media;

	
	public int getSerie() {
		return serie;
		
	}

	public void setSerie(int serie) {

		if ((serie >= 1) && (serie <= 8)) {
			this.serie = serie;
		} else {
			this.serie = 0;
			
		}

		
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {

		if ((nota1 >= 1) && (nota1 <= 10)) {
			this.nota1 = nota1;
		} else {
			this.nota1 = 0;
		}

	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {

		if ((nota2 >= 1) && (nota2 <= 10)) {
			this.nota2 = nota2;
		} else {
			this.nota2 = 0;
		}
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {

		if ((nota3 >= 1) && (nota3 <= 10)) {
			this.nota3 = nota3;
		} else {
			this.nota3 = 0;
		}
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {

		if ((nota4 >= 1) && (nota4 <= 10)) {
			this.nota4 = nota4;
		} else {
			this.nota4 = 0;
		}
	}

	public double getMedia() {
		return media;
	}

	public void calculoMedia() {

		this.setMedia((nota1 + nota2 + nota3 + nota4) / 4);

	}

	public void setMedia(double media) {

		this.media = media;

		if (media >= 7) {
			this.aprovado = true;

		} else {
			this.aprovado = false;
		}

	}

}
