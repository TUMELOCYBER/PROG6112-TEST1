

import java.util.Scanner;

// Contains variables for console type, store name and total sales
    abstract class Consoles implements IConsoles {
    private String consoleType;
    private String storeName;
    private int totalSales;

    // Constructor that accepts console type, store name and total sales
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Methods to get the values (required by the interface)
    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return storeName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}

class ConsoleSales extends Consoles {
    
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

        public void printReport() {
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE NAME: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user to enter the information
        System.out.print("Enter console device type (e.g. PS5, XBOX, SWITCH): ");
        String consoleType = input.nextLine();

        System.out.print("Enter store name: ");
        String storeName = input.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = input.nextInt();
        
        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);
      
        // Printing the report
        System.out.println();
        System.out.println("----- SALES REPORT -----");
        sale.printReport();

        input.close();
    }
}