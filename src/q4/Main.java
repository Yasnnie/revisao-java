package q4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente( "1234-5", "Pedro",2500.0);
        ContaPoupanca conta2 = new ContaPoupanca("2222-2", "Yasmin", 500000.0);
        try{
            conta.sacar(200);
            System.out.println("Saldo: " + conta.getSaldo());

            conta.sacar(0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            conta.sacar(5000);
            System.out.println("Saldo: " + conta.getSaldo());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            conta2.sacar(50001);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            conta.depositar(1000);
            System.out.println("Saldo: " + conta.getSaldo());
            conta2.depositar(0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
