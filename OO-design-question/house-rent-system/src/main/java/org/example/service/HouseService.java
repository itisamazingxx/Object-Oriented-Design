package org.example.service;

import org.example.domain.House;

public class HouseService {

    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1; // id计数器, 记录现在id自增到哪里

    public HouseService(int size) {
        this.houses = new House[size];
        this.houses[0] = new House(1, "Green Cottage", "555-1234", "123 Green Lane", 1200, "Available");
    }

    public House[] list() {
        return this.houses;
    }

    public boolean addHouse(House house) {
        if (houseNums == houses.length) {
            System.out.println("Not enough space!");
            return false;
        }
        // 添加新房屋到数组
        houses[houseNums++] = house;
        // 更新房屋的自增id信息
        house.setId(++idCounter);
        return true;
    }

    public boolean deleteHouse(int id) {
        int index = -1;
        // 找到要删除的房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (id == houses[i].getId()) {
                // 找到了
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("The house you want to delete doesn't exist");
            return false;
        }
        // 把整个数组index+1的位置整体前移 最后一位设置成null
        for (int i = index; i < houses.length - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNums] = null;
        return true;
    }

    public House findById(int id) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == id) {
                System.out.println(houses[i]);
                return houses[i];
            }
        }
        System.out.println("House not found in system.");
        return null;
    }
}