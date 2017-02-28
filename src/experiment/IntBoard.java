package experiment;

import java.util.HashSet;
import java.util.Set;

import experiment.BoardCell;

public class IntBoard {
	final static int ROW = 23;
	final static int COLUMN = 22;
	BoardCell[][] grid = new BoardCell[ROW][COLUMN];
	private Set<BoardCell> targets = new HashSet<BoardCell>();
	private Set<BoardCell> adjList = new HashSet<BoardCell>();
	
	public IntBoard(){
		for(int i=0; i<ROW; i++){
			for(int j=0; j< COLUMN; j++){
				grid[i][j].setRow(i);
				grid[i][j].setColumn(j);
			}
		}
	}
	
	public IntBoard(int row, int column){
		for(int i=0; i<row; i++){
			for(int j=0; j< column; j++){
				grid[i][j].setRow(i);
				grid[i][j].setColumn(j);
			}
		}
	}
	
	public BoardCell getCell(int a, int b){
		return grid[a][b];
	}
	
	public void calcAdjacencies(){
		
	}
	
	public void calcTargets(BoardCell n, int steps){
		
	}
	
	public Set<BoardCell> getTargets(){
		return targets;
	}
	
	public Set<BoardCell> getAdjList(BoardCell b){
		return adjList;
	}
}
