package com.biolab.sistemacontrolemateriais.entities;

import jakarta.persistence.*;

public class ControleMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Material;
    private int quantidade;
    private double valorUnitario;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public ControleMaterial() {}

    public ControleMaterial(String material, int quantidade, double valorUnitario, Categoria categoria) {
        Material = material;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.categoria = categoria;
    }

    public ControleMaterial(Long id, String material, int quantidade, double valorUnitario, Categoria categoria) {
        this.id = id;
        Material = material;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.categoria = categoria;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
