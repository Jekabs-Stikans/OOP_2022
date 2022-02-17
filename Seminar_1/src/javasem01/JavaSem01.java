package javasem01;

import java.util.Arrays;
import java.util.Random;

/**
 * 1. seminâra uzdevumi JAVA kursâ
 * @author Jçkabs Stikâns
 * 
 */
public class JavaSem01
{

	public static void main(String[] args) 
	{
//		Excersise0();
//		Excersise1();
//		Excersise2();
//		Excersise3();
		Excersise4();
//		Excersise5();
//		Excersise6();
//		Excersise7();
//		Excersise8();
//		Excersise9();
	}
	
	
	
	/**
	 * 1. seminâra 0. uzdevums
	 * @author Jçkabs Stikâns
	 * 
	 */
	public static void Excersise0()
	{
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", 
				"Daniel", "Neda", "Aaron", "Kate" };
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
		
		
		for(int i = 0; i < Math.min(names.length, times.length); i++)
			System.out.printf("[%S, <%d>]\n", names[i], times[i]);
	}
	
	/**
	 * 1. seminâra 1. uzdevums
	 * @author Jçkabs Stikâns
	 * 
	 */
	public static void Excersise1()
	{
		double g = -9.81; // Earth's gravity in m/s^2
		double v_init = 10.0;
		double t_fall = 30.0;
		double pos_init = 100.0;
		
		System.out.printf("Objekta pozîcija pçc %.2f sekundçm: %.2f\n", t_fall, PositionCalc(g, v_init, pos_init, t_fall));
	}
	
	/**
	 * 1. seminâra 2. uzdevums
	 * @author Jçkabs Stikâns
	 * 
	 */
	public static void Excersise2()
	{
		int N = 6;
		System.out.printf("Faktoriâlis no %d (for cikls) = %d\n", 6, factorialForLoop(N));
		System.out.printf("Faktoriâlis no %d (rekursija) = %d\n", 6, factorialRecursive(N));
	}
	
	/**
	 * 1. seminâra 3. uzdevums
	 * @author Jçkabs Stikâns
	 * 
	 */
	public static void Excersise3()
	{
		double[] array = generateArray(10, 1.1, 5);
		System.out.printf("Masîva saturs: %S\n", Arrays.toString(array));
		System.out.printf("Masîva vidçjâ vçrtîba: %f\n", getMean(array));
		System.out.printf("Masîva mazâkâ vçrtîba: %f\n", getMin(array));
		System.out.printf("Masîva lielâkâ vçrtîba: %f\n", getMax(array));
		System.out.printf("Sakârtots masîvs: %S\n", Arrays.toString(arraySort(array)));
	}
	
	/**
	 * 1. seminâra 4. uzdevums
	 * @author Jçkabs Stikâns
	 * 
	 */
	public static void Excersise4()
	{
	}
	
	/**
	 * 1. seminâra 5. uzdevums
	 * @author Jçkabs Stikâns
	 * 
	 */
	public static void Excersise5()
	{
	}
	
	/**
	 * 1. seminâra 6. uzdevums
	 * @author Jçkabs Stikâns
	 * 
	 */
	public static void Excersise6()
	{
	}
	
	/**
	 * 1. seminâra 7. uzdevums
	 * @author Jçkabs Stikâns
	 * 
	 */
	public static void Excersise7()
	{
	}
	
	/**
	 * 1. seminâra 8. uzdevums
	 * @author Jçkabs Stikâns
	 * 
	 */
	public static void Excersise8()
	{
	}
	
	/**
	 * 1. seminâra 9. uzdevums
	 * @author Jçkabs Stikâns
	 * 
	 */
	public static void Excersise9()
	{
	}
	
	
	
	/**
	 * Aprçíina objekta pozîciju atkarîbâ no ieejas parametriem
	 * @author Jçkabs Stikâns
	 * @param a - objekta paâtrinâjums
	 * @param v0 - objekta sâkotnçjais âtrums
	 * @param x0 - objekta sâkotnçjâ pozîcija
	 * @param t - cik ilgi objekts pârvietojas
	 * @return objekta aprçíinâtâ pozîcija
	 */
	public static double PositionCalc(double a, double v0, double x0, double t)
	{
		return 0.5*a*Math.pow(t, 2) + v0*t + x0;
	}

	/**
	 * Aprçíina faktoriâli izmantojot for ciklu
	 * @author Jçkabs Stikâns
	 * @param N - naturâls skaitlis, ja padod negatîvu, rezultâts ir 0
	 * @return N faktoriâlis
	 */
	public static int factorialForLoop(int N)
	{
		if(N < 0)
			return 0;
		
		int result = 1;
		for(int i = 1; i <= N; i++)
			result *= i;
		
		return result;
	}
	
	/**
	 * Aprçíina faktoriâli izmantojot rekursîvo pieeju
	 * @author Jçkabs Stikâns
	 * @param N - naturâls skaitlis, ja padod negatîvu, rezultâts ir 0
	 * @return N faktoriâlis
	 */
	public static int factorialRecursive(int N)
	{
		int result = 1;
		
		if(N < 0)
			return 0;
		
		if(N == 1)
			return result;
		
		result = N * factorialRecursive(N-1);
		return result;
	}

	/**
	 * Izveido double tipa masîvu, un aizpilda to ar nejauðâm vçrtîbâm no norâdîtâ intervâla
	 * Ja intervâls ir nederîgs (lower > upper), atgrieþ tukðu masîvu
	 * @author Jçkabs Stikâns
	 * @param N - elementu skaits masîvâ
	 * @param lower - intervâla apakðçjâ robeþa
	 * @param upper - intervâla augðçjâ robeþa
	 * @return Izveidotais masîvs
	 */
	public static double[] generateArray(int N, double lower, double upper)
	{
		Random rand = new Random();
		double[] array = new double[N];
		
		if(upper >= lower)
			for(int i = 0; i < N; i++)
				array[i] = rand.nextDouble(lower, upper);
		
		return array;
	}

	/**
	 * Atgrieþ padotâ masîva elementu vidçjo vçrtîbu
	 * @author Jçkabs Stikâns
	 * @param array - double tipa masîvs
	 * @return masîva vidçjâ vçrtîba
	 */
	public static double getMean(double[] array)
	{
		double avrg = 0;
		for(int i = 0; i < array.length; i++)
			avrg += array[i];
		return avrg/array.length;
	}

	/**
	 * Atgrieþ padotâ masîva mazâkâ elementa vçrtîbu
	 * @author Jçkabs Stikâns
	 * @param array - double tipa masîvs
	 * @return masîva mazâkâ vçrtîba
	 */
	public static double getMin(double[] array)
	{
		double min = array[0];
		for(int i = 1; i < array.length; i++)
			if(array[i] < min)
				min = array[i];
		return min;
	}

	/**
	 * Atgrieþ padotâ masîva lielâkâ elementa vçrtîbu
	 * @author Jçkabs Stikâns
	 * @param array - double tipa masîvs
	 * @return masîva lielâkâ vçrtîba
	 */
	public static double getMax(double[] array)
	{
		double max = array[0];
		for(int i = 1; i < array.length; i++)
			if(array[i] > max)
				max = array[i];
		return max;
	}

	/**
	 * Atgrieþ padoto masîvu sakârtotu augoðâ secîbâ izmmantojot BubbleSort pieeju
	 * @author Jçkabs Stikâns
	 * @param array - double tipa masîvs
	 * @return sakârtots masîvs
	 */
	public static double[] arraySort(double[] array)
	{
		double temp;
		for(int j = 1; j < array.length; j++)
			for(int i = j; i < array.length; i++)
				if(array[i-1] > array[i])
				{
					temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
				}
		return array;
	}
	


}
