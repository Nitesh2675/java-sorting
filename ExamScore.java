import java.util.Scanner;

public class ExamScore {

    static void display(int[] emp) {
        for(int i=0;i<emp.length;i++) {
            System.out.print(emp[i]+ " ");
        }
        System.out.println();
    }

    static void SelectionSort(int[] exm) {
        for(int i=0;i<exm.length-1;i++) {
            int min = i;
            for(int j=i+1;j<exm.length;j++) {
                if(exm[j] < exm[min]) min = j;
            }
            int t = exm[i];
            exm[i] = exm[min];
            exm[min] = t;
        }
    }

    public static void main(String[] strs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int emp[] = new int[n];
        
        for(int i=0;i<emp.length;i++) emp[i] = sc.nextInt();
        display(emp);
        SelectionSort(emp);
        display(emp);
    }
}


// 5
// 7 1 8 4 6
// 7 1 8 4 6 
// 1 4 6 7 8
