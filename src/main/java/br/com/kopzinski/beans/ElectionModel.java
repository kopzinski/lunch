package br.com.kopzinski.beans;

import java.util.List;

import br.com.kopzinski.mock.Mocks;

public class ElectionModel {
	private List<Election> elections;

	public ElectionModel() {
		elections = Mocks.populateElections();
	}
	
	public Election getElectionFromDay(Date day){
		return Mocks.
	}
	
	
	public List<Election> getElections() {
		return elections;
	}

	public void setElections(List<Election> elections) {
		this.elections = elections;
	}
}
