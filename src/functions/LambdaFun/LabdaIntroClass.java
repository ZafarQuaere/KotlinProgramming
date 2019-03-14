package functions.LambdaFun;

public class LabdaIntroClass {
    interface SomInterface {
        void doSomeStuff();
    }
    private static void invokeSomeStuff(SomInterface someInterface) {
        someInterface.doSomeStuff();
    }
    public static void main(String[] args) {

        //general way to call invokeSomeStuff()
        invokeSomeStuff(new SomInterface() {
            @Override
            public void doSomeStuff() {
                System.out.println("doSomeStuff invoked");
            }
        });

        //using lambda we can do it as
      /*  invokeSomeStuff(()->{
            System.out.println("doSomeStuff invoked");
        });*/
    }
}
