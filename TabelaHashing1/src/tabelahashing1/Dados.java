/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelahashing1;

import java.util.*;

public class Dados {

    public Hashtable CadAluno;
    public Hashtable CadCurso;
    public Hashtable CadMatricula;

    public Dados() {
        CadAluno = new Hashtable();
        CadCurso = new Hashtable();
        CadMatricula = new Hashtable();

    }

    public void GravaDados(Curso x) {
        CadCurso.put(x.CódCurso, x);
    }

    public void GravaDados(Aluno x) {
        CadAluno.put(x.CódAluno, x);
    }

    public void GravaDados(Matricula x) {
        CadMatricula.put(x.NumMatricula, x);
    }

    public void ListaMatricula() {
        Set<String> SetOfMatriculas = CadMatricula.keySet();
        for (String ChaveMatricula : SetOfMatriculas) {
            Matricula xMat = (Matricula) CadMatricula.get(ChaveMatricula);
            System.out.printf("Número da Matricula: 51$s -Data:%2$s\n",
                    xMat.NumMatricula, xMat.DataMatricula);
            Aluno xAlu = (Aluno) CadAluno.get(xMat.CódAluno);
            System.out.printf("Aluno: %1$s", xAlu.NomeAluno);
            Curso xCur = (Curso) CadCurso.get(xMat.CódCurso);
            System.out.printf("Curso: %1$s", xCur.NomeCurso);

        }
    }
}
