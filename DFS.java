import java.util.*;
public class DFS
{
	public int vertices;
	public int adjMat[][];
	public int visited[];
	public DFS()
	{
		vertices=8;
		visited=new int[vertices];
		adjMat=new int[][]{
			{0,1,1,0,0,0,0,0},
			{1,0,0,1,1,0,0,0},
			{1,0,0,0,0,1,1,0},
			{0,1,0,0,0,0,0,1},
			{0,1,0,0,0,0,0,1},
			{0,0,1,0,0,0,0,1},
			{0,0,1,0,0,0,0,1},
			{0,0,0,1,1,1,1,0}};
	}
	public void dfs(int s)
	{
		int i=s;
		if(visited[s]==0)
		{
			System.out.print(s+" ");
			visited[s]=1;
			for(int j=0;j<vertices;j++)
			{
				if(adjMat[s][j]==1 && visited[j]==0)
				{
					dfs(j);
				}
			}
		}
	}
	public static void main(String args[])
	{
		DFS d=new DFS();
		System.out.println("DFS:");
		d.dfs(0);
	}
}
