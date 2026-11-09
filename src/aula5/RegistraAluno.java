package aula5;

public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorEstudante;

    // Retorna o nome do estudante
    public String getNome() {
      return nome;
    };

    // Atribui o nome do estudante.
    public void setNome(String temp) {
        nome = temp;
    }

    // Retorna o endereço do estudante.
    public String getEndereco() {
        return endereco;
    }

    // Atribui o endereço do estudante
    public void setEndereco(String temp) {
        endereco = temp;
    }


    // Retorna idade do estudante.
    public int getIdade(){
        return idade;
    }

    // Atribui a idade do estudante.
    public void setIdade(int temp){
        idade = temp;
    }

    // Atribui nota de Matemática.
    public void setNotaMatematica(double temp){
        notaMatematica = temp;
    }

    //Atribui nota de Português.
    public void setNotaPortugues(double temp){
        notaPortugues = temp;
    }

    //Atribui nota de Geografia.
    public void setNotaGeografia(double temp){
        notaGeografia = temp;
    }

    // Retorna média do estudante.
    public double getMedia() {
        return (notaMatematica + notaPortugues + notaGeografia) / 3;
    }

    // Retorna quantidade de alunos.
    public static int getQuantidadeAlunos(){
        return contadorEstudante;
    }


}
