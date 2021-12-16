public class DeclaracaoVariaveis {
	
	public static void main (String[] args) {
		String nome, rg, dataDeNascimento, sexo;
		double salario;
		
		nome = "Joseverson da Silva";
		rg = "12.345.678-9";
		dataDeNascimento = "01/02/1950";
		sexo = "M";
		salario = 2734.25;
		
		// Utilizando println	
		System.out.println("O senhor " +nome+ 
		" portador do rg " +rg+ 
		", nascido em " +dataDeNascimento+ 
		", do sexo " +sexo+ ", tem o salário de R$" +salario);
		
		// Utilizando print	
		System.out.print("O senhor " +nome+ 
		" portador do rg " +rg+ 
		", nascido em " +dataDeNascimento+ 
		", do sexo " +sexo+ ", tem o salário de R$" +salario+ "\n");
		
		// Utilizando prinf	
		System.out.print("O senhor " +nome+ 
		" portador do rg " +rg+ 
		", nascido em " +dataDeNascimento+ 
		", do sexo " +sexo+ ", tem o salário de R$" +salario+ "\n");
		
		// usar "" no texto precisa do \
		// usar paragrafo no texto precisa do \t
		// usar \ no texto precisa do \\
		// pular linha no texto precisa do \n
	}
}

