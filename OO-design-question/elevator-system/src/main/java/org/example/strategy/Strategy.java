package org.example.strategy;

import org.example.request.Request;

public interface Strategy {
    void handleRequest(Request request);
}
