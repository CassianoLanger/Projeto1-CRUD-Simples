package br.com.clanger.program;

import javax.swing.JOptionPane;

import br.com.clanger.dao.ClienteMapDAO;
import br.com.clanger.dao.IClienteDAO;

public class Main {

	private static IClienteDAO iClienteDAO;

	public static void main(String[] args) {
		iClienteDAO = new ClienteMapDAO();

		String opcao = JOptionPane.showInputDialog(null,
				"Digite 1 para cadastro, 2 �ra consultar, 3 para exclus�o, 4 para altera��o ou 5 para sair", "Cadastro",
				JOptionPane.INFORMATION_MESSAGE);

		while (!isOpcaoValida(opcao)) {
			if (opcao.equals("")) {
				sair();
			}
			opcao = JOptionPane.showInputDialog(null,
					"Digite 1 para cadastro, 2 para consultar, 3 para exclus�o, 4 para altera��o ou 5 para sair", "Cadastro",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		while(isOpcaoValida(opcao)) {
			if(isOpcaoSair(opcao)) {
				sair();
			}
		}

		if (isOpcaoCadastrada(opcao)) {
			JOptionPane.showMessageDialog(null, "Op��o: " + opcao, "ERROR", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private static boolean isOpcaoSair(String opcao) {
		if(opcao.equals("5")) {
			return true;
		} else {
			return false;
		}
	}

	private static void sair() {
		JOptionPane.showMessageDialog(null,  "At� logo ", "Sair", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}

	private static boolean isOpcaoValida(String opcao) {
		if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4") || opcao.equals("5")) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isOpcaoCadastrada(String opcao) {
		if (opcao.equals("1")) {
			return true;
		} else {
			return false;
		}
	}

}
