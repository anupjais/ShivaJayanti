//class ColorMatrix{
//	public static void main(String[] args){
//		int i,j;
//		for(i=0; i<11; i++){
//			for(j=0; j<11; j++){
//				int k = i*10+j;
//				System.out.print("\033[%dm\t",k+""+k);
//			}
//		}
//	}
//}

class ColorMatrix{
    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                int k = (i*10+j);
                if ((k>10 && k<30) || (k>50 && k<90)) {
                    continue;
                }
                System.out.print("\u001b[" + k + "m" + k + "\t\033[0m");
            }
            System.out.println();
        }
    }
}
