import utils.Utility;
import service.HouseService;

public class HouseView {
    private boolean loop = true; // 控制显示菜单
    private char key = '\\u0000'; // 接收用户输入
    private HouseService houseService = new HouseService(10);

    public void mainMenu() {
        do {
            System.out.println("=======House Rent System=======");
            System.out.println("\t1. Adds new house");
            System.out.println("\t2. Search house");
            System.out.println("\t3. Delete house");
            System.out.println("\t4. Edit house information");
            System.out.println("\t5. List all houses");
            System.out.println("\t6. Exit");
            System.out.println("Please enter 1-6:");

            key = Utility.readChar();

            switch (key) {
                case '1':
                    //add
                    break;
                case '2':
                    // search
                    break;
                case '3':
                    // delete
                    break;
                case '4':
                    // update
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    // exit
                    break;
            }

        } while(loop);

    }

    public void listHouses() {
        System.out.println("\nCurrent all available houses:");
        System.out.println("ID\tName\t\t\tPhone\t\tAddress\t\t\t\tRent\tState");

        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            System.out.println(houses[i]);
        }
        System.out.println("\nDisplay Completed!");


    }
}