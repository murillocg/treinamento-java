package srp;

import static srp.Cargo.DESENVOLVEDOR;
import static srp.Cargo.DBA;
import static srp.Cargo.TESTER;;

public class CalculadoraDeSalario {
	public double calcula(Funcionario funcionario){
		if (DESENVOLVEDOR.equals(funcionario.getCargo())){
			return new DezOuVintePorCento().calcula(funcionario);
		}
		if (DBA.equals(funcionario.getCargo()) || TESTER.equals(funcionario.getCargo())){
			return new QuinzeOuVinteCincoPorCento().calcula(funcionario);
		}
		throw new RuntimeException("Funcionário inválido!");
	}

}
