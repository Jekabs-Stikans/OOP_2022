package javasem01;

import java.util.Arrays;
import java.util.Random;

/**
 * 1. semin�ra uzdevumi JAVA kurs�
 * @author J�kabs Stik�ns
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
	 * 1. semin�ra 0. uzdevums
	 * @author J�kabs Stik�ns
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
	 * 1. semin�ra 1. uzdevums
	 * @author J�kabs Stik�ns
	 * 
	 */
	public static void Excersise1()
	{
		double g = -9.81; // Earth's gravity in m/s^2
		double v_init = 10.0;
		double t_fall = 30.0;
		double pos_init = 100.0;
		
		System.out.printf("Objekta poz�cija p�c %.2f sekund�m: %.2f\n", t_fall, PositionCalc(g, v_init, pos_init, t_fall));
	}
	
	/**
	 * 1. semin�ra 2. uzdevums
	 * @author J�kabs Stik�ns
	 * 
	 */
	public static void Excersise2()
	{
		int N = 6;
		System.out.printf("Faktori�lis no %d (for cikls) = %d\n", 6, factorialForLoop(N));
		System.out.printf("Faktori�lis no %d (rekursija) = %d\n", 6, factorialRecursive(N));
	}
	
	/**
	 * 1. semin�ra 3. uzdevums
	 * @author J�kabs Stik�ns
	 * 
	 */
	public static void Excersise3()
	{
		double[] array = generateArray(10, 1.1, 5);
		System.out.printf("Mas�va saturs: %S\n", Arrays.toString(array));
		System.out.printf("Mas�va vid�j� v�rt�ba: %f\n", getMean(array));
		System.out.printf("Mas�va maz�k� v�rt�ba: %f\n", getMin(array));
		System.out.printf("Mas�va liel�k� v�rt�ba: %f\n", getMax(array));
		System.out.printf("Sak�rtots mas�vs: %S\n", Arrays.toString(arraySort(array)));
	}
	
	/**
	 * 1. semin�ra 4. uzdevums
	 * @author J�kabs Stik�ns
	 * 
	 */
	public static void Excersise4()
	{
	}
	
	/**
	 * 1. semin�ra 5. uzdevums
	 * @author J�kabs Stik�ns
	 * 
	 */
	public static void Excersise5()
	{
	}
	
	/**
	 * 1. semin�ra 6. uzdevums
	 * @author J�kabs Stik�ns
	 * 
	 */
	public static void Excersise6()
	{
	}
	
	/**
	 * 1. semin�ra 7. uzdevums
	 * @author J�kabs Stik�ns
	 * 
	 */
	public static void Excersise7()
	{
	}
	
	/**
	 * 1. semin�ra 8. uzdevums
	 * @author J�kabs Stik�ns
	 * 
	 */
	public static void Excersise8()
	{
	}
	
	/**
	 * 1. semin�ra 9. uzdevums
	 * @author J�kabs Stik�ns
	 * 
	 */
	public static void Excersise9()
	{
	}
	
	
	
	/**
	 * Apr��ina objekta poz�ciju atkar�b� no ieejas parametriem
	 * @author J�kabs Stik�ns
	 * @param a - objekta pa�trin�jums
	 * @param v0 - objekta s�kotn�jais �trums
	 * @param x0 - objekta s�kotn�j� poz�cija
	 * @param t - cik ilgi objekts p�rvietojas
	 * @return objekta apr��in�t� poz�cija
	 */
	public static double PositionCalc(double a, double v0, double x0, double t)
	{
		return 0.5*a*Math.pow(t, 2) + v0*t + x0;
	}

	/**
	 * Apr��ina faktori�li izmantojot for ciklu
	 * @author J�kabs Stik�ns
	 * @param N - natur�ls skaitlis, ja padod negat�vu, rezult�ts ir 0
	 * @return N faktori�lis
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
	 * Apr��ina faktori�li izmantojot rekurs�vo pieeju
	 * @author J�kabs Stik�ns
	 * @param N - natur�ls skaitlis, ja padod negat�vu, rezult�ts ir 0
	 * @return N faktori�lis
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
	 * Izveido double tipa mas�vu, un aizpilda to ar nejau��m v�rt�b�m no nor�d�t� interv�la
	 * Ja interv�ls ir neder�gs (lower > upper), atgrie� tuk�u mas�vu
	 * @author J�kabs Stik�ns
	 * @param N - elementu skaits mas�v�
	 * @param lower - interv�la apak��j� robe�a
	 * @param upper - interv�la aug��j� robe�a
	 * @return Izveidotais mas�vs
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
	 * Atgrie� padot� mas�va elementu vid�jo v�rt�bu
	 * @author J�kabs Stik�ns
	 * @param array - double tipa mas�vs
	 * @return mas�va vid�j� v�rt�ba
	 */
	public static double getMean(double[] array)
	{
		double avrg = 0;
		for(int i = 0; i < array.length; i++)
			avrg += array[i];
		return avrg/array.length;
	}

	/**
	 * Atgrie� padot� mas�va maz�k� elementa v�rt�bu
	 * @author J�kabs Stik�ns
	 * @param array - double tipa mas�vs
	 * @return mas�va maz�k� v�rt�ba
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
	 * Atgrie� padot� mas�va liel�k� elementa v�rt�bu
	 * @author J�kabs Stik�ns
	 * @param array - double tipa mas�vs
	 * @return mas�va liel�k� v�rt�ba
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
	 * Atgrie� padoto mas�vu sak�rtotu augo�� sec�b� izmmantojot BubbleSort pieeju
	 * @author J�kabs Stik�ns
	 * @param array - double tipa mas�vs
	 * @return sak�rtots mas�vs
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
