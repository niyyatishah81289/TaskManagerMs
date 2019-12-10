package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.utils.MyDateTimeDeserializer;

/**
 * TaskDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-09T15:49:23.548Z")

public class TaskDetails   
{
	@Id
	@JsonProperty("taskId")
	private String taskId = null;

	@JsonDeserialize(using = MyDateTimeDeserializer.class)
	@JsonProperty("createdAt")
	private DateTime createdAt = null;

	@JsonDeserialize(using = MyDateTimeDeserializer.class)
	@JsonProperty("updatedAt")
	private DateTime updatedAt = null;

	@JsonDeserialize(using = MyDateTimeDeserializer.class)
	@JsonProperty("dueDate")
	private DateTime dueDate = null;

	@JsonDeserialize(using = MyDateTimeDeserializer.class)
	@JsonProperty("resolvedAt")
	private DateTime resolvedAt = null;

	@JsonProperty("title")
	private String title = null;

	@JsonProperty("description")
	private String description = null;

	@JsonPropertyDescription("Priority can be 1 - 5 where 5 is highest priority")
	@Min(1)
	@Max(5)
	@JsonProperty("priority")
	private int priority;

	@JsonProperty("status")
	private String status = null;


	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public TaskDetails createdAt(DateTime createdAt) {
		this.createdAt = createdAt;
		return this;
	}


	public DateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}

	public TaskDetails updatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}


	public DateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public TaskDetails dueDate(DateTime dueDate) {
		this.dueDate = dueDate;
		return this;
	}

	public DateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(DateTime dueDate) {
		this.dueDate = dueDate;
	}

	public TaskDetails resolvedAt(DateTime resolvedAt) {
		this.resolvedAt = resolvedAt;
		return this;
	}

	public DateTime getResolvedAt() {
		return resolvedAt;
	}

	public void setResolvedAt(DateTime resolvedAt) {
		this.resolvedAt = resolvedAt;
	}

	public TaskDetails title(String title) {
		this.title = title;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public TaskDetails description(String description) {
		this.description = description;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public TaskDetails priority(int priority) {
		this.priority = priority;
		return this;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public TaskDetails status(String status) {
		this.status = status;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TaskDetails taskDetails = (TaskDetails) o;
		return Objects.equals(this.taskId, taskDetails.taskId) &&
				Objects.equals(this.createdAt, taskDetails.createdAt) &&
				Objects.equals(this.updatedAt, taskDetails.updatedAt) &&
				Objects.equals(this.dueDate, taskDetails.dueDate) &&
				Objects.equals(this.resolvedAt, taskDetails.resolvedAt) &&
				Objects.equals(this.title, taskDetails.title) &&
				Objects.equals(this.description, taskDetails.description) &&
				Objects.equals(this.priority, taskDetails.priority) &&
				Objects.equals(this.status, taskDetails.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(taskId, createdAt, updatedAt, dueDate, resolvedAt, title, description, priority, status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TaskDetails {\n");

		sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
		sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
		sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
		sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
		sb.append("    resolvedAt: ").append(toIndentedString(resolvedAt)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

