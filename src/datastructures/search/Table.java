/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.search;

import datastructures.app.data.Keyboard;
import datastructures.model.Accountant;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sscerbatiuc
 */
public class Table {

    private int recordsNum;
    private final ArrayList<Accountant> arrList = new ArrayList<>();

    public Table(int recordsNum) {
        if (recordsNum <= 0) {
            throw new IllegalArgumentException("Cannot create empty table");
        }
        this.recordsNum = recordsNum;
        this.initData();
    }

    private void initData() {
        System.out.println("Entering employee data:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < recordsNum; i++) {
            this.arrList.add(Keyboard.readAccountant());
        }
    }

}
