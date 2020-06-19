package youngri;

import java.util.Arrays;

public class MazeRecursion {
	private static int N = 8;
	private static int[][] maze = {
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
	};
	private static final int PATHWAY_COLOR = 0; // 진입 가능
	private static final int WALL_COLOR = 1; // 진입 불가
	private static final int BLOCKED_COLOR = 2; // 방문 후, 통로가 없는 표시
	private static final int PATH_COLOR = 3; // 방문
	public static boolean findMazePath(int x, int y) {
		if(x < 0 || y < 0 || x >= N || y >= N)
			return false; // 범위 nono
		else if(maze[x][y] != PATHWAY_COLOR)
			return false; // 진입불가
		else if(x == N-1 && y==N-1) {
			maze[x][y] = PATH_COLOR;
			return true; // 도착!
		}else {
			maze[x][y] = PATH_COLOR;
			if(findMazePath(x -1, y) || findMazePath(x, y+1)
					||findMazePath(x +1, y) || findMazePath(x, y-1)) {
				return true;
			}
			maze[x][y] = BLOCKED_COLOR; // dead end
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(maze));
		findMazePath(0, 0);
	}
}
