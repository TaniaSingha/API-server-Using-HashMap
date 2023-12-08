package com.ass.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ass.data.entity.DataEntity;
import com.ass.data.service.DataServiceImpl;


/**
 * Handles HTTP requests related to DataEntity operations.
 * @author Tania Singha
 */
@RestController
public class DataController 
{
	
	@Autowired
	private DataServiceImpl service;
	
	
	/**
     * Endpoint to add data into HashMap.
     *
     * @param It takes  DataEntity object to be add into map.
     * @return String A message confirming that data is added into hashmap.
     */
	
	@PostMapping("/addData")
	public String addData(@RequestBody DataEntity entity) 
	{
		return service.addData(entity);
	}
	
	
	
	/**
     * Endpoint to get data by ID.
     *
     * @param it takes id, The ID of the data to retrieve.
     * @return returns string the retrieved data or a message indicating data not found.
     */
	@GetMapping("/getDataById/{id}")
	public String getDataById(@PathVariable("id") int id) 
	{
		return service.getDataById(id);
	}
	
	
	
	/**
     * Endpoint to update data.
     *
     * @param It takes  DataEntity object to be update data into map.
     * @return  returns string a message confirming the successful update of data or if the ID is not found.
     */
	@PutMapping("/updateData")
	public String updateData(@RequestBody DataEntity entity) 
	{
		return service.updateData(entity);
	}
	
	
	
	
	 /**
     * Endpoint to delete data by ID.
     *
     * @param it takes id ,the ID of the data to be delete.
     * @return returns string a message confirming the successful deletion of data or if the ID is not found.
     */
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable("id") int id) 
	{
		return service.deleteData(id);
	}

}
