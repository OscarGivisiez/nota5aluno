package entidade;

public class Alunofaculdade extends Aluno {

	public void calculoMedia() {
		this.setMedia((this.getNota1() + this.getNota2() + this.getNota3() + this.getNota4()) / 4);
	}
	public void setMedia(double media) {
		super.setMedia(media);
		if (media >= 8) {
			this.setAprovado(true);
		} else {
			this.setAprovado(false);}
	}
}
