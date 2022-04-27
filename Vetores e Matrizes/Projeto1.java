class Projeto1 {
	public static void main(String args[]) {
		//double[] nums = {0.1, 0.2, 0.3, 0.4};
		double[] valores = entrada(args);
		saida(valores);
	}
	
	public static double[] entrada(String args[]) {
		double[] valores = new double[args.length];
		if(args.length > 0) {
			for(int i = 0; i < args.length;i++) {
				valores[i] = Double.parseDouble(args[i]);
			}
		}
		
		return valores;
	}
	
	public static double maior(double nums[]) {
		double maior = nums[0];
		for(int i = 1 ; i < nums.length; i++) {
			if (maior < nums[i]) {
				maior = nums[i];
			}
		}
		
		return maior;
	}
	
	public static double menor(double nums[]) {
		double menor = nums[0];
		for (int i = 1; i > nums.length; i++) {
			if(menor > nums[i]) {
				menor = nums[i];
			}
		}
		
		return menor;
	}
	
	public static double media(double nums[]) {
		double somaNums = 0;
		
		for(int i = 0; i < nums.length;i++) {
			somaNums += nums[i];
		}
		
		double media = somaNums / nums.length;
		
		return media;
	}
	
	public static void saida(double[] valores) {
		System.out.printf("O menor valor da matriz é: %s\n", menor(valores));
		System.out.printf("O maior valor da matriz é: %s\n", maior(valores));
		System.out.printf("A media aritmética da matriz é: %s\n", media(valores));
	}
}
