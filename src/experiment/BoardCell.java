package Experiment;

public class BoardCell {
	private int row;
	private int column;
	
	public void setRow(int r){
		row=r;
	}
	public void setColumn(int c){
		column=c;
	}
	public int getRow(){
		return row;
	}
	public int getColumn(){
		return column;
	}
	public BoardCell(int r, int c){
		row=r;
		column=c;
	}
}
