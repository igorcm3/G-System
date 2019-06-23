package Models;

import Models.Aluno;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-23T14:40:01")
@StaticMetamodel(Medidas.class)
public class Medidas_ { 

    public static volatile SingularAttribute<Medidas, String> busto;
    public static volatile SingularAttribute<Medidas, String> panturrilha;
    public static volatile SingularAttribute<Medidas, String> cintura;
    public static volatile SingularAttribute<Medidas, String> peitoral;
    public static volatile SingularAttribute<Medidas, String> quadril;
    public static volatile SingularAttribute<Medidas, Float> pctGordura;
    public static volatile SingularAttribute<Medidas, String> peso;
    public static volatile CollectionAttribute<Medidas, Aluno> alunoCollection;
    public static volatile SingularAttribute<Medidas, String> altura;
    public static volatile SingularAttribute<Medidas, String> braco;
    public static volatile SingularAttribute<Medidas, String> coxa;
    public static volatile SingularAttribute<Medidas, Integer> idMedidas;

}