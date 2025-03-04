package com.journaldev.design.model;

import com.journaldev.design.model.*;
import com.journaldev.design.model.Computer;

public class TestFactoryPattern {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC", "16 GB", "1 TB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("Server", "32 GB", "2 TB", "3.6 GHz");
        System.out.println("Factory PC Config:: " + pc);
        System.out.println("Factory Server Config:: " + server);
    }
}
