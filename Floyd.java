import java.util.Scanner;

public class Floyd {
  
  private Scanner keys;
  
  public static void main(String[] args) {
    new Floyd().doIt();
  }

  private void doIt() {
    keys = new Scanner(System.in);
    pl("Enter vertex count");
    int vCount = keys.nextInt();
    int[][] weights = getWeights(vCount);
  }

  private int[][] getWeights(int vCount) {
    int[][] weights = new int[vCount][vCount];
    for (int k = 0; k < vCount; k++) {
      for (int j = 0; j < vCount; j++) {
        if (k == j) {
          weights[k][j] = 0;
        } else {
          pl("Enter weight from " + k + " to " + j);
          weights[k][j] = keys.nextInt();
        }
      }
    }
    return weights;
  }
  private void pl(Object out) {
    System.out.println(out);
  }
}
