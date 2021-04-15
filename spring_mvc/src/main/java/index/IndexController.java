package index;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView("index"); //web.xml을 이용한 경로간소화
		mv.addObject("data","Hello Spring MVC~");
//		mv.setViewName("WEB-INF/view/index.jsp");
		return mv;
	}

}
