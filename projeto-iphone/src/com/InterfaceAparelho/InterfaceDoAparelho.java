package com.InterfaceAparelho;

import com.Iphone.IPhone;

public class InterfaceDoAparelho {
	public static void main(String[] args) {
	IPhone meuIphone = new IPhone();
    
    // Testando ReprodutorMusical
    meuIphone.tocar();
    meuIphone.pausar();
    meuIphone.selecionarMusica("Imagine");

    // Testando AparelhoTelefonico
    meuIphone.ligar("123-456-7890");
    meuIphone.atender();
    meuIphone.iniciarCorreioVoz();

    // Testando NavegadorInternet
    meuIphone.exibirPagina("https://www.example.com");
    meuIphone.adicionarNovaAba();
    meuIphone.atualizarPagina();
}
}
