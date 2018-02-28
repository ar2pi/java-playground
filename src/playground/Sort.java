package playground;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Sort {

    Sort(String type) {
        int listLength = Integer.parseInt(JOptionPane.showInputDialog(null, "Array's length:"));
        int[] list = new int[listLength];
        for (int i = 0; i < listLength; i++) {
            list[i] = (int) Math.ceil(Math.random() * 100);
        }

        switch (type) {
        case "bubble":
            bubble(list);
            break;
        case "selection":
            selection(list);
            break;
        case "insertion":
            insertion(list);
            break;
        }
    }

    private static int[] bubble(int[] list) {
        int steps = 0;
        System.out.println(Arrays.toString(list));
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
                steps++;
            }
            System.out.println("-" + Arrays.toString(list));
        }
        System.out.println(Arrays.toString(list));
        System.out.println("Steps: " + steps);
        return list;
    }

    private static int[] selection(int[] list) {
        int steps = 0;
        System.out.println(Arrays.toString(list));
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
                steps++;
            }
            if (list[min] != list[i]) {
                int temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
            System.out.println("-" + Arrays.toString(list));
        }
        System.out.println(Arrays.toString(list));
        System.out.println("Steps: " + steps);
        return list;
    }

    private static int[] insertion(int[] list) {
        int steps = 0;
        System.out.println(Arrays.toString(list));
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            for (int j = i - 1; j >= 0; j--) {
                if (temp < list[j]) {
                    int temp2 = list[j];
                    list[j + 1] = temp2;
                    list[j] = temp;
                } else {
                    break;
                }
                steps++;
            }
            System.out.println("-" + Arrays.toString(list));
        }
        System.out.println(Arrays.toString(list));
        System.out.println("Steps: " + steps);
        return list;
    }

}