package io.swagger.api;

import io.swagger.model.TaskDetails;
import io.swagger.repository.TaskManagementRepository;

import io.swagger.annotations.*;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;

import io.swagger.utils.MyUtlity;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T15:49:23.548Z")

@Controller
public class UpdateTaskApiController implements UpdateTaskApi {

	@Autowired
	private TaskManagementRepository taskManagementRepo;

	public ResponseEntity<TaskDetails> updateTaskPost(@ApiParam(value = "Task details to be updated" ,required=true )  @Valid @RequestBody TaskDetails body) {

		TaskDetails t = taskManagementRepo.findByTaskId(body.getTaskId());

		if(t == null)				
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		if(t.getCreatedAt() != null && t.getCreatedAt() != body.getCreatedAt())
			t.setCreatedAt(body.getCreatedAt());

		if(t.getDueDate() != null && t.getDueDate() != body.getDueDate())
			t.setDueDate(body.getDueDate());

		if(t.getPriority() != body.getPriority())
			t.setPriority(body.getPriority());

		if(t.getResolvedAt() != null && t.getResolvedAt() != body.getResolvedAt())
			t.setResolvedAt(body.getResolvedAt());

		if(t.getStatus() != null && t.getStatus() != body.getStatus()) 
		{
			if (MyUtlity.validateStatus(body.getStatus()))
				t.setStatus(body.getStatus());
		}

		if(t.getTitle() != null && t.getTitle() != body.getTitle())
			t.setTitle(body.getTitle());

		if(t.getDescription() != null && t.getDescription() != body.getDescription())
			t.setDescription(body.getDescription());

		t.setUpdatedAt(MyUtlity.getDateWithoutZone(new DateTime()));

		taskManagementRepo.save(t);

		return new ResponseEntity<TaskDetails>(t,HttpStatus.OK);
	}



}
