package app;

public class App {

    public static void main(String[] args) throws Exception {
      Bank bank = new Bank("Bank of America");
      bank.addNewBranch("Arlington");
      bank.addNewCustomer("Arlington", "Tundun", 50.50);
      bank.addNewCustomer("Arlington", "Dammy", 40.45);
      bank.addNewCustomer("Arlington", "Ade", 670.00);

      bank.addNewBranch("Baltimore");
      bank.addNewCustomer("Baltimore", "Ngozi", 203.98);

      bank.addCustomerTransaction("Arlington", "Tundun", 59.40);
      bank.addNewCustomer("Arlington", "Tundun", 12.90);
      bank.addNewCustomer("Arlington", "Dammy", 50.50);

      bank.listCustomers("Arlington", true);
    }
}
