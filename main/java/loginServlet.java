import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

//This servlet define the login successful of login

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
//        out.println("<html><head>\n" +
//                "    <meta charset=\"UTF-8\">\n" +
//                "    <title>Login</title>\n" +
//                "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
//                "</head><body>" +
//                "<div class=\"container\">"+
//                "<a class=\"m-auto fs-2 text-decoration-none\" href='productList.jsp'>Go to Product Page</a>" +
//                "</body></html>");

        out.println("<html><head>" +
                "<meta charset=\"UTF-8\">\n" +
                "<title>LoginServlet</title>\n" +
                "<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                "</head><body style=\"background-image=\"./images/bgimg.jpg\">" +
                "<div class=\"container\">"+
                "<h1 style=\"color:#880e4f; text-align: center;font-family:arial-bold;margin-top: 50px \">Welcome to Shopping Zone BD</h1>"+
                "<a style=\"text-align: center; color: crimson;font-size: 35px;\" href='productList.jsp'>Go to Product Page</a>" +
                "<button style=\"color: green;margin-left:750px;width: 100px; height: 60px;border-radius: 18%; border: 2px solid black;align-items: center;font-size:24px;\"button\" value=\"Logout\">Logout</button>\n"+
                "</div></body></html>");
    }
}







//
//        import com.modelPackage.Cart;
//        import com.modelPackage.Product;
//        import javax.servlet.*;
//        import javax.servlet.http.*;
//        import javax.servlet.annotation.*;
//        import java.io.IOException;
//        import java.sql.*;
//        import java.util.ArrayList;
//        import java.util.List;
//
//@WebServlet(name = "LoginServlet", value = "/LoginServlet")
//public class loginServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String emailid = request.getParameter("email");
//        String password = request.getParameter("password");
//        String name = "";
//        int flag =0 ;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "");
//            Statement st = connection.createStatement();
//            ResultSet rs = st.executeQuery("SELECT *FROM user_table");
//
//            while (rs.next()) {
//                String emailid1 = rs.getString("emailid");
//                String password1 = rs.getString("password");
//
//                if (emailid.equals(emailid1) && password.equals((password1))) {
//                    name = rs.getString("name");
//                    flag = 1;
//                    break;
//                }
//
//            }
//            if(flag==1)
//            {
//                HttpSession session = request.getSession();
//                List<Cart> cartList = new ArrayList<Cart>();
//                List<Integer> id = new ArrayList<Integer>();
//                List<Integer> quantity = new ArrayList<Integer>();
//
//                rs = st.executeQuery("SELECT *FROM cart_list where user_emailid='"+emailid+"'");
//
//                int i = 0;
//                while (rs.next())
//                {
//                    id.add(rs.getInt("id"));
//                    quantity.add(rs.getInt("quantity"));
//                }
//                for(i=0;i<id.size();i++)
//                {
//                    Cart cart = new Cart();
//                    cart.setId(id.get(i));
//                    cart.setQuantity(quantity.get(i));
//                    cartList.add(cart);
//                }
//
//                session.setAttribute("cart_lists",cartList);
//                session.setAttribute("user",emailid);
//                session.setAttribute("name",name);
//                response.sendRedirect("productList.jsp");
//            }
//            else {
//                request.setAttribute("error","Password or Email Does not Match");
//                request.getRequestDispatcher("loginPage.jsp").forward(request,response);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
//}
