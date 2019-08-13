public class IntegerArray {

    public static void main(String[] args) {
        int[][] myIntDblArr=new int[3][3];
        int elemenntIn=1;
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++){
                myIntDblArr[i][j]=elemenntIn++;
            }
        }

        for(int[] rowArr:myIntDblArr){
            for(int rowElement:rowArr){
                System.out.println(rowElement);
            }
        }
    }
}

