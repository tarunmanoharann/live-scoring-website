package com.live.backend.models;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "personal_access_tokens") // Replace 'personal_access_tokens' with the actual table name if different

public class PersonalAccessTokens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tokenable_type", length = 255, nullable = false)
    private String tokenable_type;

    @Column(name = "tokenable_id", nullable = false)
    private Long tokenable_id;

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "token", length = 64, nullable = false)
    private String token;

    @Column(name = "abilities", columnDefinition = "TEXT", nullable = true)
    private String abilities;

    @Column(name = "last_used_at", nullable = true)
    private Timestamp last_used_at;

    @Column(name = "expires_at", nullable = true)
    private Timestamp expires_at;

    @Column(name = "created_at", nullable = true)
    private Timestamp created_at;

    @Column(name = "updated_at", nullable = true)
    private Timestamp updated_at;

}
