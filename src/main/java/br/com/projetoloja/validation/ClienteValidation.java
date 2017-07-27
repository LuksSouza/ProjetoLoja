package br.com.projetoloja.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.projetoloja.models.Cliente;

public class ClienteValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Cliente.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "cpf", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "data_nascimento", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "nome", "field.required");
	}

}
