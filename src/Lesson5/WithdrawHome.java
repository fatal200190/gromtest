package Lesson5;

import java.util.Arrays;

/**
 * Created by Alex on 20.07.2017.
 */
public class WithdrawHome {
    public static void main(String[] args) {
        String[] names = {"Vol", "Bob", "Will", "Kate", "Mac"};
        int[] balances = {-30, 600, 4500, 199, 1000, 20, 0};
        withdraw(names, balances, "Will",4600);
        System.out.println(Arrays.toString(balances));
    }
    static int withdraw(String[] clients, int[] balances, String client, int amount) {
                if ((balances[findClientIndexByName(clients, client)] < amount))
                    return -1;
               balances[findClientIndexByName(clients, client)] -= amount;
               return balances[findClientIndexByName(clients, client)];
    }

    static int findClientIndexByName(String[] clients, String client) {
        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }
}
