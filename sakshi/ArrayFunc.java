import java.io.*;
class ArrayFunc{
	public static void main(String[] z) throws IOException{
	InputStreamReader a=new InputStreamReader(System.in);
	BufferedReader b=new BufferedReader(a);
	int a1[][]=new int[3][3];
	int a2[][]=new int[3][3];
	int a3[][]=new int[3][3];
	int a4[][]=new int[3][3];
	int r,c,i,j,s;
	int sum=0;
	boolean k=true;
	while(k){
		System.out.print("Menu\n1.Create first array\n2.Display first array\n3.Row wise sum\n4.Column wise sum\n5.Left Diagonal sum\n6.Right Diagonal sum\n7.Outer sum\n8.Inner sum\n9.Transpose\n10.Search Element\n11.Row sort\n12.Column sort\n13.Complete sort\n14.Mirror\n15.Create second array\n16.Display second array\n17.add first two array\n18.Display added array\n19.Multiplication of arrays\n20. display Multiplicated array\n21.EXIT\nENTER YOUR CHOICE ");
		j=Integer.parseInt(b.readLine());
		switch(j){
			case 1:
			 for(r=0;r<3;r++){
				for(c=0;c<3;c++){
					a1[r][c]=Integer.parseInt(b.readLine());
			    }
			}
		    break;
		    case 2:
			 for(r=0;r<3;r++){
				for(c=0;c<3;c++){
				System.out.print(a1[r][c]+" ");
				}
			 System.out.println();
			 }
			break;
			case 3:
			 
			 for(r=0;r<3;r++){
			 	for(c=0;c<3;c++){
			 		sum=sum+a1[r][c];
			 		System.out.print(a1[r][c]+" ");
			 	}
			 	System.out.print("="+sum);
			 	sum=0;
			 	System.out.println();
			 }
			 break;
			 case 4:
			 for(r=0;r<3;r++){
			 	for(c=0;c<3;c++){
			 		System.out.print(a1[r][c]+"  ");
			 	}
			 	System.out.println();
			 }
			 System.out.println("-----------");
			 for(c=0;c<3;c++){
			 	for(r=0;r<3;r++){
			 		sum=sum+a1[r][c];

			 	}
			 	System.out.print(sum+" ");
			 	sum=0;
			 	//System.out.println();

			 }
			 System.out.println();
			 break;
		   case 5:
		   sum=0;
		   for(r=0;r<3;r++){
		   	for(c=0;c<3;c++){
		   		System.out.print(a1[r][c]+"  ");
		   		if(r==c){
		   			sum=sum+a1[r][c];
		   		}
		   	}
		   	System.out.println();
		   }
		   System.out.print("        "+sum);
		   System.out.println();
		   break;
		   case 6:
		   sum=0;
		   for(r=0,c=2;r<3;r++,c--){
		   	sum=sum+a1[r][c];
		   }
		   for(r=0;r<3;r++){
				for(c=0;c<3;c++){
				System.out.print("   "+a1[r][c]+" ");
				}
			 System.out.println();
			 }
			 System.out.print(sum);
			 System.out.println();
			 break;
			 case 7:
			 sum=0;
			 for(r=0;r<3;r++){
			 	for(c=0;c<3;c++){
			 		if((r+c)%2==0){
			 			if(r==c&&r+c==2)
			 			continue;
			 			else	
			 				sum=sum+a1[r][c];
			 			}
			 	}
			 }
			 System.out.println("Outer sum is "+sum);
			 break;
			 case 8:
			 sum=0;
			 for(r=0;r<3;r++){
			 	for(c=0;c<3;c++){
			 		if((r+c)==1 || (r+c)==3)
			 			sum=sum+a1[r][c];
			 	}
			 }
			 System.out.println("Inner sum is "+sum);
			 break;
			 case 9:
			 for(r=0;r<3;r++){
			 	for(c=0;c<3;c++){
			 		a2[c][r]=a1[r][c];
			 	}
			 }
			 for(r=0;r<3;r++){
			 	for(c=0;c<3;c++){
			 		a1[r][c]=a2[r][c];
			 		System.out.print(a1[r][c]+" ");
			 	}
			 	System.out.println();
			 }
			 break;
			 case 10:
			 System.out.print("element need to be searched=");
			 int l;
			 l=Integer.parseInt(b.readLine());
			 for(r=0;r<3;r++){
			 	for(c=0;c<3;c++){
			 		if(l==a1[r][c])
			 			System.out.println("row no.= "+r+" Column no.= "+c);
			 	}
			 }
           break;
           
           case 11:
           int temp=0;
           for(r=0;r<3;r++){
           	for(c=0;c<2;c++){
           	 for(int m=1;m<3;m++){
           		if(a1[r][c]>a1[r][m])
           		{	temp=a1[r][c];
           				a1[r][c]=a1[r][m];
           				a1[r][m]=temp;
           		}

           	 }
           	}
           }
           for(r=0;r<3;r++){
           	for(c=0;c<3;c++){
           		System.out.print(a1[r][c]+" ");
           	}
           	System.out.println();
           }
           break;
           case 12:
            temp=0;
           for(c=0;c<3;c++){
           	for(r=0;r<2;r++){
           	 for(int m=1;m<3;m++){
           		if(a1[r][c]>a1[m][c])
           		{	temp=a1[r][c];
           				a1[r][c]=a1[m][c];
           				a1[m][c]=temp;
           		}

           	 }
           	}
           }
           for(r=0;r<3;r++){
           	for(c=0;c<3;c++){
           		System.out.print(a1[r][c]+" ");
           	}
           	System.out.println();
           }
           break;
           case 13:
           temp=0;
           for(r=0;r<3;r++){
           	for(c=0;c<3;c++){
           		for(i=0;i<3;i++){
           			for(j=0;j<3;j++){
           				if(a1[r][c]<a1[i][j]){
           					temp=a1[r][c];
           				a1[r][c]=a1[i][j];
           				a1[i][j]=temp;
           				}
           			}
           		}
           	}
           }

           for(r=0;r<3;r++){
           	for(c=0;c<3;c++){
           		System.out.print(a1[r][c]+" ");
           	}
           	System.out.println();
           }

           break;
           case 14:
           for(r=0;r<3;r++){
           	for(c=0;c<3;c++){
           		System.out.print(a1[r][c]+" ");
           	}
           	System.out.print("| ");
           	for(c=2;c>=0;c--){
           		System.out.print(a1[r][c]+" ");
           	}
           	System.out.println();
           }
           System.out.println("-------------");
           for(r=2;r>=0;r--){
           	for(c=0;c<3;c++){
           		System.out.print(a1[r][c]+" ");
           	}
           	System.out.print("| ");
           	for(c=2;c>=0;c--){
           		System.out.print(a1[r][c]+" ");		
           	}
           		System.out.println();
           }
           	
           
           break;
           case 15:
           for(r=0;r<3;r++){
				for(c=0;c<3;c++){
					a2[r][c]=Integer.parseInt(b.readLine());
			    }
			}
			 break;
			 case 16:
			 for(r=0;r<3;r++){
           	for(c=0;c<3;c++){
           		System.out.print(a2[r][c]+" ");
           	}
           	System.out.println();
           }

           break;
           case 17:
           for(r=0;r<3;r++){
           	for(c=0;c<3;c++){
           		a3[r][c]=a1[r][c]+a2[r][c];
           	}
           }
           break;
           case 18:
           for(r=0;r<3;r++){
           	for(c=0;c<3;c++){
           		System.out.print(a3[r][c]+" ");
           	}
           	System.out.println();
           }
           break;
           case 19:
           sum=0;
           for(r=0;r<3;r++){
           	for(c=0;c<3;c++){
           		a4[r][c]=0;
           		//sum=sum+a1[r][c]*a2[c][r];
             for(i=0;i<3;i++){
             	
             a4[r][c]+=a1[r][c]*a2[c][r];
             	
             }
             }
           }
           break;
           case 20:
            for(r=0;r<3;r++){
				for(c=0;c<3;c++){
				System.out.print(a4[r][c]+" ");
				}
			 System.out.println();
			 }
			 break;

		   case 21:
			k=false;
			break;
		}
			//k=false;
	}
	}
}