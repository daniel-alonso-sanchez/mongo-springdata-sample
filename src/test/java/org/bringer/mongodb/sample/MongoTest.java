/**
 * 
 */
package org.bringer.mongodb.sample;

import org.bringer.mongodb.sample.model.User;
import org.bringer.mongodb.sample.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author daniel
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml"})
public class MongoTest {
	private Logger logger = LoggerFactory.getLogger(MongoTest.class);
	@Autowired
    private UserRepository userRepository;
	@Autowired
    private MongoTemplate  template;
	
	@Before 
	public void initialize() {
	      template.dropCollection(User.class);
	}
	@Test
    public void testCount() throws Exception {
       
		logger.info("firing count");
		long count=userRepository.count();
		logger.info("{} documents found",count);
        junit.framework.Assert.assertEquals(0, count);
    }
	@Test
    public void testInsert() throws Exception {
		logger.info("firing inserts");
		User user=new User("123","user1","user1@sample.org");
		userRepository.save(user);		
		long count=userRepository.count();
		logger.info("{} documents found",count);
        junit.framework.Assert.assertEquals(1, count);
    }

	/**
	 * @return the userRepository
	 */
	public UserRepository getUserRepository() {
		return userRepository;
	}


	/**
	 * @param userRepository the userRepository to set
	 */
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
}
