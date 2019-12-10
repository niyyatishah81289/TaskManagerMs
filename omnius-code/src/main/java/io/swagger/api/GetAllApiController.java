package io.swagger.api;

import io.swagger.model.TaskDetails;
import io.swagger.repository.TaskManagementRepository;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
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
import java.util.Comparator;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T15:49:23.548Z")

@Controller
public class GetAllApiController implements GetAllApi 
{
	@Autowired
	private TaskManagementRepository taskManagementRepo;

    private static final Logger log = LoggerFactory.getLogger(GetAllApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetAllApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<TaskDetails>> getAllGet() {       
        
        List<TaskDetails> taskInfo = taskManagementRepo.findAll();

        if(taskInfo.size()>0)
        {
			/*
			 * System.out.println("Before sort::"); 
			 * for(TaskDetails t : taskInfo)
			 * System.out.print(t);
			 */
        	
        	taskInfo.sort(Comparator.comparing(TaskDetails::getDueDate)
        			.thenComparingInt(TaskDetails::getPriority));
			/*
			 * System.out.println("After sort::"); 
			 * for(TaskDetails t : taskInfo)
			 * System.out.print(t);
			 */
        	
        	
        	return new ResponseEntity<List<TaskDetails>>(taskInfo,HttpStatus.OK);
        }	
        else
        	return new ResponseEntity<List<TaskDetails>>(HttpStatus.NO_CONTENT);
    }

}
