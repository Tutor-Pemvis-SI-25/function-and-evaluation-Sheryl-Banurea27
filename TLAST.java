//Sheryl valentina Banurea - 12S25050

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String perintah;
        int jumlahTugas;

        jumlahTugas = 0;
        perintah = input.nextLine();
        if (!perintah.equals("---") && jumlahTugas <= 10) {
            if (perintah.equals("Add task")) {
                addTask();
            } else {
                if (perintah.equals("Update task status")) {
                    updateTaskStatus();
                } else {
                    if (perintah.equals("Show assignment")) {
                        showAssignment();
                    }
                }
            }
            perintah = input.nextLine();
        }
    }
    
    public static void addTask() {
        int totalData;

        totalData = 0;
        String perintah;
        String[] deskripsi = new String[10];
        String[] kode = new String[10];
        String[] matkul = new String[10];
        String[] dosen = new String[10];
        String[] deadline = new String[10];
        String[] ketID = new String[10];
        int[] kesulitan = new int[10];
        int[] hari = new int[10];
        String[] status = new String[10];
        double[] prioritas = new double[10];

        if (totalData < 10) {
            deskripsi[totalData] = input.nextLine();
        }
    }
    
    public static void showAssignment() {
    }
    
    public static void updateTaskStatus() {
    }
}
