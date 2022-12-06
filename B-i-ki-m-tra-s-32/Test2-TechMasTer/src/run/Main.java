package run;

import entity.Member;
import view.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static ArrayList<Member> members = new ArrayList<>();
    public static ArrayList<Integer> trungThuong = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3));
    public static ArrayList<Integer> xucXac = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
            14, 15, 16, 17, 18));
    public static ArrayList<Member> members1 = new ArrayList<>();

    public static void main(String[] args) {
        manHinhChinh();
    }

    public static void manHinhChinh() {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        while (true) {
            menu.startMenu(scanner);
        }
    }
}



