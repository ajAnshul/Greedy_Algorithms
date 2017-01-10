/*
Our friend Monk has decided to go on a diet in order to improve his Eating Habits. One of his friends told him that Monk should eat a fixed amount of Vitamins, Carbs, Fats and Proteins daily in order to loose weight. Monk wants to strictly follow this regime.

There are 
N
N fruits kept in Monk's Fridge. Each fruit contains a fixed amount of Vitamins, Carbs, Fats and Proteins. Now, Monk wants to know if upon selecting any subset of fruits from the fridge, the sum of their Vitamins, Carbs, Fats and Proteins is individually equal to their corresponding equivalent amount that Monk desires to eat. For example, if Monk selects Fruits 
i
i, 
j
j and 
k
k, then the sum of the vitamins of these 
3
3 fruits should be equal to the amount of vitamins Monk wants to eat and so on for Carbs, Fats and Protiens as well.

If there exists such a subset to satisfy Monk's demands, print "YES"(without quotes), else print "NO"(without quotes).

Input Format:

The First line contains 
4
4 space separated integers denoting the amount of Vitamins, Carbs, Fats and Protiens that Monk desires to eat. The next line contains a single integer 
N
N denoting the number of Fruits in Monk's Fridge. Each of the next 
N
N lines contains 
4
4 space separated integers, where the 
i
t
h
ith line denotes the number of VItamins, Carbs, Fats and Proteins in the
i
t
h
ith fruit.

Output Format:

Print the required answer on a single line


 */
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EarOrNot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] desire = new int[4];
		String inp = br.readLine();
		String[] comp = inp.split(" ");
		for(int i=0;i<4;i++){
			desire[i] = Integer.parseInt(comp[i]);
		}
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			inp = br.readLine();
			comp = inp.split(" ");
			ArrayList<Integer> temp = new ArrayList<>();
			for(int j=0;j<4;j++){
				temp.add(Integer.parseInt(comp[j]));
			}
			a.add(temp);
		}
		int flag = 0;
		for(int i=0;i<4;i++){
			int sum = 0;
			for(int j=0;j<n;j++){
				sum = sum + a.get(j).get(i);
				if(desire[i] == sum)
					break;
				if(desire[i] < sum)
					break;
			}
			if(desire[i] != sum){
				flag = 1;
				break;
			}
				
		}
		if(flag == 1)
			System.out.println("NO");
		else
			System.out.println("YES");

	}

}
