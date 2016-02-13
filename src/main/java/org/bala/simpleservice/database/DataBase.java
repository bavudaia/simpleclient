package org.bala.simpleservice.database;

import java.util.HashMap;
import java.util.Map;

import org.bala.simpleservice.model.Client;

public class DataBase {
	public static Map<Integer, Client> clientMap ;
	
	static{
		clientMap = new HashMap<>();
	}
}
