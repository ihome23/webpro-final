package egovframework.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.student.StudentDefaultVO;
import egovframework.student.StudentVO;
import egovframework.student.service.StudentDAO;
import egovframework.student.service.StudentService;


@Service("studentService")
public class StudentServiceImpl extends EgovAbstractServiceImpl implements
        StudentService {
        
   

    @Resource(name="studentDAO")
    private StudentDAO studentDAO;
    
   
    public void insertStudent(StudentVO vo) throws Exception {
    	studentDAO.insertStudent(vo);
    }

   
    public List<?> selectStudentList() throws Exception {
        return studentDAO.selectStudentList();
    }

    
}
