package br.com.projetoloja.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.projetoloja.models.Funcionario;

public class FuncionarioValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Funcionario.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "cpf", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "data_nascimento", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "nome", "field.required");
		ValidationUtils.rejectIfEmpty(errors, "salario", "field.required");
	}

}
