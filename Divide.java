public class Divide{

    protected int numb1;
    protected int numb2;

    public Divide(int nb1, int nb2){

        numb1 = nb1;
        numb2 = nb2; 
    }

    public void calcul(){
        if(numb2 != 0){
            System.out.println(numb1 / numb2);
        }else{
            System.out.println("Impossible!");
        }
    }

    public static void main(String[] args){
        Divide op1 = new Divide(74, 0);
        op1.calcul();
        
    }
}