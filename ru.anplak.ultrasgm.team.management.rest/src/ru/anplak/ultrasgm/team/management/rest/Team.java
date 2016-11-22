/**
 * 
 */
package ru.anplak.ultrasgm.team.management.rest;

import java.util.Random;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;

/**
 * @author aplakhot
 *
 */

public class Team {
	
	public Long id;

	public String name;
	
	public String creator;

	public Team(Long id, String name, String creator) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

}
