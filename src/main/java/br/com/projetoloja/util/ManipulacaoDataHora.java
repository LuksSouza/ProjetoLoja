package br.com.projetoloja.util;

import java.util.Date;

public class ManipulacaoDataHora {
	
	public static String formatarData(Date data) {
		return data.getDay() + "/" + data.getMonth() + "/" + data.getYear();
	}

}
