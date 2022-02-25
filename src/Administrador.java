
public class Administrador extends Funcionario implements Autenticavel {

	
	public double getBonificacao() {

		return 50;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}

}
