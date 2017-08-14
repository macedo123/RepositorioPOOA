/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Pessoa {
    private String nome, Sexo,  Descricao;
    private int FaixaIdade;
    private List<String> Preferencias;

    public Pessoa(){
        this.Preferencias = new ArrayList<>();
    }
    
    public Pessoa(String nome, String Sexo, int FaixaIdade, String Descricao) {
        this.nome = nome;
        this.Sexo = Sexo;
        this.FaixaIdade = FaixaIdade;
        this.Descricao = Descricao;
        this.Preferencias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getFaixaIdade() {
        return FaixaIdade;
    }

    public void setIdade(int FaixaIdade) {
        this.FaixaIdade = FaixaIdade;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public List<String> getPreferencias() {
        return Preferencias;
    }

    public void setPreferencias(List<String> Preferencias) {
        this.Preferencias = Preferencias;
    }
    
    
    
    
}