package ExeParquimetro;

public class Parquimetro {
	
	// Permite inserir moedas no parquimetro (soma no saldo)
	// Valores poss�veis: 1, 5, 10, 25, 50 e 100 (1 real)
	// Gera InvalidValueException no caso de valor inv�lido
	private int saldo;
	
	public Parquimetro(){
		saldo = 0;
	}
	
	public void insereMoeda(int valor) throws Exception{
		switch (valor){
			case 1:
				saldo += valor;
			case 5:
				saldo += valor;
			case 10:
				saldo += valor;
			case 25:
				saldo += valor;
			case 50:
				saldo += valor;
			case 100:
				saldo += valor;
				break;
				
			default:
				throw new Exception("Valor inv�lido");
			
		}
	}
	
	// Retorna o saldo acumulado no parquimetro
	public double getSaldo(){ 
		return(saldo);
	}
	
	// Emite um ticket de 2 reais se houver saldo dispon�vel.
	// Retorna true se a opera��o foi poss�vel
	public boolean emiteTicket(){ 
		if( getSaldo() < 2){
			return false;
		}
		else{
			saldo -= 2;
			return true;
		}
	}
	
	// Devolve o saldo existente. Retorna o valor devolvido
	public int devolve(){ 
		int devolveSaldo = saldo;
		saldo = 0;
		return devolveSaldo;
		
	}


}
