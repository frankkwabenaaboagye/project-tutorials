package com.frankaboagye.connecthub.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * The Company entity represents a company in the system.
 * A company can post multiple jobs and maintain various details
 * such as contact information and a description.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Company {

    /**
     * The unique ID of the company.
     * Auto-generated by the database.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * The email of the company.
     * This must be unique across all companies in the system.
     */
    @Column(unique = true)
    private String email;

    /**
     * The name of the company.
     */
    private String name;

    /**
     * The phone number of the company.
     */
    private String phonenumber;

    /**
     * The website URL of the company.
     */
    private String website;

    /**
     * The password for the company's account.
     */
    private String password;

    /**
     * The file name of the company's profile picture.
     */
    private String profilepicturename;

    /**
     * A brief description of the company, including its services and values.
     */
    private String description;

    /**
     * The address of the company.
     */
    private String address;

    /**
     * The list of jobs posted by the company.
     * A company can have multiple jobs associated with it.
     * <ul>
     *     <li>Each job is linked to the company via a foreign key.</li>
     *     <li>CascadeType.ALL ensures that any operation (save, delete, etc.)
     *     performed on the company will also be applied to the jobs.</li>
     *     <li>orphanRemoval = true ensures that if a job is removed from
     *     this list, it will also be deleted from the database.</li>
     * </ul>
     */
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Job> jobs = new ArrayList<>();
}
