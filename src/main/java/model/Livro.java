package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Livro implements Serializable {

    private  static final long  serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String titulo;
    private String nome_autor;
    private String texto;
    @ManyToOne
    @JoinColumn
    private  Categoria categoria;

}
