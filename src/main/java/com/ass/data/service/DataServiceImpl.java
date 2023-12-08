package com.ass.data.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ass.data.entity.DataEntity;
@Service
public class DataServiceImpl  implements DataService
{

	
	private final Map<Integer, String> dataMap= new HashMap<>();
	
	


	  /**
     * Retrieves data by ID.
     *
     * @param it takes id, The ID of the data to retrieve.
     * @return returns string the retrieved data or a message indicating data not found.
     */
	@Override
	public String getDataById(int id) 
	{
		
		
		return dataMap.getOrDefault(id, "Data not found");
	}


	
	/**
     * Adds data to the hashmap.
     *
     * @param it takes  DataEntity object to add into hashmap.
     * @return returns string a message confirming the addition of data into map.
     */
	
	@Override
	public String addData(DataEntity entity) 
	{
		 dataMap.put(entity.getId(), entity.getValue());
		
		
		
		return "Data Added Successfully";
	}

	
	/**
     * Updates data into the data hashmap.
     *
     * @param it takes  DataEntity object with updated data.
     * @return returns string a message confirming the successful update of data or if the ID is not found.
     */
	
	@Override
	public String updateData(DataEntity entity) 
	{
		int entityId = entity.getId();
        
		
		if (dataMap.containsKey(entityId)) 
		{
            dataMap.put(entityId, entity.getValue());
            return "Data updated successfully for ID: " + entityId;
        } 
		else 
		{
            return "ID not found in the dataMap";
        }
	}
	
	

	/**
     * Deletes data from the  hashmap by ID.
     *
     * @param it takes id, the ID of the data to be delete.
     * @return returns string a message confirming the successful deletion of data or if the ID is not found.
     */
	@Override
	public String deleteData(int id) 
	{
		
		if(dataMap.containsKey(id))
		{
			dataMap.remove(id);
			
			return "Data deleted Successfully for id"+ id;
		}
		
		else
		{
			return "Data not found";
		}
		
	}

	
	

}
