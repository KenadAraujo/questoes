package com.polligonalApps.cadastroms.model;

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

    @Column(name = "DATA_ACESSO")
    private LocalDateTime dataAcesso;

    @ManyToOne
    @JoinColumn(name = "USUARIO_ID",nullable = false)
    private Usuario usuario;
}
