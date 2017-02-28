import java.util.HashSet;
import java.util.Set;

import Experiment.BoardCell;

public class IntBoard {
	final static int ROW = 23;
	final static int COLUMN = 22;
	private BoardCell[][] grid;
	private Set<BoardCell> targets= new HashSet<BoardCell>();
	private Set<BoardCell> adjList= new HashSet<BoardCell>();
	private Set<BoardCell> visited= new HashSet<BoardCell>();
	
	public IntBoard(){
	
		for(int i=0; i<ROW; i++){
			for(int j=0; j< COLUMN; j++){
				grid[i][j]=new BoardCell(i,j);
			}
		}
	}
	
	public IntBoard(int row, int column){
		for(int i=0; i<row; i++){
			for(int j=0; j< column; j++){
				grid[i][j]=new BoardCell(i,j);
			}
		}
	}
	
	public BoardCell getCell(int a, int b){
		return grid[a][b];
	}
	
	public Set<BoardCell> calcAdjacencies(BoardCell cell){
		adjList.clear();
		int row=cell.getRow();
		int col=cell.getColumn();
		BoardCell c;
		if(row>0){
			c= new BoardCell(row-1,col);
			adjList.add(c);
		}
		if(col>0){
			c= new BoardCell(row,col-1);
			adjList.add(c);
		}
		if(grid[row][col+1]!=null){
			c= new BoardCell(row,col+1);
			adjList.add(c);
		}
		if(grid[row+1][col]!=null){
			c= new BoardCell(row+1,col);
			adjList.add(c);
		}
		
	}
	
	public Set<BoardCell> calcTargets (BoardCell b, int steps){
		targets.clear();
		visited.clear();
		visited.add(b);
		FindTargets(b, steps);
		
	}
	public Set<BoardCell> FindTargets (BoardCell b, int steps){
	calcAdjacencies(b);	
	for(BoardCell a: adjList){
		if(!visited.contains(a)){
			visited.add(a);
			if(steps==1){
				targets.add(a);
			}
			else{
				FindTargets(a, steps-1);
			}
			visited.remove(a);
		}
		
	}
		
	}
	
	public Set<BoardCell> getTargets(BoardCell a){
		return targets;
	}
	
	public Set<BoardCell> getAdjList(BoardCell a){
		return adjList;
	}
}
