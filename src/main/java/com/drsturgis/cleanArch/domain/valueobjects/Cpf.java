package com.drsturgis.cleanArch.domain.valueobjects;

import com.drsturgis.cleanArch.domain.exception.InvalidCpfException;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cpf {
    private String cpf;
    private static final Pattern CPF_REGEX_VALID = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$", Pattern.CASE_INSENSITIVE);

    Cpf(){}
    public Cpf(String cpf) throws InvalidCpfException {
        this.cpf = cpf;
        Matcher matcher = CPF_REGEX_VALID.matcher(cpf);

        if (!matcher.find()) {
            throw new InvalidCpfException();
        }

    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cpf cpf1 = (Cpf) o;
        return Objects.equals(cpf, cpf1.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Cpf{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
