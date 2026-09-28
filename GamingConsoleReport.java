
//It is containing variables for console type, store name and total sales
public class GamingConsoleReport {

    public static void main(String[] args) {
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        // Column 0 = PS5, Column 1 = XBOX, Column 2 = SWITCH
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200},    // Pretoria
        };

        //Print the main report
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-----------------------------------------------");
        System.out.println("                 PS5     XBOX    SWITCH");
        System.out.println("-----------------------------------------------");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "  "+ sales[i][0] + "     " + sales[i][1] + "     "  + sales[i][2]);
        }

        System.out.println("-----------------------------------------------");
        System.out.println();
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------");
       
          int highestTotal = 0;
          String cityWithMostSales = "";
          
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = sales[i][0] + sales[i][1] + sales[i][2];
            
            System.out.println(cities[i] + "     " + cityTotal);
            
        if (cityTotal > highestTotal) {
            highestTotal = cityTotal;
            cityWithMostSales = cities[i];
            }
        }
        // Printing out city with the most sales
        System.out.println("-----------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("-----------------------------------------------");
    }
}