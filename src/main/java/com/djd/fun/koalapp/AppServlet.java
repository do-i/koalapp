package com.djd.fun.koalapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.collect.ImmutableList;

public class AppServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private static final Random RANDOM = new Random(1);
  private static final ImmutableList<String> PROVERBS = ImmutableList.of(
      "A friend in need is a friend indeed",
      "A dog is a man's best friend",
      "A bird in the hand is worth two in the bush",
      "A barking dog never bites",
      "A picture paints a thousand words"
  );

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    int index = RANDOM.nextInt(PROVERBS.size());
    System.out.println("Selected index is " + index);
    String proverb = PROVERBS.get(index);
    System.out.println("Proverb is " + proverb);
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Random Proverbs</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h2>" + proverb + "</h2>");
    out.println("</body>");
    out.println("</html>");
    System.out.println("Response returned.");
  }
}
