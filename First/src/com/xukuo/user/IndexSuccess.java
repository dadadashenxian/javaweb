package com.xukuo.user;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IndexSuccess extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        ServletContext app = this.getServletContext();
        String name=request.getParameter("userphone");
        out.print("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
        out.print("<script src=\"https://code.jquery.com/jquery-3.6.1.min.js\"></script>");
        out.print("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
        out.println(" <nav class=\"navbar navbar-default\" role=\"navigation\" style='margin-bottom:0px;'>\n" +
                "        <div class=\"navbar-header\">\n" +
                "            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n" +
                "                <span class=\"sr-only\">Toggle navigation</span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "                <span class=\"icon-bar\"></span>\n" +
                "            </button>\n" +
                "            <a class=\"navbar-brand\" href=\"#\">李宁</a>\n" +
                "        </div>\n" +
                "        <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n" +
                "            <ul class=\"nav navbar-nav\">\n" +
                "                <li class=\"active\"><a href=\"#\">所有分类</a></li>\n" +
                "                <li><a href=\"#\">鞋子</a></li>\n" +
                "            </ul>\n" +
                "\n" +
                "            <ul class=\"nav navbar-nav navbar-right\" >\n" +
                "                <li class=\"dropdown\">\n" +
                "                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">"+name+"个人中心<b class=\"caret\"></b></a>\n" +
                "                    <ul class=\"dropdown-menu\">\n" +
                "                        <li><a href=\"#\">我的信息</a></li>\n" +
                "                        <li><a href=\"#\">我的购物车</a></li>\n" +
                "                        <li><a href=\"#\">我的订单</a></li>\n" +
                "                        <li><a href=\"#\">余额</a></li>\n" +
                "                        <li><a href=\"#\">退出</a></li>\n" +
                "                    </ul>\n" +
                "                </li>\n" +
                "            </ul>\n" +

                "        </div>\n" +
                "    </nav>");
        out.println("<div id=\"carousel-id\" class=\"carousel slide\" data-ride=\"carousel\">\n" +
                "        <ol class=\"carousel-indicators\">");

        try {
            con= DBUtil.getConnection();
            String sql="select * from  carouselimgs";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                out.println("<li data-target=\"#carousel-id\" data-slide-to=\""+(id-1)+"\" class=\"\"></li>");
            }
            out.println("</ol>");
            out.println("<div class=\"carousel-inner\">");
            rs=ps.executeQuery();
            while (rs.next()){
                String url1 = rs.getString("url");
                int id = rs.getInt("id");
                if(id==1) {
                    out.println("<div class=\"item active\"><img src='"+url1+"'></div>");
                }else{
                    out.println("<div class=\"item\"><img src='"+url1+"'></div>");
                }
            }
            out.println("</div>\n" +
                    "        <a class=\"left carousel-control\" href=\"#carousel-id\" data-slide=\"prev\"><span class=\"glyphicon glyphicon-chevron-left\"></span></a>\n" +
                    "        <a class=\"right carousel-control\" href=\"#carousel-id\" data-slide=\"next\"><span class=\"glyphicon glyphicon-chevron-right\"></span></a>\n" +
                    "    </div>");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            DBUtil.close(con,ps,rs);
        }

    }
}
