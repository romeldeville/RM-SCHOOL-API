package rm_school_api.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SuperBuilder;

import java.math.BigDecimal;

import java.time.LocalDateTime;

@Entity
@Table(name = "PAIEMENT")
@AttributeOverride(name = "id", column = @Column(name = "ID_PAIEMENT"))
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class Paiement extends AbstractEntity {

    @NotBlank(message = "le motif ne doit pas être vide")
    @Size(max = 255, message = "le motif ne doit pas dépasser 255 caractères")
    @Column(name = "MOTIF", nullable = false, length = 255)
    private String motif;

    @Column(name = "DATE_PAIEMENT")
    private LocalDateTime datePaiement;

    @NotNull(message = "le montant est obligatoire")
    @PositiveOrZero(message = "le montant doit être positif ou nul")
    @Column(name = "MONTANT", nullable = false, precision = 15, scale = 2)
    private BigDecimal montant;

    @Size(max = 10, message = "la devise ne doit pas dépasser 10 caractères")
    @Column(name = "DEVISE", length = 10)
    private String devise;

    @NotNull(message = "l'inscription est obligatoire")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_INSCRIPTION", nullable = false)
    private Inscription inscription;
}
