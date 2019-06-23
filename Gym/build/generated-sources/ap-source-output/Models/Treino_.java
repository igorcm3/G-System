package Models;

import Models.Mensalidade;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-23T14:40:01")
@StaticMetamodel(Treino.class)
public class Treino_ { 

    public static volatile CollectionAttribute<Treino, Mensalidade> mensalidadeCollection;
    public static volatile SingularAttribute<Treino, String> codigo;
    public static volatile SingularAttribute<Treino, String> diasSemana;
    public static volatile SingularAttribute<Treino, Integer> quantidadeSemana;
    public static volatile SingularAttribute<Treino, Integer> idTreino;
    public static volatile SingularAttribute<Treino, String> nome;
    public static volatile SingularAttribute<Treino, String> descricao;

}