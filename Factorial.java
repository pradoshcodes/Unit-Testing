public class Factorial {
    public int fac(int num){
        if (num==0) {
            return 1;
        } else {
            return(num*fac(num-1));
        }
    }
}
