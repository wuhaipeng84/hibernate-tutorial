package com.hibernate.tutorial.entitymanager;

import junit.framework.TestCase;

public class ApplicationManagedEntityManagerTest extends TestCase{

	ApplicationManagedEntityManager amem;
	
	@Override
	protected void setUp() throws Exception {
		amem = new ApplicationManagedEntityManager();
		super.setUp();
	}
	
	public void testSave() throws Exception {
		amem.save();
	}
}
