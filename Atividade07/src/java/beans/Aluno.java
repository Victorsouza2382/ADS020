/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import static java.lang.System.getProperty;
import static java.lang.System.setProperty;

/**
 *
 * @author victo
 */
public class Aluno implements Serializable{
    int matricula;
     String nome;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
    jsp
    :getProperty name = "aluno"
            + "property="
    matricula
    "/>
    
    <jsp
    :setProperty name = "aluno" property  = "matricula" value  = "2016100" /
            > <jsp
    :setProperty name = "aluno" property  = "nome" value  = "JOSE" / >
    
}
