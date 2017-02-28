package tests;

import java.util.Map;

import experiment.IntBoard;
import experiment.RoomCell;

public class IntBoardTests {
	private static IntBoard board;
	public static final int NUM_ROOMS = 11;
	public static final int NUM_ROWS = 23;
	public static final int NUM_COLUMNS = 22;
	
	@BeforeClass
	public static void setUp() {
		board = new IntBoard();
		board.loadConfigFiles();
	}
	@Test
	public void testRooms() {
		Map<Character, String> rooms = board.getRooms();
		// Ensure we read the correct number of rooms
		assertEquals(NUM_ROOMS, rooms.size());
		// Test retrieving a few from the hash, including the first
		// and last in the file and a few others
		assertEquals("Conservatory", rooms.get('C'));
		assertEquals("Bedroom", rooms.get('B'));
		assertEquals("Bathroom", rooms.get('R'));
		assertEquals("Den", rooms.get('D'));
		assertEquals("Walkway", rooms.get('W'));
	}
	
	@Test
	public void testBoardDimensions() {
		// Ensure we have the proper number of rows and columns
		assertEquals(NUM_ROWS, board.getRows());
		assertEquals(NUM_COLUMNS, board.getCols());		
	}
	
}
