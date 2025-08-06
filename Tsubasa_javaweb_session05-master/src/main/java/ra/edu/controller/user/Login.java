package ra.edu.controller.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ra.edu.model.entity.Customer;
import ra.edu.repo.UserRepo;

import java.io.IOException;

@WebServlet(urlPatterns = "/Login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Customer c = new UserRepo().login(username, password);
        if(c!=null){
            if(c.getRole().equals("ADMIN")){
                req.getRequestDispatcher("admin.jsp").forward(req,resp);
            }else if(c.getRole().equals("USER")){
                req.getRequestDispatcher("home.jsp").forward(req,resp);
            }
        }else{
            req.setAttribute("err","Login Failed!");
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
    }
}
