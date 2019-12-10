package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.TaskDetails;
import io.swagger.repository.TaskManagementRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T15:49:23.548Z")

@Controller
public class DeleteApiController implements DeleteApi {

	@Autowired
	private TaskManagementRepository taskManagementRepo;
	
	/*
	 * private static final Logger log =
	 * LoggerFactory.getLogger(DeleteApiController.class);
	 * 
	 * private final ObjectMapper objectMapper;
	 * 
	 * private final HttpServletRequest request;
	 * 
	 * @org.springframework.beans.factory.annotation.Autowired public
	 * DeleteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
	 * this.objectMapper = objectMapper; this.request = request; }
	 */

    public ResponseEntity<Void> deleteTaskIdDelete(@ApiParam(value = "Id of task to be deleted",required=true) @PathVariable("taskId") String taskId) 
    {
    	TaskDetails t = taskManagementRepo.findByTaskId(taskId);
    	
    	if (t !=null)
    	{
    		taskManagementRepo.delete(taskId);
    		return new ResponseEntity<Void>(HttpStatus.OK);
    	}	
    	else
    		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    	
    		
    	
    }

}
