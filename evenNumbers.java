public class evenNumbers{
	public static void main(String[] args){

		int i = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);

		if(i>n){
			System.out.println("The first integer cannot be larger than the first.");
		}

		for(i=1; i<n; i++){
			if(i%2==0){
				System.out.println(i + " ");
			}
		}
	}
}