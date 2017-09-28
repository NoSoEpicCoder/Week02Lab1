package sait.cprg352;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class AgeCalculatorServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
                forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String currentAge = request.getParameter("currentAge");
        
        if(currentAge == null || currentAge.isEmpty()){
            
            request.setAttribute("errorMessage", "You must give your current age");
            
        } else if(!currentAge.matches(".*\\d.*")){
            
            request.setAttribute("errorMessage", "You must enter a number");
            
        } else {
            
            int currentAgeNum = Integer.parseInt(currentAge);
                        
             request.setAttribute("currentAge", "Your age next birthday will be " + ++currentAgeNum);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
                forward(request, response);
    }
}