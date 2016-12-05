package egovframework.student.web;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import egovframework.student.service.StudentService;
import egovframework.student.StudentVO;

@Controller
@SessionAttributes(types=StudentVO.class)
public class StudentController {

    @Inject
    private StudentService studentService;
    
    @RequestMapping(value="/student/StudentList.do")
    public String selectStudentList (ModelMap model) throws Exception {
    	
        List<StudentVO> studentList = studentService.selectStudent();
        model.addAttribute("resultList", studentList);
          
        return "/student/StudentList";
    } 
    
    @RequestMapping("/student/addStudentView.do")
    public String addStudentView (Model model) throws Exception {
        model.addAttribute("studentVO", new StudentVO());
        return "/student/StudentRegister";
    }
    
    @RequestMapping("/student/addStudent.do")
    public String addStudent(StudentVO studentVO, SessionStatus status) throws Exception {
        studentService.insertStudent(studentVO);
        status.setComplete();
        return "forward:/student/StudentList.do";
    }
    
}
