/*
Victor José de Souza Ledo
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.AlunoBO;
import modelo.NegocioException;
import modelo.entidades.Aluno;

/**
 *
 * @author victo
 */
@WebServlet(name = "ListarAlunoServlet", urlPatterns = {"/aluno"})
public class ListarAlunoServlet extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Aluno> lista = new ArrayList<Aluno>();

        AlunoBO bo = new AlunoBO();
        try {
            lista = bo.listar();
        } catch (NegocioException e) {
            throw new ServletException("", e);
        }
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cadastro de Alunos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ListarAlunoServlet at " + request.getContextPath() + "</h1>");
            out.println("<h1> Listagem de Alunos</h1");
            out.println("<a href='" + response.encodeURL("/aluno/incluir") + "'>Incluir</a>");
            out.println("<table>");
            out.println("<tr>");
            for (Aluno aluno : lista) {
                out.println("<tr>");
                out.println("<td>" + aluno.getMatricula() + "</td>");
                out.println("<td>" + aluno.getMatricula() + "</td>");
                out.println("<td><a href='" + response.encodeURL("/aluno/alterar?id=") + aluno.getId() + "'>Alterar</a>");
                out.println("<a href='" + response.encodeURL("/aluno/excluir?id=") + aluno.getId() + "' onclick='return confirm('Deseja excluir o aluno?');'>Excluir</a></td>");
                out.println("</tr>");
            }
            out.println("<th>Matrícula</th>");
            out.println("<th>Nome</th>");
            out.println("<th>Ações</th>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");

        }
    }

     
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response) throws ServletException{
          throw new ServletException("Método não suportado");
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
        }

    }
