package Models;

import Models.Enderecos;
import Models.Medidas;
import Models.Mensalidade;
import Models.Personal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-23T14:40:01")
@StaticMetamodel(Aluno.class)
public class Aluno_ { 

    public static volatile SingularAttribute<Aluno, String> codigo;
    public static volatile SingularAttribute<Aluno, String> rgcpf;
    public static volatile SingularAttribute<Aluno, Personal> idPersonal;
    public static volatile SingularAttribute<Aluno, Enderecos> idEndereco;
    public static volatile SingularAttribute<Aluno, Mensalidade> idMensalidade;
    public static volatile SingularAttribute<Aluno, Integer> idAluno;
    public static volatile SingularAttribute<Aluno, String> celular;
    public static volatile SingularAttribute<Aluno, String> nome;
    public static volatile SingularAttribute<Aluno, Character> sexo;
    public static volatile SingularAttribute<Aluno, Medidas> idMedidas;

}