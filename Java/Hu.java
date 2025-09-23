import java.util.*;
public class Hu{
    public static void main(String[]args){
        int[][]a={{1,2},{3,4}};
        int[][]b={{7,8},{5,7}};
        int[][]sum=new int[2][2];

        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        


        }
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.println( sum[i][j] + " ");
            }
        }


    }
}