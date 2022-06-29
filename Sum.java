public class Sum{

    protected int numb1;
    protected int numb2;

    public Sum(int nb1, int nb2){

        numb1 = nb1;
        numb2 = nb2; 
    }

    public static void main(String[] args){
        Sum sum1 = new Sum(74, 36);
        System.out.println(sum1.numb1 + sum1.numb2);
    }
}