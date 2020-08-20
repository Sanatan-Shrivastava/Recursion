public class TraverseMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, 
                        { 4, 5, 6 },
                        { 7, 8, 9 },
                        { 10, 11, 12 } };
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        traverse(arr, 0, 0, visited);
        System.out.print("END");
        return;
    }

    static void traverse(int[][] arr, int i, int j, boolean[][] visited) {
        if(i < 0 || j < 0 || i >= arr.length || j >= arr[i].length || visited[i][j]) {
            return;
        }

        visited[i][j] = true;
        System.out.print(arr[i][j] + " -> ");
        traverse(arr, i + 1, j, visited);
        traverse(arr, i, j + 1, visited);
        return;
    }
}