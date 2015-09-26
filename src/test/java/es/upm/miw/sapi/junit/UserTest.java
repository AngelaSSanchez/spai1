package es.upm.miw.sapi.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.spai.junit.User;

public class UserTest {
	private User us;
	
    @Before
    public void before() {
        us = new User(1, "Angela","Serrano");
    }


	@Test
	public void testFullName() {
        assertEquals("Angela Serrano", us.fullName());
       // assertEquals(3, pt.getY());;
	}

	@Test
	public void testGetName() {
		assertEquals("Angela", us.getName());
	}
	
	@Test
	public void testGetNumber() {
		assertEquals(1, us.getNumber());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Serrano", us.getFamilyName());
	}
	
	@Test
	public void testInitials() {
		assertEquals("A.", us.initials());
	}

}
