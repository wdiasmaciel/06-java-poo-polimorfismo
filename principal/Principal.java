package principal;

import pessoa.Pessoa;
import pessoa.PessoaFisica;

public class Principal {
  static int num = 1;

  public static void main(String[] args) {
    PessoaFisica pessoaFisica = new PessoaFisica();
    System.out.println(pessoaFisica.getIdentificacao());
    System.out.println(pessoaFisica.getIdentificacao("(xx)yaabbccdd"));

    pessoaFisica = new PessoaFisica("Iris", "123.456.789-00");
    System.out.println(pessoaFisica.getIdentificacao());
    System.out.println(pessoaFisica.getIdentificacao("(01)234567890"));

  }
}
