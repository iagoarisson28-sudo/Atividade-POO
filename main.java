class Aluno {
    // Atributos
    String  nome;
    double nota1, nota2;

    // Construtor
    Aluno(String n, double n1, double n2){
        nome = n;
        nota1 = n1;  nota2 = n2;
    }

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void apresentar() {
        System.out.println(nome + ": " + calcularMedia());
    }
}

class Main {
  public static void main(String[] args){

    // Criando objetos
    Aluno a1 = new Aluno("João", 8.0, 7.5);
    Aluno a2 = new Aluno("Maria", 9.5, 10.0);
    Aluno a3= new Aluno("zeca", 9.0, 10.0);
    Aluno a4 = new Aluno("joao", 5.0, 10.0);

    // Acessando atributos
    System.out.println(a1.nome);
    System.out.println(a2.nota1);
    System.out.println(a3.nome);
    System.out.println(a4.nota1);

    // Chamando métodos
    a1.apresentar();
    a2.apresentar();
    a3.apresentar();
    a4.apresentar();


    double m = a1.calcularMedia();
    double m2 = a2.calcularMedia();
    double m3 = a3.calcularMedia();
    double m4 = a4.calcularMedia();
    System.out.println("Média: " + m);
    System.out.println("Média: " + m2);
    System.out.println("Média: " + m3);
    System.out.println("Média: " + m4);
  }
}