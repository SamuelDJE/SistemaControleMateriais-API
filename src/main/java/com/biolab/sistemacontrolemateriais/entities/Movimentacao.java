package com.biolab.sistemacontrolemateriais.entities;
import com.biolab.sistemacontrolemateriais.entities.TipoMovimentacao;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_movimentacao")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Guardando apenas o ID do material, sem frescura de relacionamento complexo
    @Column(name = "material_id", nullable = false)
    private Long materialId;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_movimentacao")
    private TipoMovimentacao tipoMovimentacao;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(name = "data_movimentacao", nullable = false)
    private LocalDateTime dataMovimentacao;

    // Construtores
    public Movimentacao() {}

    public Movimentacao(Long materialId, TipoMovimentacao tipoMovimentacao, Integer quantidade, LocalDateTime dataMovimentacao) {
        this.materialId = materialId;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.dataMovimentacao = dataMovimentacao;
    }

    public Movimentacao(Long id, Long materialId, TipoMovimentacao tipoMovimentacao, Integer quantidade, LocalDateTime dataMovimentacao) {
        this.id = id;
        this.materialId = materialId;
        this.tipoMovimentacao = tipoMovimentacao;
        this.quantidade = quantidade;
        this.dataMovimentacao = dataMovimentacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDateTime dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }
}