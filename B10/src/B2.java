import java.util.LinkedList;
import java.util.Queue;

public class B2 {
    class Solution {
        class Pair{
            int value;
            int index;
            Pair(int value, int index){
                this.value = value;
                this.index= index;
            }
        }
        public int timeRequiredToBuy(int[] tickets, int k) {
            Queue<Pair> queue = new LinkedList<>();
            for(int i=0;i<tickets.length;i++){
                if(tickets[i]==0){

                } else {
                    queue.add(new Pair(tickets[i],i));
                }
            }
            int answer=0;
            while(!(queue.peek().index ==k &&queue.peek().value ==1)){
                Pair temp = queue.remove();
                if(temp.value == 0){

                } else if(temp.value==1){
                    temp.value--;
                    answer++;

                }
                else {
                    temp.value--;
                    answer++;
                    queue.add(temp);
                }
            }
            return answer+1;


        }
    }



}
