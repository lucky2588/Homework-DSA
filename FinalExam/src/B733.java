public class B733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor)
            DFS(image, sr, sc, color, newColor);
        return image;
    }
    public void DFS(int[][] image, int x, int y, int color, int newColor) {
        if (image[x][y] == color) {
            image[x][y] = newColor;
            if (x >= 1) DFS(image, x - 1, y, color, newColor);
            if (y >= 1) DFS(image, x, y - 1, color, newColor);
            if (x + 1 < image.length) DFS(image, x + 1, y, color, newColor);
            if (y + 1 < image[0].length) DFS(image, x, y + 1, color, newColor);
        }
    }
    // Độ phức tạp về thời gian O(n)
    // Độ phức tạp về Không Gian O(n)
}
