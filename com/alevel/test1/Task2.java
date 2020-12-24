package com.alevel.test1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int size = 8;
        int[][] tableChess = new int[size][size];
        Scanner scanner = new Scanner(System.in);
        String[][] arr = {
                {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"},
                {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
                {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
                {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
                {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
                {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
                {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
                {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"}
        };
        System.out.println("Input current position");
        int startI = 0, startJ = 0;
        String horsePosition = scanner.nextLine();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (horsePosition.equals(arr[i][j])) {
                    startI = i;
                    startJ = j;
                }
            }
        }
        int startPosI = startI;
        int startPosJ = startJ;
        System.out.println("Input next position");
        int moveI = 0, moveJ = 0;
        String moveTo = scanner.nextLine();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (moveTo.equals(arr[i][j])) {
                    moveI = i;
                    moveJ = j;
                }
            }
        }
       moveTo(startPosI,startPosJ,moveI,moveJ);

    }
static void moveTo(int startPosI,int startPosJ,int moveI,int moveJ){
    boolean flag = false;
    int startI = startPosI;
    int startJ = startPosJ;
    if (((startPosI = startPosI + 2) == moveI) && ((startPosJ = startPosJ + 1) == moveJ)) {
        System.out.println("You can move");
        flag = true;
    }
    startPosI = startI;
    startPosJ = startJ;
    if (((startPosI = startPosI + 1) == moveI) && ((startPosJ = startPosJ + 2) == moveJ)) {
        System.out.println("You can move");
        flag = true;
    }
    startPosI = startI;
    startPosJ = startJ;
    if (((startPosI = startPosI - 1) == moveI) && ((startPosJ = startPosJ + 2) == moveJ)) {
        System.out.println("You can move");
        flag = true;
    }
    startPosI = startI;
    startPosJ = startJ;
    if (((startPosI = startPosI - 2) == moveI) && ((startPosJ = startPosJ + 1) == moveJ)) {
        System.out.println("You can move");
        flag = true;
    }
    startPosI = startI;
    startPosJ = startJ;
    if (((startPosI = startPosI - 2) == moveI) && ((startPosJ = startPosJ - 1) == moveJ)) {
        System.out.println("You can move");
        flag = true;
    }
    startPosI = startI;
    startPosJ = startJ;
    if (((startPosI = startPosI - 1) == moveI) && ((startPosJ = startPosJ - 2) == moveJ)) {
        System.out.println("You can move");
        flag = true;
    }
    startPosI = startI;
    startPosJ = startJ;
    if (((startPosI = startPosI + 1) == moveI) && ((startPosJ = startPosJ - 2) == moveJ)) {
        System.out.println("You can move");
        flag = true;
    }
    startPosI = startI;
    startPosJ = startJ;
    if (((startPosI = startPosI + 2) == moveI) && ((startPosJ = startPosJ - 1) == moveJ)) {
        System.out.println("You can move");
        flag = true;
    }
    startPosI = startI;
    startPosJ = startJ;
    if (((startPosI = startPosI + 2) == moveI) && ((startPosJ = startPosJ + 1) == moveJ)) {
        System.out.println("You can move");
        flag = true;
    }
    if(flag == false){
        System.out.println("You can NOT move");
    }
}

}
