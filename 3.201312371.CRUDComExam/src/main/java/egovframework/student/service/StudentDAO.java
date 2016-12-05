package egovframework.student.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.student.StudentVO;

@Repository("studentDAO")
public class StudentDAO extends EgovAbstractDAO {


    public String insertStudent(StudentVO vo) throws Exception {
        return (String)insert("insert", vo);
    }

    public List<?> selectStudentList() throws Exception {
        return list("select");
    }

}
