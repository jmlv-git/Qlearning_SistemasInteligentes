import java.util.Random;
public class ATV2 {

	public static int escolhe_action() {// nao sei se vai usar isso ou a seq dada pelo prof
		Random gerador= new Random();
		return gerador.nextInt(3);
	}
	
	// FUNCTION calc_action_result NAO COMPREENDIDA 
	
	public static double Q_update(int state,int action,int nextState,
			int[] rw, double[][]Q, double alpha, double gama) {
		
		double auxMax=Q[nextState][0];
		for (int i = 1; i < Q[nextState].length; i++) {
			auxMax= Math.max(auxMax, Q[nextState][i]);
		}
		
		double QEstimado=rw[state] + gama*(auxMax);
		
		double valorQ = Q[state][action] + alpha*(QEstimado-Q[state][action]);
		
		return valorQ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double alpha = 0.5;
		double gamma = 0.8;
		
		double[][] Q=new double[6][4];// por padrão -> tudo = 0
		//linhas para estados
		//colunas para a qualidade das acoes [0]=UP,[1]=DOWN,[2]=LEFT,[3]=RIGHT 
		Q[5][0]=10;
		Q[5][1]=10;
		Q[5][2]=10;
		Q[5][3]=10;
		
		double[] rw= new double[6];//matriz de recompensas
		for (int i = 0; i < rw.length; i++) {
			rw[i]=-1;
		}
		rw[5]=10; //Lembrar de fazer verificação de bater na parede ter recompensa de -10
		
		int[] estado_inicial = new int[2];
		
		
		
		
	}

}
