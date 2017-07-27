package br.com.projetoloja.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.projetoloja.models.Marca;

public class MarcaValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Marca.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "descricao", "field.required");
	}

}
