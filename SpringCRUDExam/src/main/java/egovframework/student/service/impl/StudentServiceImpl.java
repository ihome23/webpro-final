package egovframework.student.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import egovframework.student.StudentVO;
import egovframework.student.service.StudentDAO;
import egovframework.student.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {
        
    @Inject
    private StudentDAO studentDAO;
    
    
    public void insertStudent(StudentVO vo) throws Exception {
    	studentDAO.insertStudent(vo);
 
    }
    
    public List<StudentVO> selectStudent() throws Exception {
        return studentDAO.selectStudent();
    }

	
}
