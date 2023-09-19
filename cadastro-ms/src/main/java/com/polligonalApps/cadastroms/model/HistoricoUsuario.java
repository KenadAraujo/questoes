package com.polligonalApps.cadastroms.model;

import com.polligonalApps.cadastroms.model.constants.TipoMovimentacao;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "HISTORICO_USUARIO")
public class HistoricoUsuario {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_ACESSO")
    private LocalDateTime dataAcesso;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_MOVIMENTACAO")
    private TipoMovimentacao tipoMovimentacao;

    @ManyToOne
    @JoinColumn(name = "USUARIO_ID",nullable = false)
    private Usuario usuario;

    public HistoricoUsuario(TipoMovimentacao tipoMovimentacao, Usuario usuario) {
        this.dataAcesso = LocalDateTime.now();
        this.tipoMovimentacao = tipoMovimentacao;
        this.usuario = usuario;
    }
}
