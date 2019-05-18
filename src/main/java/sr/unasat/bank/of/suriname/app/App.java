package sr.unasat.bank.of.suriname.app;

import sr.unasat.bank.of.suriname.dao.User;
import sr.unasat.bank.of.suriname.service.Transactions;

public class App {
    public static void main(String[] args) {
        Transactions tr = Transactions.builder().number(3).build();
        tr.setNumber(3);

    }
}
