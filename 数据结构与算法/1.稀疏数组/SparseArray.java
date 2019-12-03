package com.wang.sparseArray;

/**
 * @ClassName:SparseArray
 * @description: TODO
 * @author: OrienWsL
 * @time: 2019-12-03 21:02
 * @Version:V1.0
 */
public class SparseArray {

    public static void main(String[] args) {
        int[][] array = new int[11][11];
        array[2][2] = 1;
        array[3][4] = 2;
        array[5][6] = 3;
        SparseArray sa = new SparseArray();
        sa.showArray(array);
        int[][] sparseArray = sa.arrayToSparse(array);

        int[][] arrayNew = sa.sparserToArray(sparseArray);

        sa.showArray(sparseArray);
        sa.showArray(arrayNew);
    }

    //二维数组据转换未稀疏数组
    public int[][] arrayToSparse(int[][] array){
        //获取行数
        int lenY = array.length;
        //获取列数
        int lenX = array[0].length;

        //1.获取二维数组中有效数据的个数
        int sum = 0;
        for(int i =0;i<lenY;i++){
            for (int j =0;j<lenX;j++){
                if(array[i][j]>0){
                    sum++;
                }
            }
        }

        //2. 根据sum值创建sparseArray
        int[][] sparseArray = new int[sum+1][3];

        sparseArray[0][0] = lenY;
        sparseArray[0][1] = lenX;
        sparseArray[0][2] = sum;

        //3.将二维数组中的有效值保存到稀疏数组中
        int count = 0;
        for(int i =0;i<lenY;i++){
            for (int j =0;j<lenX;j++){
                if(array[i][j]>0){
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = array[i][j];

                }
            }
        }



        return sparseArray;
    }

    //将稀疏数组转换为二维数组
    public int[][] sparserToArray(int[][] sparseArray){
        //根据稀疏数组第一行的信息创建二位数组
        int[][] array = new int[sparseArray[0][0]][sparseArray[0][1]];

        //将有效值保存到二位数组中
        int len = sparseArray[0][2];
        for(int i =1;i<=len;i++){
            array[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        return array;
    }

    //二维数组输出
    public void showArray(int[][] array){
        //获取行数
        int lenY = array.length;
        //获取列数
        int lenX = array[0].length;

        for(int i=0;i<lenY;i++){
            for(int j =0;j<lenX;j++){
                System.out.print(" "+array[i][j]);
                if(j==lenX-1){
                    System.out.println(" ");
                }
            }

        }
    }
}
