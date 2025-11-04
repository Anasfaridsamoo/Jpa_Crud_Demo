package com.demo.jpa_crud_demo.Exception;

public class ResourceNotFoundException extends RuntimeException {
     String ResourceName;
     String FieldName;
     int FieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName,int fieldValue) {
        super(String.format("%s Resource not found: %s = %s", resourceName,fieldName,fieldValue));
        this.FieldValue = fieldValue;
        this.FieldName = fieldName;
        this.ResourceName = resourceName;
    }
}
