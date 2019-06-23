package Models;

import Models.Aluno;
import Models.Treino;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-23T14:40:01")
@StaticMetamodel(Mensalidade.class)
public class Mensalidade_ { 

    public static volatile SingularAttribute<Mensalidade, String> codigo;
    public static volatile SingularAttribute<Mensalidade, Date> dataPagamento;
    public static volatile CollectionAttribute<Mensalidade, Aluno> alunoCollection;
    public static volatile SingularAttribute<Mensalidade, Integer> idMensalidade;
    public static volatile SingularAttribute<Mensalidade, Float> valor;
    public static volatile SingularAttribute<Mensalidade, Treino> idTreino;
    public static volatile SingularAttribute<Mensalidade, Boolean> pago;

}