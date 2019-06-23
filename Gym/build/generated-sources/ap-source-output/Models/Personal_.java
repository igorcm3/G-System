package Models;

import Models.Aluno;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-23T14:40:01")
@StaticMetamodel(Personal.class)
public class Personal_ { 

    public static volatile SingularAttribute<Personal, String> codigo;
    public static volatile SingularAttribute<Personal, String> rgcpf;
    public static volatile SingularAttribute<Personal, Integer> idPersonal;
    public static volatile CollectionAttribute<Personal, Aluno> alunoCollection;
    public static volatile SingularAttribute<Personal, String> nome;
    public static volatile SingularAttribute<Personal, String> descricao;

}