package oo.composicao;

public class CursoTeste {

    public static void main (String[] args){

        Aluno aluno1 = new Aluno("sr. Watason");
        Aluno aluno2 = new Aluno("sr. MaRudolf");
        Aluno aluno3 = new Aluno("sr. Sherlock");

        Curso curso1 = new Curso("Primeiros passos aos 20 para calvice");
        Curso curso2 = new Curso("Técnica de bombas muscularés e tapas supremes");
        Curso curso3 = new Curso("Táticas de investigação nivel primordial e como lidar com calvos");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno3);

        curso3.adicionarAluno(aluno3);
        curso3.adicionarAluno(aluno3);

        for(Aluno aluno: curso2.alunos){
            System.out.println("Estou matriculado em " + curso2.nome);
            System.out.println("e meu nome é " + aluno.nome);
        }

        Curso cursoEncontrado = aluno1.getCursoPorNome("Primeiros passos aos 20 para calvice");

        if (cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }

    }
}
