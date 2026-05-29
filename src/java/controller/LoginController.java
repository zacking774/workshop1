/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.UserDAO;
import dto.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LOQ
 */
@WebServlet(name = "LoginController", urlPatterns = {"/LoginController"})
public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response){
        try{
            String phone=request.getParameter("txtphonenumber");
            String password=request.getParameter("txtpassword");
            UserDAO d=new UserDAO();
            User user=d.getUser(phone, password);
            if(user==null){
                String msg="phone number or password is invalid";
                request.setAttribute("ERROR", msg);
                request.getRequestDispatcher("login_page.jsp").include(request, response);
            }else{
                if(user.isStatus()){ 
                request.getSession().setAttribute("USER", user);
                response.sendRedirect("userDashboard_page.jsp");
                }else{
                    response.getWriter().print("access deny!!!");
                }
            } 
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold

}
