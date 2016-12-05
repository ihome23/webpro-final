package egovframework.student.service;
import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import egovframework.student.StudentVO;


@Repository() /*Data Access Object*/
public class StudentDAO {
	
	/*Inverse Of Control(IOC)*/
	@Inject
	private SqlSession session; 

    public void insertStudent(StudentVO vo) throws Exception {
       session.insert("Student_SQL.insert", vo);  
    }

    /*한꺼번에 불러오기*/
    public List<StudentVO> selectStudent() throws Exception {
        return session.selectList("Student_SQL.select");
    }


}
