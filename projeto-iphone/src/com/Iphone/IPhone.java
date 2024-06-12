package com.Iphone;

import com.AparelhoTelefone.AparelhoTelefonico;
import com.NavegadorInternet.NavegadorInternet;
import com.ReprodutorMusical.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
	 @Override
	    public void tocar() {
	        System.out.println("Reproduzindo música...");
	    }

	    @Override
	    public void pausar() {
	        System.out.println("Música pausada.");
	    }

	    @Override
	    public void selecionarMusica(String musica) {
	        System.out.println("Selecionando a música: " + musica);
	    }

	    // Métodos da interface AparelhoTelefonico
	    @Override
	    public void ligar(String numero) {
	        System.out.println("Ligando para: " + numero);
	    }

	    @Override
	    public void atender() {
	        System.out.println("Atendendo a chamada.");
	    }

	    @Override
	    public void iniciarCorreioVoz() {
	        System.out.println("Iniciando correio de voz.");
	    }

	    // Métodos da interface NavegadorInternet
	    @Override
	    public void exibirPagina(String url) {
	        System.out.println("Exibindo a página: " + url);
	    }

	    @Override
	    public void adicionarNovaAba() {
	        System.out.println("Adicionando nova aba.");
	    }

	    @Override
	    public void atualizarPagina() {
	        System.out.println("Atualizando a página.");
	    }
	
}
