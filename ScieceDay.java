// import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

class ScieceDay{
	public static void main(String [] args)
	{
		File file = new File("/Users/anupjaiswal/Downloads/scienceDay.png");
//		File file = new File("/Users/anupjaiswal/Downloads/shivaji-maharaj-png-10.png");
//		File file = new File("/Users/anupjaiswal/Downloads/Maharaj2.jpeg");
//		File file = new File("/Users/anupjaiswal/Downloads/Maharaj3.png");
//		File file = new File("/Users/anupjaiswal/Downloads/Maharaj4.png");
		try{
			BufferedImage image = ImageIO.read(file);
			for(int i=0; i<image.getHeight(); i++)
			{
//				System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\033[5;91m");
				// System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
				for(int j=0; j<image.getWidth(); j++)
				{
					Color clr = new Color(image.getRGB(j,i));
					if((clr.getRed()==0) && (clr.getGreen()==0) && (clr.getBlue() == 0)){
//						if(j==(image.getWidth())-1){
//							System.out.print("\033[5;101m* \033[0m");
//						}
						System.out.println("*");
						// System.out.print("\033[105;5;1m*  \033[0m");
						// System.out.print("*   ");
					}else{
						System.out.print("  ");
						// System.out.print("\033[47m   \033[0m");
						// System.out.print("\033[105m   \033[0m");
					}
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.println("Exception Occured");
		}
	}
}