package br.com.rar.treinamento.linguagem;

public class TiposPrimitivos {
	
	private short idade; //a menor variavel numerica do java
	private int matricula;
	private long rg;
	private char sexo;
	private boolean ativo;
	private double salario;
	private byte sinal;
	
	
	public TiposPrimitivos() {
		System.out.println("idade: "+idade);
		System.out.println("matricula: "+matricula);
		System.out.println("rg: "+rg);
		System.out.println("sexo: "+sexo);
		System.out.println("ativo: "+ativo);
		System.out.println("salario: "+salario);
		System.out.println("sinal: "+sinal);
		

	}
	
	public void inicializandoValores() {
		this.idade = 21;
		this.matricula = 22001;
		this.rg = 557489877;
		this.sexo = 'M';
		this.ativo = true;
		this.salario = 1280.1;
		this.sinal = 1;
	}

	public short getIdade() {
		return idade;
	}

	public void setIdade(short idade) {
		this.idade = idade;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public byte getSinal() {
		return sinal;
	}

	public void setSinal(byte sinal) {
		this.sinal = sinal;
	}

	@Override
	public String toString() {
		return "TiposPrimitivos [idade=" + idade + ", matricula=" + matricula + ", rg=" + rg + ", sexo=" + sexo
				+ ", ativo=" + ativo + ", salario=" + salario + ", sinal=" + sinal + "]";
	}
}
