package com.ass.data.service;

import com.ass.data.entity.DataEntity;

public interface DataService 
{



    String addData(DataEntity entity);
    
	String getDataById(int id);

    String updateData(DataEntity entity);

    String deleteData(int id);
	
}
