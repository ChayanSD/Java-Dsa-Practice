package Number_Convert;

public class DecimalToBinary {
    public static void main(String[] args) {
        int[] arr=new int[10];
         int desi=5,rem,quo,i;
         quo= desi;
         i=0;
        while(quo != 0){
            rem= quo%2;
        quo=quo/2;
        arr[i]= rem;
i++;
    }
        System.out.print(" ");
    for( int j=i-1;j>=0;j--){
        System.out.print(arr[j]);
    }

    }
}
