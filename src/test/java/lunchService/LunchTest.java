package lunchService;

import static org.junit.Assert.*;

import java.util.Date;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import br.com.kopzinski.beans.Place;
import br.com.kopzinski.beans.User;
import br.com.kopzinski.exception.DuplicatedVoteException;
import br.com.kopzinski.service.LunchService;

public class LunchTest {

	public User user;
	public Place place;
	public LunchService lunchService;
	public Date day;

	@Before
	public void prepareTest() {
		day = new DateTime(2015, 6, 20,0,0).toDate();
		lunchService = new LunchService();
		user = new User(1, "paulo", "Paulo Silva");
		place = new Place(1, "tia zefa", "rua barao amazonaas, 123");
	}

	@Test
	public void singleVoteTest() throws DuplicatedVoteException {

		lunchService.vote(user, place, day);
		
		assertEquals(2, lunchService.countVotes(place, day));

	}

	@Test(expected = DuplicatedVoteException.class)
	public void doubleVoteTest() throws DuplicatedVoteException {

		lunchService.vote(user, place, day);
		lunchService.vote(user, place, day);

	}

	@Test
	public void winnerTest() {

		try {
			lunchService.vote(user, place, day);

			assertTrue(lunchService.getWinner(day).equals(place));

		} catch (Exception e) {
			assertEquals(new Exception("Place"), lunchService.getWinner(day));
			fail("TODO: write exception test");
		}

	}

}
