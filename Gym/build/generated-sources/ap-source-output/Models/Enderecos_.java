package Models;

import Models.Aluno;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-23T14:40:01")
@StaticMetamodel(Enderecos.class)
public class Enderecos_ { 

    public static volatile SingularAttribute<Enderecos, String> uf;
    public static volatile SingularAttribute<Enderecos, String> codigo;
    public static volatile SingularAttribute<Enderecos, String> cidade;
    public static volatile SingularAttribute<Enderecos, String> complemento;
    public static volatile SingularAttribute<Enderecos, String> endereco;
    public static volatile SingularAttribute<Enderecos, String> numero;
    public static volatile CollectionAttribute<Enderecos, Aluno> alunoCollection;
    public static volatile SingularAttribute<Enderecos, Integer> idEndereco;
    public static volatile SingularAttribute<Enderecos, String> referencia;
    public static volatile SingularAttribute<Enderecos, String> cep;

}