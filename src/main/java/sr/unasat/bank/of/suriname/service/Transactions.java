package sr.unasat.bank.of.suriname.service;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Transactions {
    private int number;

    public int subtract(int a, int b)
    {
       int result = a - b;
       return result;
    }
}
