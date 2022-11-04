package com.xukuo.user;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Index extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        ServletContext app = this.getServletContext();
        String phone=request.getParameter("userphone");
        String password=request.getParameter("userpassword");
        try {
            con=DBUtil.getConnection();
            String sql="select * from user where userphone = ? and userpassword = ?";
            ps=con.prepareStatement(sql);
            ps.setString(1,phone);
            ps.setString(2,password);
            rs=ps.executeQuery();
            if(rs.next()){
                request.getRequestDispatcher("/IndexSuccess").forward(request,response);
            }else {
                out.print("<script>alert('登录失败，请检查账号密码');" +
                        "window.location.href='/First/Login'</script>");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtil.close(con,ps,rs);
        }



    }
}
