package org.example.strategy;

import org.example.request.Request;

public class PeakHourStrategy implements Strategy {
    @Override
    public void handleRequest(Request request) {
        // 高峰期分配电梯的方法
        // 选择一个 elevator接客
    }
}
