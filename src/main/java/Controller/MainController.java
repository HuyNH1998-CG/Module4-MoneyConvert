package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(HttpServletRequest request){
        return "/index.jsp";
    }
    @RequestMapping("/convert")
    public String convert(HttpServletRequest request){
        int toConvert = Integer.parseInt(request.getParameter("money"));
        int rate = Integer.parseInt(request.getParameter("rate"));
        int converted = toConvert * rate;
        request.setAttribute("converted",converted);
        return "/converted.jsp";
    }
}
