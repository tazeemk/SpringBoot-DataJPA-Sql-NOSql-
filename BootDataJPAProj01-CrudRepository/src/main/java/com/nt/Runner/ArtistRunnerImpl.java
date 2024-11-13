package com.nt.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Service.IArtistServiceImpl;
import com.nt.entity.Artist;
@Component
public class ArtistRunnerImpl implements CommandLineRunner
{
    @Autowired
    private IArtistServiceImpl ser;  

	@Override
	public void run(String... args) throws Exception
	{
	
		Artist ar = new Artist("Devang", "Hero", 996555.87);
		
		try {
			
			String msg= ser.getDetails(ar);
			System.out.println(msg);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
	}
	
}
