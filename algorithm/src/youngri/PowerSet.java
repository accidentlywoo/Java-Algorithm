package youngri;

public class PowerSet {
    String sudo =
            "powerSet(P,S)" +
            "if S is an empty set " +
                "print P;" +
            "else" +
                "let t be the first element of S;" +
                "powerSet(P, S-{t});" +
                "powerSet(Pu{t}, S-{t});";
}
