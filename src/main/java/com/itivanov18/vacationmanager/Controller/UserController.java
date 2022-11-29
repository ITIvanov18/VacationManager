package com.itivanov18.vacationmanager.Controller;
import com.itivanov18.vacationmanager.Model.User;
import com.itivanov18.vacationmanager.data_access_object.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class UserController {

    @Autowired
    UserRepository userRepo;

    User loggedUser;

    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/goToLogin")
    public String loginPage(){
        return "login";
    }
    @GetMapping("/goToRegister")
    public String registerPage(){
        return "register";
    }
    @GetMapping("/logout")
    public String logout()
    {
        return "index";
    }
    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user, Model model) {
        userRepo.save(user);
        return "index";
    }
    @GetMapping("/ceoPage")
    public String ceoPage(Model model) {
        model.addAttribute("getLoggedUser", loggedUser);
        return "ceo";
    }
    @RequestMapping(value = "/usersInfo")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "allUsers";
    }

    /*
    @GetMapping(value="/login")
    public String getUserByUsernameAndPassword(@ModelAttribute User user, Model model) {
        User loggedUser = userRepo.findByNicknameAndPassword(user.getNickname(), user.getPassword());
        model.addAttribute("getLoggedUser", loggedUser);
        if(loggedUser.getRole().contains("CEO")) {
            return "ceo";
        }
        else if(loggedUser.getRole().contains("Developer")) {
            return "developer";
        }
        return "view";
    }*/
}
