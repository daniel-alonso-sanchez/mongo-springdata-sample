/**
 * 
 */
package org.bringer.mongodb.sample.repository;

import org.bringer.mongodb.sample.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * @author daniel
 *
 */
public interface UserRepository extends PagingAndSortingRepository<User, String>{
	
}
