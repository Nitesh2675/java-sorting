import java.util.Scanner;

public class Student {
    String name;
    int mark;
    
    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

class BubbleSortClass{

    static void display(Student[] s1) {
        for(int i=0;i<s1.length;i++) {
            System.out.print(s1[i].name + " ");
            System.out.print(s1[i].mark);
            System.out.println();
        }
    }

    static Student[] bubbleSort(Student[] s1) {
        for(int i=0;i<s1.length;i++) {
            for(int j=0;j<s1.length-i-1;j++) {
                if(s1[j].mark > s1[j+1].mark) {
                    int t = s1[j].mark;
                    s1[j].mark = s1[j+1].mark;
                    s1[j+1].mark = t;
                }
            }
        }
        return s1;
    }

    public static void main(String[] strs) {
        Scanner sc = new Scanner(System.in);

        Student[] s1 = new Student[5];
        for(int i=0;i<s1.length;i++) {
            int mark = sc.nextInt();
            String name = sc.nextLine();
            s1[i] = new Student(name, mark);
        }

        display(s1);
        s1 = bubbleSort(s1);
        display(s1);
    }
}

// 5 "kill"
// 3 "whole"
// 4 "chill"
// 1 "humble"
// 6 "secure"
//  "kill" 5
//  "whole" 3
//  "chill" 4
//  "humble" 1
//  "secure" 6
//  "kill" 1
//  "whole" 3
//  "chill" 4
//  "humble" 5
//  "secure" 6