package myproject;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Pract3 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		
		
		byte b = 127;
        resp.getWriter().println(b+"<br>");
        
        short s = 32767;
        resp.getWriter().println(s+"<br>");
        
        int i = 999999999;
        resp.getWriter().println(i+"<br>");
        
        //��� ����� ���� long ����������� ��������� 'l'
        long l = 100l;
        resp.getWriter().println(l+"<br>");
        
        //���������� ��� ������
        char c2 = 'c';
        char c3 = 1200;
        resp.getWriter().println(c2+"<br>");
        resp.getWriter().println(c3+"<br>");
        
        //� ����������������� ������� ���������
        char c = 0x0770;
        resp.getWriter().println(c+"<br>");
        
        /*
        //����� ��������
        for (char c1 = 1200; c1<1300;c1++){
        	resp.getWriter().print(c1+" ");
        	if ((c1 % 10)==0){
        		resp.getWriter().println("===");
        	}
        }*/
        
      //���������� �����
        resp.getWriter().println((int)c+"<br>");
        
        int h=3,g=2;
        resp.getWriter().println(h/g+"<br>");
        resp.getWriter().println((float)h/g+"<br>");
        
        float h1=30000000000000000.0f,g1=2;
        resp.getWriter().println(h1/g1+"<br>");
        resp.getWriter().println((int)(h1/g1)+"<br>");
        
        resp.getWriter().println("<br>");
        float f = 100000000000000000000000000000000000000.0f;
        resp.getWriter().println(f+"<br>");
        double googol = 1e100;
        double d = 1100.34;
        boolean bool = true;
        
        //escape-�������
        resp.getWriter().println(googol+"<br>");
        resp.getWriter().print("������� ������"+"\n"+"<br>");
        
        //�������� �������� switch
        int x=1,y=2,z,operation=0;
        
        switch (operation){
        case 0:
        	z = x+y;
        	break;
        case 1:
        	z = x-y;
        	break;
        case 2:
        	z = x*y;
        	break;
        default:
        	z = x/y;
        }
        resp.getWriter().println("��������� ���������� ��������: "+z+"<br>");
        
        //���� for
        long factorial=1;
        for (l=1l;l<10;l++){
        	factorial*=l;
        }
        resp.getWriter().println(factorial+"<br>");
        
        //�������
        int[] m1;
        int[] m2 = new int[5];
        int[] m3 = {1,2,3};
        resp.getWriter().println(m3[0]+"<br>");
        
        int[][] m4;
        int[][] m5 = {{1,2},{2}};
        resp.getWriter().println(m5[0][0]+"<br>");
        
        String[] str = new String[4];
        String[] seasons = {"����","�����","����","�����"};
        
        for(i=0;i<seasons.length;i++){
        	resp.getWriter().println(seasons[i]+"<br>");
        }

  double dd = Math.random();
        resp.getWriter().println(dd+"<br>");
        
        int random = (int)(dd*100);
        resp.getWriter().println(random+"<br>");

		
		
		
		
	}
}
