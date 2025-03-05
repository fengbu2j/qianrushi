package classic150.数组;

public class canCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int cha=0;
        int start=0;
        for(int i = 0; i <gas.length; i++)
        {
            total += gas[i] - cost[i];
            cha+=gas[i]-cost[i];
            if(cha<0)
            {
                start=(i+1)%gas.length;
                cha=0;
            }
        }
        if(total<0)
        {
            return -1;
        }
        return  start;
    }

    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        canCompleteCircuit c = new canCompleteCircuit();
        System.out.println(c.canCompleteCircuit(gas, cost));
    }
}
