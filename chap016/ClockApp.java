import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class ClockApp extends HttpServlet {
  protected void doGet(
  HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.getWriter().println(new Date().toString() );
  }
}
