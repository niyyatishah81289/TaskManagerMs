package io.swagger.repository;

import java.util.List;

import org.joda.time.DateTime;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import io.swagger.model.TaskDetails;

public interface TaskManagementRepository extends MongoRepository<TaskDetails, String> {

	TaskDetails findByTaskId(String taskId);
	
	@Query("{'status': ?0}")
	List<TaskDetails> findByTaskStatus(String status);
	
	@Query("{'priority': ?0}")
	List<TaskDetails> findByTaskPriority(String priority);
	
	//get tasks within due date range
	@Query("{$and: [{'duedate': { $gte: ?0, $lt: ?1}},{'status' : { $ne: 'closed' }}]}")
	List<TaskDetails> findTaskByDueDateRange(DateTime startDate, DateTime endDate);		
}
