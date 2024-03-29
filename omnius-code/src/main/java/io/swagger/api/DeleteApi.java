/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T15:49:23.548Z")

@Api(value = "delete", description = "the delete API")
public interface DeleteApi {

    @ApiOperation(value = "Delete task", nickname = "deleteTaskIdDelete", notes = "Delete a task by id", tags={ "tasks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Task Deleted successfully"),
        @ApiResponse(code = 204, message = "Task not found"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/delete/{taskId}",
        produces = { "application/json" ,  "text/plain"}, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTaskIdDelete(@ApiParam(value = "Id of task to be deleted",required=true) @PathVariable("taskId") String taskId);

}
