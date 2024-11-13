package com.nt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repository.IArtist;
import com.nt.entity.Artist;
@Service("service")
public class ArtistServiceImpl implements IArtistServiceImpl
{
@Autowired
	private IArtist artistRepo;
	
	
public String getDetails(Artist artist) 
{
  Artist artist1= artistRepo.save(artist);
 // System.out.println("Artist "+Artist.class);
	
	return artist1.getSid()==null?"Record Not Inserted":"Record Inserted Successfully ";
}
	
}
