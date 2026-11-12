package com.cal;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String number1=	request.getParameter("num1");
		
		int num1=Integer.parseInt(number1);
		
		String op1=	request.getParameter("op");
		
		String number2=	request.getParameter("num2");
		
		int num2=Integer.parseInt(number2);
		
		int result;
		

		PrintWriter out=response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		
		switch(op1) {
		case "+":
			result=num1+num2;
			out.println("<h2>"+num1+" + "+num2+" = "+result+"</h2>");
			break;
		case "-":
			result=num1-num2;
			out.println("<h2>"+num1+" - "+num2+" = "+result+"</h2>");
			break;
		case "*":
			result=num1*num2;
			out.println("<h2>"+num1+" * "+num2+" = "+result+"</h2>");
			break;
		case "/":
			result=num1/num2;
			out.println("<h2>"+num1+" / "+num2+" = "+result+"</h2>");
			break;
		case "%":
			result=num1%num2;
			out.println("<h2>"+num1+" % "+num2+" = "+result+"</h2>");
			break;
		default:
			out.println("<h2>Enter Valid Operator</h2>");
		}

	}
}
