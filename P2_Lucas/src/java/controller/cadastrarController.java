package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import model.Cliente;

/**
 * Servlet implementation class registrarUsuario
 */
@WebServlet("/cadastrarController")
public class cadastrarController extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastrarController() {
        super();
    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.getWriter().append("Served at: ").append(request.getContextPath());
            System.out.println("RECEBI A REQUISIÇÃO GET!");
	}
   
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("cadastro.jsp");
            String mensagem;
            String nome = request.getParameter("nome");
            String telefone = request.getParameter("telefone");
            String usuario = request.getParameter("usuario");
            String senha = request.getParameter("senha");
            
            //SE ALGUM DOS CAMPOS ESTIVER VAZIO, O RESULTADO NÃO SERÁ MOSTRADO
            if (nome != null && !nome.isEmpty() &&
                telefone != null && !telefone.isEmpty() &&
                usuario != null && !usuario.isEmpty() &&
                senha != null && !senha.isEmpty()) {
                
                Cliente cliente = new Cliente(nome, telefone, usuario, senha);               
                cliente.salvar();
                                                 
                mensagem = "Usuário cadastrado com sucesso.";
                request.setAttribute("mensagem", mensagem);       
                dispatcher.forward(request, response);                
                
            } else {
                mensagem = "Preencha TODOS os campos.";
                request.setAttribute("mensagem", mensagem);                
                dispatcher.forward(request, response);
                
            }                
	}
}
