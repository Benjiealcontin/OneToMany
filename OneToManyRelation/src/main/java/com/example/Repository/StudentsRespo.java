package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Model.Department;
import com.example.Model.Students;
import com.example.Service.Response;

public interface StudentsRespo extends  JpaRepository<Students, Integer>{

	@Query("SELECT new com.example.Service.Response(s.firstname , d.name) FROM Students s JOIN s.department d WHERE s.id = ?1")
	public List<Response> getJoinInformation(int id);

}
