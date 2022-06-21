
package com.mycompany.javagit2;
import java.util.Scanner;

public class JavaGit2 {

    public static void main(String[] args) {
        Reclamacao rec = new Reclamacao();
        rec.pessoa1 = "Rodrigo";
        rec.cpf = "22759815292";      
        rec.doenca1 = "Dengue";
        rec.doenca2 = "Zika";
        rec.regNome();
        rec.regCpf(cpf);
        rec.regDoenca(doenca);
        
               
                        
        // alterando os valores
        rec.pessoa1 = "Rodrigo";
        rec.cpf = "22759815294";
        System.out.println("Nome alterado " + rec.pessoa1);
        System.out.println("CPF alterado " + rec.cpf);
         
        
    }
    
    //CLASSE RECLAMAÇÃO
    
    package com.mycompany.javagit2;

public class Reclamacao {
    public String cpf;
    public String pessoa1;
    public String doenca1;
    public String doenca2;
    
    
    public void regNome(String pessoa1) {
    this.pessoa1 = pessoa1;
        
    }
    public void regCpf(String cpf){
        this.cpf = cpf;
    }
    public void regDoenca(String doenca){
        this.doenca1 = doenca1;
    }

}
    
    /* ANTERIOR
    
    public static void menu(){
        System.out.println("\nReclamações ");
        System.out.println("1. Registrar ");
        System.out.println("2. Consultar");
        System.out.println("3. Sair ");
    }
        
    
    public void registrar(){
    int x, id;
    String nome;
    Reclamacao r1 = new Reclamacao();
    
    Nome nome = new Nome();
    System.out.println("Insira seu nome: ");
    Scanner nome = Scanner(System.in);
    String nome = reg1.next();
    
    Cpf cpf = new Cpf();
    System.out.println("Insira seu cpf: ");
    Scanner id = Scanner(System.in);
    String cpf = id.next();
   
    Doenca doenca = new Doenca();
        System.out.println("Qual a doença: ");    
        Scanner reg2 = Scanner(System.in);
        String doenca = reg2.next();
    
}
        */
    
    
    //==============================
    
    /* INSERÇÃO NO BANCO -  FALTA INTERLIGAR 
    
    package com.mycompany.java_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Java_MySql {
//ic class Conexao{
    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/cadastro", "root", "");
            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM CLIENTE");
            while (rsCliente.next()){
                System.out.println("Nome: " + rsCliente.getString("Nome"));
            }
        } catch (ClassNotFoundException ex){
            System.out.println("Driver do banco não localizado");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco");
        }finally {
            if (conexao != null){
                conexao.close();
            }
        }
        
        
        
    }
}
    
    
    */
    
}
