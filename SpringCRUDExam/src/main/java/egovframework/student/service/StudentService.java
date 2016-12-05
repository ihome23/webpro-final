package egovframework.student.service;

import java.util.List;

import egovframework.student.StudentVO;


public interface StudentService {
	
    void insertStudent(StudentVO vo) throws Exception;
   
    List<StudentVO> selectStudent() throws Exception;
    
}
