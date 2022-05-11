package contactmanager.blog.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {

	String recourceName ;
	String fieldName  ;
	long fieldValue ;
	public ResourceNotFoundException(String recourceName, String fieldName, long fieldValue) {
		super();
		this.recourceName = recourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	

}
