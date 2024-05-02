package org.example.view;

import org.example.domain.House;
import org.example.service.HouseService;
import org.example.utils.Utility;

public class HouseView {
    private boolean loop = true; // 控制显示菜单
    private char key = ' '; // 接收用户输入
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
                    addHouse();
                    break;
                case '2':
                    searchHouse();
                    break;
                case '3':
                    deteleHouse();
                    break;
                case '4':
                    editHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }

        } while(loop);

    }

    public void listHouses() {
        System.out.println("\nCurrent all available houses:");
        System.out.println("ID\t\tName\t\tPhone\t\tAddress\t\tRent\t\tState");

        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("\nDisplay Completed!");
    }

    public void addHouse() {
        System.out.println("Please adds new house here:");
        System.out.println("House name:");
        String name = Utility.readString(8);
        System.out.println("House phone:");
        String phone = Utility.readString(11);
        System.out.println("House address:");
        String address = Utility.readString(16);
        System.out.println("House rent:");
        int rent = Utility.readInt();
        System.out.println("House state:");
        String state = Utility.readString(6);
        // ID按自增长的方式分配 用户无法选择
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.addHouse(newHouse)) {
            System.out.println("Adds successfully!");
        }
    }

    public void deteleHouse() {
        System.out.println("Delete House");
        System.out.print("Please enter the house id you want to delete(enter -1 to exit): ");
        int id = Utility.readInt();
        if (id == -1) {
            System.out.println("You gave up the operation!!");
            return;
        }
        char choice = Utility.readConfirmSelection(); // 循环判断
        if (choice == 'Y') {
            listHouses();
        } else {
            System.out.println("Exits operation");
        }
    }

    public void searchHouse() {
        System.out.println("You need to enter the id you want to search: ");
        int id = Utility.readInt();
        if (houseService.findById(id) != null) {
            System.out.println("Found house!");
        }
    }

    public void editHouse() {
        System.out.println("Please enter the house id you want to edit: ");
        int id = Utility.readInt();
        House house = houseService.findById(id);
        if (house == null) {
            System.out.println("id doesn't exist!");
            return;
        }
        // set name
        System.out.print("Name(" + house.getName() + "): ");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            house.setName(name);
        }
        // set phone
        System.out.print("Phone(" + house.getPhone() + "): ");
        String phone = Utility.readString(11, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }
        // set address
        System.out.print("Address(" + house.getAddress() + "): ");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        // set rent
        System.out.print("Rent(" + house.getRent() + "): ");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        // set state
        System.out.print("State(" + house.getState() + "): ");
        String state = Utility.readString(8, "");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.print("Edit successfully!!");
    }

    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }
}