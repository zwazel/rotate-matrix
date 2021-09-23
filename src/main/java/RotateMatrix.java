public class RotateMatrix {
    public RotateMatrix(int[][] array) {
        System.out.println("before:\n" + getMatrix(array));

        array = rotateMatrix(array);

        System.out.println("after:\n" + getMatrix(array));
    }

    private int[][] rotateMatrix(int[][] array) {
        int height = array[0].length;
        int width = array.length;

//        System.out.println("width = " + width);
//        System.out.println("height = " + height);
//        System.out.println();

        int[][] tempArray = new int[height][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int widthToGo = width - i - 1;
//                System.out.println("heightToGo = " + j);
//                System.out.println("widthToGo = " + widthToGo);
//                System.out.println();
                tempArray[j][widthToGo] = array[i][j];
            }
        }

        return tempArray;
    }

    private String getMatrix(int[][] array) {
        StringBuilder result = new StringBuilder();
        for (int[] i : array) {
            for (int j : i) {
                result.append(j);
            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int width = 3;
        int height = 2;
        int[][] array = new int[height][width];
        int counter = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = counter++;
            }
        }
        new RotateMatrix(array);
    }
}