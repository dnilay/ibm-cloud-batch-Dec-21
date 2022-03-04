package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {
	@ExceptionHandler
	public ResponseEntity<ErrorResponseModel> handleCouponNotFoundException(CouponNotFoundException e)
	{
		ErrorResponseModel errorResponseModel=new ErrorResponseModel();
		errorResponseModel.setCode(HttpStatus.NOT_FOUND.value());
		errorResponseModel.setMessage(e.getMessage());
		return new ResponseEntity<ErrorResponseModel>(errorResponseModel,HttpStatus.NOT_FOUND);
	}

}
