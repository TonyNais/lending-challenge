package io.lending.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "loans")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subscriber_id", nullable = false)
    private Subscriber subscriber;

    @Column(nullable = false)
    private BigDecimal principal;

    @Column
    private BigDecimal outStandingBalance;

    @Column(nullable = false)
    private String currency = "KSH";

}
