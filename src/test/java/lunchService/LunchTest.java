package lunchService;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.com.kopzinski.beans.Place;
import br.com.kopzinski.beans.User;
import br.com.kopzinski.service.LunchService;

public class LunchTest {
	
	public User user;
	public Place place;
	public LunchService lunchService;
	public Date day;
	
	
	@Before
	public void prepareTest() {
		day = new Date();
		lunchService = new LunchService(day);
		user = new User(123,"paulo","Paulo Eduardo Kopzinski Mello");
		place = new Place(321, "tia zefa", "Av Barao do Amazonas, 123");
		
	}
	
	@Test
	public void singleVoteTest() {
		
		try {
			lunchService.vote(user, place, day);
		} catch (Exception e) {
			fail("TODO: write exception test");
		}		
		assertEquals(1, lunchService.countVotes(place));
		
	}
	
	@Test
	public void doubleVoteTest() {
		
		try {
			lunchService.vote(user, place, day);
		} catch (Exception e) {
			fail("TODO: write exception test");
		}		
		assertEquals(1, lunchService.countVotes(place));
		
	}	
	
	@Test
	public void winnerTest() {

		try {
			lunchService.vote(user, place, day);
			lunchService.vote(user, place, day);
		} catch (Exception e) {
			assertEquals(new Exception("Place"), lunchService.getWinner(day));
			fail("TODO: write exception test");
		}		
		
		
		
	}	
	
}
