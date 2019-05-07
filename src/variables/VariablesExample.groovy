package variables;

public class VariablesExample {

    public static void main(String[] args) {
        final String str = 'd';
        // #compilation error
        str = 'dsdasds'

        assert str == 'd'
    }

}
