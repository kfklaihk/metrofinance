package com.example.metrofinance.repository;
import java.util.List;

import com.example.metrofinance.Model.Commentary;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface CommentaryRepository extends CrudRepository<Commentary, Long>{
	List<Commentary> findBybhouse(String bhouse);
	List<Commentary> findBystkname(String stkname);
	
	 @Query(value = "select distinct stkname from Commentary")
	    List<String> findAllstkname();
	 @Query(value = "select distinct bhouse from Commentary")
	    List<String> findAllbhouse();
	
	
}