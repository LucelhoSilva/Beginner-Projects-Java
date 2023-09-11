import java.time.LocalDate;

public class Contato {
  private final String nome;
  private final String email;
  private final long telefone;
  private final LocalDate dataNascimento;

  public Contato(String nome, String email, long telefone, LocalDate dataNascimento) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.dataNascimento = dataNascimento;
  }

  // Métodos de acesso (getters)
  public String getNome() {
    return nome;
  }

  public String getEmail() {
    return email;
  }

  public long getTelefone() {
    return telefone;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }
}
