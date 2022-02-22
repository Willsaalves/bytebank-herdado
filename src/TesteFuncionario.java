
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario Will = new Funcionario();
		Will.setNome("Willian de sa");
		Will.setCpf("234556893-3");
		Will.setSalario(3583.00);
		
		Double salario_boni= Will.getSalario()+Will.getBonificacao();
		System.out.println(Will.getNome());
		System.out.println(Will.getBonificacao());
		System.out.println(salario_boni);
		System.out.println("\n");
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Roberto");
		g1.setCpf("4567786940-3");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		
		 boolean autenticou = g1.autentica(2222);
		 
		 System.out.println(autenticou);
	}

}
