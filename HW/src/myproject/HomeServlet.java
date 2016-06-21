package myproject;
import java.io.*;
//import java.util.Random;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HomeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		
		String lessonNumber=req.getParameter("l");
		
		//-------------------------------------1---------------------------------------------
		if (lessonNumber.equals("1"))
		{
		try{
		double value = 10;
		double value1 = Double.parseDouble(req.getParameter("var1").replace(",", "."));
		double value2 = Double.parseDouble(req.getParameter("var2").replace(",", "."));
		
		double result = (Math.abs(value-value1)<Math.abs(value-value2))?value1:value2;
		
		if ((int)result == result){
			resp.getWriter().println((int)result);
			}else{resp.getWriter().println(result);}
		
		}catch(Exception e){resp.getWriter().println("Введены некорректные данные");}
		}
		//-------------------------------------2---------------------------------------------
		if (lessonNumber.equals("2"))
		{
		try{
		;
		double a = Double.parseDouble(req.getParameter("var3").replace(",", "."));
		double b = Double.parseDouble(req.getParameter("var4").replace(",", "."));
		double c = Double.parseDouble(req.getParameter("var5").replace(",", "."));
		
		double dis=b*b-4*a*c;
		if (dis<0) {resp.getWriter().println("Корней нет");} else 
		if (dis==0) {resp.getWriter().println("X = "+(-b/(2*a)));} else
		if (dis>0) {
			resp.getWriter().println("x<sub>1</sub> = "+((-b+Math.sqrt(dis))/(2*a)));
			resp.getWriter().println("x<sub>2</sub> = "+((-b-Math.sqrt(dis))/(2*a)));
			//Math.rint((-b+Math.sqrt(dis))/(2*a)*100.0)/100.0);
			//String.format("%.2f",(-b+Math.sqrt(dis))/(2*a)));
		}

		}catch(Exception e){resp.getWriter().println("Введены некорректные данные");}
		}
		
		//-------------------------------------3---------------------------------------------
		if (lessonNumber.equals("3"))
		{	int [][] arr2 = new int[8][5];
			
		resp.getWriter().println("<table class='table table-striped'>");
			for(int i=0;i<8;i++){resp.getWriter().println("<tr>");
				for(int j=0;j<5;j++){
					arr2[i][j]=
							(int)(Math.random() * 90)+10;
				
					resp.getWriter().print("<td align=center>"+arr2[i][j]+"</td>");
			}
				resp.getWriter().println("</tr>");
			
		}	resp.getWriter().println("</table>");	
		}
		
		//-------------------------------------4---------------------------------------------
		if (lessonNumber.equals("4"))
		{	int [][] arr = new int[5][8];
			int max=Integer.MIN_VALUE;
			
			resp.getWriter().println("<table class='table table-striped'>");
			for(int i=0;i<5;i++){resp.getWriter().println("<tr>");
				for(int j=0;j<8;j++){
					arr[i][j]=(int)(Math.round(Math.random() * 198)-99);
					
					
				resp.getWriter().print("<td align=center>"+arr[i][j]+"</td>");
				max=(max>arr[i][j])?max:arr[i][j];
				}
				resp.getWriter().println("</tr>");
			}
			resp.getWriter().println("</table>Максимальный элемент массива равен: "+max);
		}				
		

		
		
	}

	
}
