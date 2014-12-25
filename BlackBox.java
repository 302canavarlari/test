package testEngine;

import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import UserInterface.InfoBoard;
import Domain.*;

public class BlackBox {
	Level[] level = new Level [3];
	InfoBoard ib = new InfoBoard(1);
	Board board = new Board(12, 10, ib);
	Board beforeboard = board;
	ArrayList<ArrayList<Lokum>> silinecekLokum = new ArrayList<ArrayList<Lokum>>();
	GameEngine gme = new GameEngine(board,ib);
	
	
	
	@Before
	public void setUp() throws Exception {
		
		level[2]=new ScoreBasedLevel(70000,6,6,2, true);


	}

	@Test
	public void testmarkDeleted() {
		
		if(silinecekLokum.size()==0 ){
			gme.markDeleted();
		}
		for( int i=0; i<beforeboard.getRow(); i++){
			for(int j=0; j<beforeboard.getCol(); j++){
				if (board.board[i][j].type!= beforeboard.board[i][j].type){
				
				}
				
			}
			
		}
		
		System.out.println("board is equal");
	
	}

}
