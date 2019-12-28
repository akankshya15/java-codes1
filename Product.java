package akankshya;

public class Product {

	public static void main(String[] args) {
		int x[][]={{1,1,1},{2,2,2},{3,3,3}};
		int y[][]={{1,1,1},{2,2,2},{3,3,3}};
		int product[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				product[i][j]=0;
				for(int k=0;k<3;k++)
					product[i][j] +=x[i][k]*y[k][j];
				System.out.print(product[i][j]+" ");
			}
		
			System.out.println();
		}
	}

}
