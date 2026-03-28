public class MinNumberOfNotes {
    public static void main(String[] args) {
        int amount = 348;
        int[] notes = {100,50,20,10,5,2,1};

        int count = 0;

        for(int note:notes){
            if(amount>=note){
                int num = amount /note;
                count += num;
                amount = amount % note;
                System.out.println(note + "->" +num);
            }
        }
        System.out.println("minimun number of notes are ="+count);
    }
    }