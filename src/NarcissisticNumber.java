public class NarcissisticNumber {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++)
        {
            int hundred=i/100;
            int ten=(i-hundred*100)/10;
            int single=i-hundred*100-ten*10;
            if(i==hundred*hundred*hundred+ten*ten*ten+single*single*single)
                System.out.println(i);
        }
    }
}
