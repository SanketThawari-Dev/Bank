@Controller
public class UiNavigationController {

    @GetMapping("/loginu")
    public String loginu(HttpSession session) {
        session.removeAttribute("msg");
        return "redirect:/login.jsp";
    }

    @GetMapping("/signupu")
    public String signupu(HttpSession session) {
        session.removeAttribute("msg");
        return "redirect:/signup.jsp";
    }

    @GetMapping("/accountu")
    public String accountu(HttpSession session) {
        session.removeAttribute("msg");
        return "redirect:/account.jsp";
    }
}

