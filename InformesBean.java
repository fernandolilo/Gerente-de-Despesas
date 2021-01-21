package model.bean;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rcell Asus
 */
public class InformesBean {
   

    private int Id;
    private int Id_Relatorio;
    private String cpf;
    private String Tipo;
    private double Vtnf;
    private double ValorAp;
    private String Data;
    private double Saldo;
    private double Fatura;
    private double ValorTap;
    private double ValotTNF;
    private String Funcionario;
    private String Justificativa;
    private String Gestor;
    private String Aprovacao;
    private int Sefaz;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getId_Relatorio() {
        return Id_Relatorio;
    }

    public void setId_Relatorio(int Id_Relatorio) {
        this.Id_Relatorio = Id_Relatorio;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getVtnf() {
        return Vtnf;
    }

    public void setVtnf(double Vtnf) {
        this.Vtnf = Vtnf;
    }

    public double getValorAp() {
        return ValorAp;
    }

    public void setValorAp(double ValorAp) {
        this.ValorAp = ValorAp;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getFatura() {
        return Fatura;
    }

    public void setFatura(double Fatura) {
        this.Fatura = Fatura;
    }

    public double getValorTap() {
        return ValorTap;
    }

    public void setValorTap(double ValorTap) {
        this.ValorTap = ValorTap;
    }

    public double getValotTNF() {
        return ValotTNF;
    }

    public void setValotTNF(double ValotTNF) {
        this.ValotTNF = ValotTNF;
    }

    public String getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(String Funcionario) {
        this.Funcionario = Funcionario;
    }

    public String getJustificativa() {
        return Justificativa;
    }

    public void setJustificativa(String Justificativa) {
        this.Justificativa = Justificativa;
    }

    public String getGestor() {
        return Gestor;
    }

    public void setGestor(String Gestor) {
        this.Gestor = Gestor;
    }

    public String getAprovacao() {
        return Aprovacao;
    }

    public void setAprovacao(String Aprovacao) {
        this.Aprovacao = Aprovacao;
    }

    public int getSefaz() {
        return Sefaz;
    }

    public void setSefaz(int Sefaz) {
        this.Sefaz = Sefaz;
    }

    
}