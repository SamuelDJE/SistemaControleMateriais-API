package com.biolab.sistemacontrolemateriais.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "tb_material") // Aponta para a tabela certa
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome; // Mudado de nomeMaterial para nome para bater com o banco
    private int quantidade;
    @Column(name = "valor_unitario") // Garante o mapeamento da sublinha
    private BigDecimal valorUnitario;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @Column(name = "unidade_medida")
    private String unidadeMedida;



    public Material() {}

    public Material(Long id, String nome, int quantidade, BigDecimal valorUnitario, Categoria categoria, String unidadeMedida) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.categoria = categoria;
        this.unidadeMedida = unidadeMedida;
    }

    public Material(String nome, int quantidade, BigDecimal valorUnitario, Categoria categoria, String unidadeMedida) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.categoria = categoria;
        this.unidadeMedida = unidadeMedida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
}