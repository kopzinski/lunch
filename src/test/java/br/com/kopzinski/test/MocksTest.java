package br.com.kopzinski.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.kopzinski.beans.Candidate;
import br.com.kopzinski.beans.Election;
import br.com.kopzinski.beans.Place;
import br.com.kopzinski.beans.User;
import br.com.kopzinski.mock.Mocks;

public class MocksTest {
	
	@Test
	public void testPopulateElections() {
		List<Election> list = Mocks.populateElections();
		
		
		for (Election election : list) {
			
		}
		assertTrue(list.size() > 0);
		assertTrue(list.get(0) instanceof Election);
		assertTrue(list.get(0).getDay().after(new Date()));
	}

	@Test
	public void testPopulateCandidates() {
		List<Candidate> list = Mocks.populateCandidates();
		
		assertEquals(5,list.size());
		
		for (Candidate candidate : list) {
			System.out.println(candidate.getVoters().size());
		}
		
		assertFalse(list.get(0).getVotes() == list.get(1).getVotes());
	}

	@Test
	public void testPopulatePlaces() {
		List<Place> list = Mocks.populatePlaces();
		assertEquals(5, list.size());
		assertTrue(list.get(0) instanceof Place);
	}

	@Test
	public void testPopulateVotersByPlace() {
		
		Place p = new Place(1, "teste", "av xpto");
		List<User> list = Mocks.populateVotersByPlace(p);
		
		assertTrue(list.size() > 0);
		assertTrue(list.get(0) instanceof User);
		
	}

	@Test
	public void testPopulateAllUsers() {
		List<User> list = Mocks.populateAllUsers();
		assertEquals(8, list.size());
		assertTrue(list.get(0) instanceof User);
	}

}
