/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CircleAreaCalculation;
import Model.RectangleAreaCalculation;
import Model.TriangleSideCalculation;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author netzl_000
 */
@WebServlet(name = "CalSubmit", urlPatterns = {"/Submit"})
public class CalSubmit extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String length = request.getParameter("Length");
        String width = request.getParameter("Width");

        String radius = request.getParameter("Radius");

        String sideA = request.getParameter("SideA");
        String sideB = request.getParameter("SideB");
        String sideC = request.getParameter("SideC");

        if (length != null) {

            int recLength = Integer.valueOf(length);
            int recWidth = Integer.valueOf(width);

            RectangleAreaCalculation rac = new RectangleAreaCalculation(recLength, recWidth);

            int recArea = rac.rectangleAreaCalculation(recLength, recWidth);

            request.setAttribute("RecArea", recArea);

        } else if (radius != null) {

            Double cirRadius = Double.valueOf(radius);

            CircleAreaCalculation cir = new CircleAreaCalculation(cirRadius);

            Double cirArea = cir.circleAreaCalculation(cirRadius);

            request.setAttribute("CirArea", cirArea);

        } else if (sideA != null & sideB.toString() != null) {

            Double triSideA = Double.valueOf(sideA);
            Double triSideB = Double.valueOf(sideB);

            TriangleSideCalculation tri = new TriangleSideCalculation();

            Double triSideC = tri.sideCCalculation(triSideB, triSideA);

            request.setAttribute("TriSide", triSideC);

        } else if (sideA != null & sideC != null) {

            Double triSideA = Double.valueOf(sideA);
            Double triSideC = Double.valueOf(sideC);

            TriangleSideCalculation tri = new TriangleSideCalculation();

            Double triSideB = tri.sideBCalculation(triSideC, triSideA);

            request.setAttribute("TriSide", triSideB);

        } else if (sideB != null & sideC != null) {

            Double triSideB = Double.valueOf(sideB);
            Double triSideC = Double.valueOf(sideC);

            TriangleSideCalculation tri = new TriangleSideCalculation();

            Double triSideA = tri.sideACalculation(triSideB, triSideC);

            request.setAttribute("TriSide", triSideA);
                
            }
            RequestDispatcher view
                    = request.getRequestDispatcher("result.jsp");
            view.forward(request, response);
                
            String myContextParam = request.getSession()
               .getServletContext()
               .getInitParameter("adminEmail");
        }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
