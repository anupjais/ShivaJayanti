class SagarPattern{
	public static void main(String[] args){
		for(int i=1; i<=10; i+=2){
			if(i%2==0)
				{
					continue;
				}
			for (int j=0; j<i/2+1; j++) {
				// if(i%2==0)
				// {
				// 	continue;
				// }
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=10; i>0; i-=2){
			for (int j=i/2; j>0; j--) {
				if(j%2==0)
				{
					continue;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}