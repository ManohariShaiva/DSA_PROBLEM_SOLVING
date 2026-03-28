public class duplicate {
    public static int findduplicate(int[] transactions) {
        int result=0;
        for(int action:transactions) {
            result=result^action;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] transactions={500,200,500,300,200,100,300};
        System.out.println(findduplicate(transactions));
    }
    
}
