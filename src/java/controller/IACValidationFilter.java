/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 *
 * @author Axel
 */
@WebFilter("/calcularIAC") 
public class IACValidationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        try {
            int edad = Integer.parseInt(request.getParameter("edad"));
            double estatura = Double.parseDouble(request.getParameter("estatura"));
            double peso = Double.parseDouble(request.getParameter("peso"));
            double medidaCadera = Double.parseDouble(request.getParameter("cadera"));

            if (edad <= 0 || estatura <= 0 || peso <= 0 || medidaCadera <= 0) {
                throw new NumberFormatException("Valores negativos o cero no son válidos.");
            }
            chain.doFilter(request, response);

        } catch (NumberFormatException e) {
            httpRequest.setAttribute("error", "Por favor ingrese valores válidos para todos los campos.");
            httpRequest.getRequestDispatcher("index.jsp").forward(httpRequest, httpResponse);
        }
    }
}
