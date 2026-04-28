package POO.Test;

import POO.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "th";
        estudante.idade = 15;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
