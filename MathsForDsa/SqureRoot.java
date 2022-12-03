public class SqureRoot {
    public static void main(String[] args) {
//        System.out.println(Math.sqrt(36));
int n =40;
int p =3;
        System.out.printf("%.3f",sqrt(n,p));

    }
    static double sqrt(int n ,int p){
        double root = 0.0;
        int s = 0,e=n;
        while(s<=e){
            int m = s+(e-s)/2;
            if(s * s == n){
                return root;
            }
            if(s * s > n){
                e = m-1;
            }else {
                s=m+1;
            }
        }
        double inc=0.1;
        for (int i = 0; i < p; i++) {
            while(root * root <=n){
                root +=inc;
            }
            root-=inc;
            inc/=10;
        }
        return root;
    }
}
//time complexity:O(log(n)).