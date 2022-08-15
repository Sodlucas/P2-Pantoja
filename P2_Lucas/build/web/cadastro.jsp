<%-- 
    Document   : registro
    Created on : 15 de ago de 2022, 08:59:02
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
        
        <!-- CSS FILE -->
        <link rel="stylesheet" href="./assets/css/style.css">
        
    </head>
    <body>
        <main class="cadastroMain">
            <h1>Esta é a página de Cadastro</h1>
        
            <form action="cadastrarCliente" method="post" class="Formulario">
                
                <p>
                    <label>Nome:</label><br>
                    <input id="input-name" type="text" name="nome"><br>
                </p>
            
                <p>
                    <label>Telefone:</label><br>
                    <input id="input-phone" type="text" name="telefone"><br>
                    </p>
                
                <p>
                    <label>Usuario:</label><br>
                    <input id="input-user" type="text" name="usuario"><br>
                </p>
            
                <p>                
                    <label>Senha:</label><br>
                    <input id="input-password" type="text" name="senha"><br>
                </p>
                
                <button>Cadastrar</button><br>
                
                <div>
                    <%
                        String mensagem = (String) request.getAttribute("mensagem");
                        if (mensagem != null)
                            out.print(mensagem);
                    %>
                </div>
                
                
            </form>
        </main>
    </body>
</html>