package servlets;

import entitys.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username.equals("dfyz")&&password.equals("MegaP0kem0n")){
            HttpSession httpSession = req.getSession(true);
            User user = new User(1,username);
            httpSession.setAttribute(username,user);
        }

    }
}
