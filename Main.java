import exceprions.WrongAccountException;
import exceprions.WrongCurrencyException;
import exceprions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        try{
            bankApplication.process("accountId000", 50, "USD");
             }
        catch(WrongAccountException wrongAccountException)
        {
            System.out.println("Account does not exist");
        }
        catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Account has different currency account");
        }
        catch (WrongOperationException wrongOperationException){
            System.out.println("Account balance is not enough");
        }
        catch(Exception e){
            System.out.println("Something went wrong, please try again");
        }
        finally {
            System.out.println("Thank you for using our service");
        }
        try{
            bankApplication.process("accountId003", 250, "HRV");
        }
        catch(WrongAccountException wrongAccountException)
        {
            System.out.println("Account does not exist");
        }
        catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Account has different currency account");
        }
        catch (WrongOperationException wrongOperationException){
            System.out.println("Account balance is not enough");
        }
        catch(Exception e){
            System.out.println("Something went wrong, please try again");
        }
        finally {
            System.out.println("Thank you for using our service");
        }
        try{
           bankApplication.process("accountId001", 50, "EUR");
        }
        catch(WrongAccountException wrongAccountException)
        {
            System.out.println("Account does not exist");
        }
        catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Account has different currency account");
        }
        catch (WrongOperationException wrongOperationException){
            System.out.println("Account balance is not enough");
        }
        catch(Exception e){
            System.out.println("Something went wrong, please try again");
        }
        finally {
            System.out.println("Thank you for using our service");
        }
        try{
           bankApplication.process("accountId001", 50, "USD");
        }
        catch(WrongAccountException wrongAccountException)
        {
            System.out.println("Account does not exist");
        }
        catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Account has different currency account");
        }
        catch (WrongOperationException wrongOperationException){
            System.out.println("Account balance is not enough");
        }
        catch(Exception e){
            System.out.println("Something went wrong, please try again");
        }
        finally {
            System.out.println("Thank you for using our service");
        }
        try{
            bankApplication.process("accountId001", 50, "USD");
        }
        catch(WrongAccountException wrongAccountException)
        {
            System.out.println("Account does not exist");
        }
        catch (WrongCurrencyException wrongCurrencyException){
            System.out.println("Account has different currency account");
        }
        catch (WrongOperationException wrongOperationException){
            System.out.println("Account balance is not enough");
        }
        catch(Exception e){
            System.out.println("Something went wrong, please try again");
        }
        finally {
            System.out.println("Thank you for using our service");
        }
    }
}