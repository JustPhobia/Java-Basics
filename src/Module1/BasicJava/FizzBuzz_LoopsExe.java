package Module1.BasicJava;

public class FizzBuzz_LoopsExe {
    public static void main(String[] args) {

        boolean _Div3=false,_Div5=false;

        for (int i=0; i<=100; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                _Div3 = true;
            }
            if (i % 5 == 0) {
                _Div5 = true;
            }

            if ((_Div3) && (_Div5)) {
                System.out.println("FizzBuzz");
            } else if (_Div3) {
                System.out.println("Fizz");
            } else if (_Div5) {
                System.out.println("Buzz");
            }
            _Div5 = false;
            _Div3 = false;
        }
    }
}

